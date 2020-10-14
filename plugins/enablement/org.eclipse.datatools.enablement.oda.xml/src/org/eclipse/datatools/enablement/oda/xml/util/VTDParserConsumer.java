package org.eclipse.datatools.enablement.oda.xml.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.eclipse.datatools.enablement.oda.xml.Constants;
import org.eclipse.datatools.enablement.oda.xml.util.MappedTables.Column;
import org.eclipse.datatools.enablement.oda.xml.util.MappedTables.Table;

import com.ximpleware.AutoPilot;
import com.ximpleware.VTDNav;

public class VTDParserConsumer implements ISaxParserConsumer {

	private static final int INVALID_COLUMN_INDEX = -1;

	// The SaxParser this instance dealing with.
	// private SaxParser sp;

	// The thread which hosts the sp.
	// private Thread spThread;

	// The names of nested xml columns
	private String[] namesOfNestedColumns;

	private String[] namesOfColumns;
	// To accelerate finding index from column name
	private Map nameIndexMap;

	// The name of a table.
	private String tableName;

	private MappingPathElementTree mappingPathElementTree;

	private MappedTables mappedTables;

	private RelationInformation relationInfo;

	private SaxParserNestedQueryHelper spNestedQueryHelper;

	VTDNav vtdNav;
	// List<Row>: The detected but not filled yet rows, managed and accessed
	// only by XML parsing thread
	private List processingRows = new ArrayList();

	// List<Row>: filled rows, managed and accessed only be XML parsing thread
	private List filledRows = new ArrayList(Constants.CACHED_RESULT_SET_LENGTH);

	// valid filled rows which are prepared by XML parsing thread and consumed
	// by main thread
	private PreparedRowsValues prv = new PreparedRowsValues();

	private boolean isContainRowFilter = false;

	public String[] getRowValue() {
		return prv.getCurrentRowValues();
	}

	/**
	 * 
	 * @param rs
	 * @param rinfo
	 * @param fileName
	 * @param tName
	 * @throws OdaException
	 */
	public VTDParserConsumer(MappedTables mapTables, RelationInformation rinfo, XMLSourceFromPath xmlSource,
			String tName) throws OdaException {
		tableName = tName;
		mappedTables = mapTables;
		relationInfo = rinfo;

		this.namesOfNestedColumns = relationInfo.getTableNestedXMLColumnNames(tableName);

		this.namesOfColumns = relationInfo.getTableRealColumnNames(tableName);
		nameIndexMap = new HashMap();
		for (int i = 0; i < namesOfColumns.length; i++) {
			nameIndexMap.put(namesOfColumns[i], Integer.valueOf(i));
		}

		mappingPathElementTree = relationInfo.getTableMappingPathElementTree(tableName);

		if (namesOfNestedColumns.length > 0) {
			/*VTDParserNestedQueryHelper firstspNestedQueryHelper = new VTDParserNestedQueryHelper(this, rinfo, xmlSource,
					tName);*/
		}

		if (relationInfo.getTableFilter(tableName) != null && !relationInfo.getTableFilter(tableName).isEmpty()) {
			isContainRowFilter = true;
			// switch from ArrayList to LinkedList because of the possibility of
			// remove operations
			filledRows = new LinkedList();
		}
		vtdNav = xmlSource.loadDocument();
	}

	public void manipulateData(XMLPath path, String value) {
		for (int i = 0; i < processingRows.size(); i++) {
			Row row = (Row) processingRows.get(i);
			fillNotNestColumn(row, path, value);
		}
	}

	private void fillNotNestColumn(Row row, XMLPath column, String value) {
		if (mappingPathElementTree != null) {
			int[] indexes = mappingPathElementTree.getMatchedButNotNestedColumnIndexs(column, row.path);
			for (int i = 0; i < indexes.length; i++) {
				int index = indexes[i];
				if (namesOfColumns[index].startsWith(SaxParserUtil.TEMPCOLUMNNAMEPREFIX)) {
					row.values[index] = value;
				} else if (namesOfColumns[index].startsWith(SaxParserUtil.ROOTTEMPCOLUMNNAMEPREFIX)) {
					if (row.values[index] == null)
						row.values[index] = value;
				} else if (row.values[index] == null && isColumnValid(namesOfColumns[index], row))
					row.values[index] = value;
			}
		}
	}

	/**
	 * @param columnName
	 * @return
	 */
	private boolean isColumnValid(String columnName, Row row) {
		HashMap filters = relationInfo.getTableColumnFilter(tableName, columnName);
		if (filters == null)
			return true;
		else {
			Iterator it = filters.keySet().iterator();
			while (it.hasNext()) {
				Object filterColumnName = it.next();
				Object value = filters.get(filterColumnName);
				if (!SaxParserUtil.isTwoValueMatch(value,
						row.values[this.getColumnIndex(filterColumnName.toString())])) {
					return false;
				}
			}
			return true;
		}
	}

	private void fillNestColumns(Row row) {
		for (int i = 0; i < namesOfNestedColumns.length; i++) {
			int j = getColumnIndex(namesOfNestedColumns[i]);
			if (j != INVALID_COLUMN_INDEX) {
				HashMap filters = relationInfo.getTableColumnFilter(tableName, namesOfNestedColumns[i]);
				row.values[j] = this.spNestedQueryHelper.getNestedColumnValue(row.path, j, filters);
			}
		}
	}

	public void startElement(XMLPath path) {
		if (mappingPathElementTree != null) {
			if (mappingPathElementTree.matchesTablePath(path)) {
				Row newRow = new Row(path);
				processingRows.add(newRow);
				filledRows.add(newRow);
			}
		}

	}

	public void endElement(XMLPath path) {
		if (processingRows.size() > 0 && ((Row) processingRows.get(processingRows.size() - 1)).path.equals(path)) {
			// a row ends
			Row row = (Row) processingRows.get(processingRows.size() - 1);
			fillNestColumns(row);
			row.isFilled = true;
			if (isRowValid(row)) {
				// suspendIfNecessary( );
			} else {
				filledRows.remove(row);
			}
			processingRows.remove(processingRows.size() - 1);
		}

	}

	/*
	 * private void suspendIfNecessary( ) { Iterator itr = filledRows.iterator(
	 * ); int count = 0; while ( itr.hasNext( ) ) { Row row = (Row)itr.next( );
	 * if ( !row.isFilled ) { //some rows still not filled yet return; }
	 * count++; } //All cached rows are filled and cache count reaches or
	 * already exceeds max limit if ( count >=
	 * Constants.CACHED_RESULT_SET_LENGTH ) { suspendParsingThread( ); } }
	 */

	/*
	 * private void moveFilledToPrepared() { String[][] result = new
	 * String[filledRows.size()][]; Iterator itr = filledRows.iterator(); int
	 * index = 0; while (itr.hasNext()) { Row row = (Row) itr.next();
	 * result[index++] = row.values; } filledRows.clear(); prv.refresh(result);
	 * }
	 */

	/*
	 * private void suspendParsingThread( ) { moveFilledToPrepared( ); //active
	 * main thread synchronized (this) { this.notifyAll(); } synchronized ( sp )
	 * { try { //wait until notified by main thread sp.wait( ); } catch (
	 * InterruptedException e ) { //just ignore } } }
	 */

	/**
	 * Apply the filter to row.
	 * 
	 */
	private boolean isRowValid(Row row) {
		if (!isContainRowFilter) {
			return true;
		}

		Iterator itr = relationInfo.getTableFilter(tableName).keySet().iterator();
		while (itr.hasNext()) {
			String columnName = (String) itr.next();
			if (isCurrentColumnValueNotMatchFilterValue(columnName, row))

			{
				return false;
			}

		}
		return true;
	}

	private boolean isCurrentColumnValueNotMatchFilterValue(String columnName, Row row) {
		int index = this.getColumnIndex(columnName);
		return !SaxParserUtil.isTwoValueMatch(relationInfo.getTableFilter(tableName).get(columnName),
				row.values[index]);
	}

	public int getColumnIndex(String columnName) {
		Object index = nameIndexMap.get(columnName);
		if (index == null) {
			return INVALID_COLUMN_INDEX;
		} else {
			return ((Integer) index).intValue();
		}
	}

	/**
	 * Make the cursor forward. If the end of data reached then return false.
	 * 
	 * @return
	 * @throws OdaException
	 */
	public boolean next() throws OdaException {
		if (!prv.isPrepared()) {
			preparedData();
		}
		return prv.next();
	}

	private void preparedData() {
		try {
			AutoPilot ap = new AutoPilot();
			ap.bind(vtdNav);
			Iterator it = mappedTables.getTables().iterator();
			ArrayList listMapRows = new ArrayList();
			int index = 0, cursor;
			VTDNav cloneNav;
			while (it.hasNext()) {
				Table t = (Table) it.next();
				String tablePath = t.getRowPath();
				ap.selectXPath(tablePath);
				while ((cursor = ap.evalXPath()) != -1) {
					String[] rowValues = new String[t.getColumns().length];
					for (int j = 0; j < t.getColumns().length; j++) {
						Column c = t.getColumns()[j];
						String columnXpath = c.getPath();
						if(columnXpath.contains("../")){
							String[] paths = columnXpath.split("../");
							int levelParent = paths.length - 1;
							// copy cursor goto parents corresponds
							cloneNav = vtdNav.cloneNav();
							for (int i = 0; i < levelParent; i++) {
								cloneNav.toElement(VTDNav.PARENT);
							}
							String realPath = paths[levelParent];
							cloneNav.toElement(VTDNav.FIRST_CHILD, realPath);
							int txt = cloneNav.getText();
							String text = txt != -1 ? cloneNav.toNormalizedString(txt) : "";
							if (text != null) {
								rowValues[j] = text;
							}
						}else{
							cloneNav = vtdNav.cloneNav();
							boolean toElement = cloneNav.toElement(VTDNav.FIRST_CHILD, columnXpath.replace("/", ""));
							int txt = cloneNav.getText();
							String text = toElement ? "" : "";
							if(txt != -1){
								text = cloneNav.toNormalizedString(txt);
							}
							if (text != null) {
								rowValues[j] = text;
							}
							cloneNav.toElement(VTDNav.PARENT);
						}
					}
					listMapRows.add(rowValues);
				}
			}
			if (listMapRows.size() > 0) {
				prv.refresh(listMapRows, true);
				vtdNav.toElement(VTDNav.ROOT);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.datatools.enablement.oda.xml.util.ISaxParserConsumer#finish()
	 */
	public void finish() {
		/*
		 * moveFilledToPrepared(); // active main thread synchronized (this) {
		 * this.notifyAll(); }
		 */
	}

	/**
	 * Close the SaxParserConsumer.
	 * 
	 */
	public void close() {
		// end thread parsing thread
		/*
		 * while ( spThread.isAlive() ) { //active XML parsing thread if it's
		 * still suspended synchronized ( sp ) { sp.notifyAll( ); }
		 * sp.stopParsing( ); }
		 */
	}

	/**
	 * Prepared by XML parsing thread and consumed by main thread
	 */
	private static class PreparedRowsValues {

		private ArrayList values = new ArrayList();
		private int index = -1;
		private boolean prepared = false;

		public void refresh(ArrayList values, boolean prepared) {
			index = -1;
			this.values = values == null ? (new ArrayList()) : values;
			this.prepared = prepared;
		}

		public boolean next() {
			index++;
			return index < values.size();
		}

		public String[] getCurrentRowValues() {
			if (index >= 0 && index < values.size()) {
				return (String[]) values.get(index);
			}
			return null;
		}

		public int size() {
			return values.size();
		}

		public boolean isPrepared() {
			return prepared;
		}
	}

	private class Row {
		public XMLPath path;
		public String[] values;
		public boolean isFilled;

		public Row(XMLPath path) {
			this.path = path;
			values = new String[relationInfo.getTableRealColumnNames(tableName).length];
			Arrays.fill(values, null);
			isFilled = false;
		}
	}

}
