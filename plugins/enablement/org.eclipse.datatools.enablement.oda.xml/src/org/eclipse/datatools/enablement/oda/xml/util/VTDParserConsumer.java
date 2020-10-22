/*
 * (c) Copyright 2001-2020 PRODAXIS, S.A.S. All rights reserved.
 * PRODAXIS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.eclipse.datatools.enablement.oda.xml.util;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.eclipse.datatools.enablement.oda.xml.util.MappedTables.Column;
import org.eclipse.datatools.enablement.oda.xml.util.MappedTables.Table;

import com.ximpleware.AutoPilot;
import com.ximpleware.VTDNav;

public class VTDParserConsumer {

	private MappedTables mappedTables;
	VTDNav vtdNav;
	private PreparedRowsValues prv = new PreparedRowsValues();

	public String[] getRowValue() {
		return prv.getCurrentRowValues();
	}

	public VTDParserConsumer(MappedTables mapTables, XMLSourceFromPath xmlSource, String tName) throws OdaException {
		mappedTables = mapTables;
		vtdNav = xmlSource.loadDocument();
	}

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
			int cursor;
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
							String text = (txt != -1) ? cloneNav.toNormalizedString(txt) : null;
							rowValues[j] = text;
						}else{
							cloneNav = vtdNav.cloneNav();
							cloneNav.toElement(VTDNav.FIRST_CHILD, columnXpath.replace("/", ""));
							int txt = cloneNav.getText();
							String text = (txt != -1) ? cloneNav.toNormalizedString(txt) : null;
							rowValues[j] = text;
						}
					}
					listMapRows.add(rowValues);
				}
				vtdNav.toElement(VTDNav.ROOT);
			}
			if (listMapRows.size() > 0) {
				prv.refresh(listMapRows, true);
				vtdNav.toElement(VTDNav.ROOT);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Close the VTDParserConsumer.
	 * 
	 */
	public void close() {
		prv = null;
		mappedTables = null;
	}


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
}
