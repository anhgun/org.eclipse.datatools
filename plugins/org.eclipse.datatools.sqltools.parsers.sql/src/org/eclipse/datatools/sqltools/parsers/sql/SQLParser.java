/*******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.sqltools.parsers.sql;



import org.eclipse.datatools.modelbase.sql.query.util.SQLQuerySourceFormat;

import com.ibm.lpg.LexStream;
import com.ibm.lpg.ParseTable;

/**
 * @author ckadner
 * TODO: doc
 */
public abstract class SQLParser extends AbstractSQLParser 
{
    
    /**
     * @param lexStream
     * @param prs
     * @param EOFTsymbol
     * @param checkStmtOnly
     */
    public SQLParser(LexStream lexStream, ParseTable prs, int EOFTsymbol,
                     boolean checkStmtOnly)throws SQLParserInternalException
    {
        super(lexStream, prs, EOFTsymbol, checkStmtOnly);
    }
    /**
     * @param lexStream
     * @param prs
     * @param EOFTsymbol
     * @param sourceFormat
     */
    public SQLParser(LexStream lexStream, ParseTable prs, int EOFTsymbol,
                     SQLQuerySourceFormat sourceFormat) throws SQLParserInternalException
    {
        super(lexStream, prs, EOFTsymbol, sourceFormat);
    }
    /**
     * @param lexStream
     * @param prs
     * @param EOFTsymbol
     * @param p_sourceFormat
     * @param checkStmtOnly
     */
    public SQLParser(LexStream lexStream, ParseTable prs, int EOFTsymbol,
    		SQLQuerySourceFormat p_sourceFormat, boolean checkStmtOnly) throws SQLParserInternalException
    {
        super(lexStream, prs, EOFTsymbol, p_sourceFormat, checkStmtOnly);
    }
    
//    /**
//     * @param lexStream
//     */
//    protected SQLParser(LexStream lexStream)
//    {
//        super(lexStream);
//    }
    
}
