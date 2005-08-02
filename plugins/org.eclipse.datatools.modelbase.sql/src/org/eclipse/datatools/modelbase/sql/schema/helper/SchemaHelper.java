/*******************************************************************************
 * Copyright (c) 2001, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.modelbase.sql.schema.helper;

import java.util.Iterator;

import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;

/**
 * @author ckadner
 *
 * Helper to provide convenience methods that are related to 
 * {@link com.ibm.db.models.sql.schema.Schema}.
 */
public class SchemaHelper
{
    
    /**
     * Finds a <code>Table</code> by its name in a given <code>Schema</code>,
     * the given <code>tableName</code> is not case sensitive.  
     * Look at {@link DatabaseHelper#findSchema(Database, String)} to see how 
     * the <code>Schema</code> can be found in a <code>Database</code>.
     * 
     * @param schema the <code>Schema</code> to find a <code>Table</code> in
     * @param tableName the String name of the <code>Table</code> to find 
     * @return the <code>Table</code> found or null
     * @throws NullPointerException if given <code>schema</code> or given
     *         <code>tableName</code> is <code>null</code>
     */
    public static Table findTable(Schema schema, String tableName) {
        Table returnTable = null;
        
        
        // TODO perf: optimize performance by loading only the table needed as
        //            opposed to all of them
        for (Iterator it = schema.getTables().iterator(); it.hasNext();)
        {
            Table table = (Table) it.next();
            
            if (DatabaseHelper.compareIdentifiers(schema.getDatabase(), table.getName(), tableName) == 0) 
            {
                returnTable = table;
            }
        }

        return returnTable;
    }
    
    
}
