/***********************************************************************************************************************
 * Copyright (c) 2009 Sybase, Inc. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Sybase, Inc. - initial API and implementation
 **********************************************************************************************************************/
package org.eclipse.datatools.enablement.sybase.asa.schemaobjecteditor.examples.utils;

import org.eclipse.datatools.sqltools.sql.ISQLSyntax;

/**
 * @author Li Huang
 *
 * ASA SQL reserved keywords, functions, data types and operators, which are used as the highlight token.
 */
public class ASASQLSyntax implements ISQLSyntax
{

    private static final String[] _globalVariables = 
    {
        "@@char_convert",
            "@@client_csname",
            "@@client_csid",
            "@@connections",
            "@@cpu_busy",
            "@@error",
            "@@identity",
            "@@idle",
            "@@io_busy",
            "@@isolation",
            "@@langid",
            "@@language",
            "@@maxcharlen",
            "@@max_connections",
            "@@ncharsize",
            "@@nestlevel",
            "@@pack_received",
            "@@pack_sent",
            "@@packet_errors",
            "@@procid",
            "@@rowcount",
            "@@servername",
            "@@spid",
            "@@sqlstatus",
            "@@textsize",
            "@@thresh_hysteresis",
            "@@timeticks",
            "@@total_errors",
            "@@total_read",
            "@@total_write",
            "@@tranchained",
            "@@trancount",
            "@@transtate",
            "@@version"
    }
    ;

    //TODO: distinguish reserved and unreserved keywords
    private static final String[] _unreservedwords =
    {
        "ABSOLUTE",
            "ACTION",
            "ACTIV",
            "ADDRESS",
            "AFTER",
            "ALGORITHM",
            "ALLOW_DUP_ROW",
            "APPEND",
            "ASCII",
            "ASE",
            "AT",
            "ATOMIC",
            "ATTENDED",
            "AUTHORIZATION",
            "AUTO",
            "AUTOINCREMENT",
            "AUTOSTOP",
            "BATCH",
            "BCP",
            "BEFORE",
            "BLANK",
            "BLANKS",
            "BLOCK",
            "BULK",
            "BYTE",
            "CACHE",
            "CALIBRATE",
            "CALIBRATION",
            "CANCEL",
            "CATALOG",
            "CERTIFICATE",
            "CHECKSUM",
            "CLASS",
            "CLASSES",
            "CLIENT",
            "CLIENTPORT",
            "CLUSTERED",
            "CMP",
            "COLLATION",
            "COLUMN",
            "COLUMNS",
            "COMMAND",
            "COMPARISONS",
            "COMPATIBLE",
            "COMPONENT",
            "COMPUTE",
            "COMPUTES",
            "CONFIRM",
            "CONNECTION",
            "CONSOLE",
            "CONSOLIDATE",
            "CONSOLIDATED",
            "CONSTRAINTS",
            "CRC",
            "CURLY_STRING",
            "DATA",
            "DATABASE",
            "DATATYPE",
            "DBA",
            "DBFILE",
            "DEBUG",
            "DECRYPTED",
            "DEFAULTS",
            "DEFINITION",
            "DELAY",
            "DELIMITED",
            "DENSITY",
            "DETERMINISTIC",
            "DIRECTORY",
            "DISABLE",
            "DOMAIN",
            "DTTM",
            "EACH",
            "EJB",
            "ELEMENTS",
            "ELSEOP",
            "ENABLE",
            "ENCODING",
            "ENGINE",
            "ERROR",
            "ESCAPES",
            "EVENT",
            "EVENT_CONDITION",
            "EVERY",
            "EXCLUDE",
            "EXCLUSIVE",
            "EXPLICIT",
            "EXPRESS",
            "EXTERNAL",
            "FACTOR",
            "FASTFIRSTROW",
            "FILE",
            "FILLER",
            "FILLFACTOR",
            "FINISH",
            "FOLLOWING",
            "FORMAT",
            "FP",
            "FTP",
            "FUNCTION",
            "GB",
            "GLOBAL",
            "GO",
            "GROUPING",
            "HANDLER",
            "HASH",
            "HEXADECIMAL",
            "HG",
            "HIDDEN",
            "HIGH",
            "HISTORY",
            "HNG",
            "HOLD",
            "HOURS",
            "IDENTITY",
            "IFOP",
            "IGNORE",
            "IGNORE_DUP_KEY",
            "IGNORE_DUP_ROW",
            "IMMEDIATE",
            "INACTIV",
            "INCREMENTAL",
            "INFO",
            "INTERNAL",
            "JAR",
            "JAVA",
            "JCONNECT",
            "JDK",
            "JOIN_OP",
            "KB",
            "LANGUAGE",
            "LAST",
            "LD",
            "LEAVE",
            "LEVEL",
            "LF",
            "LIMIT",
            "LIST",
            "LOAD",
            "LOCAL",
            "LOCATION",
            "LOG",
            "LOGGING",
            "LOOP",
            "LOW",
            "LRU",
            "MAIN",
            "MAPI",
            "MAXIMUM",
            "MB",
            "MINUTES",
            "MIRROR",
            "MONITOR",
            "MRU",
            "NAME",
            "NAMESPACE",
            "NATIVE",
            "NEXT",
            "NOLOCK",
            "NONCLUSTERED",
            "OLD",
            "ONLY",
            "OPTIMIZATION",
            "OPTIMIZER",
            "OUTPUT",
            "PACKAGE",
            "PACKETSIZE",
            "PADDING",
            "PAGE",
            "PAGES",
            "PAGLOCK",
            "PARALLEL",
            "PARTITION",
            "PASSWORD",
            "PATH",
            "PCTFREE",
            "PLAN",
            "PRECEDING",
            "PREFETCH",
            "PREFIX",
            "PRESERVE",
            "PREVIEW",
            "PRIOR",
            "PRIVATE",
            "PROXY",
            "PUBLISH",
            "PUBLISHER",
            "QUOTES",
            "RANGE",
            "RAW",
            "READ",
            "READCOMMITTED",
            "READONLY",
            "READPAST",
            "READUNCOMMITTED",
            "READWRITE",
            "RECEIVED",
            "RECOMPILE",
            "RECURSIVE",
            "REFERENCING",
            "RELATIVE",
            "RELOCATE",
            "REPEATABLEREAD",
            "REPLICATE",
            "RERECEIVE",
            "RESEND",
            "RESERVE",
            "RESET",
            "RESIGNAL",
            "RESIZING",
            "RESOLVE",
            "RESPECT",
            "RESULT",
            "RESUME",
            "RETAIN",
            "RETURNS",
            "ROOT",
            "ROW",
            "ROWLOCK",
            "ROWS",
            "SCHEDULE",
            "SCHEMA",
            "SECONDS",
            "SECURE",
            "SEND",
            "SENT",
            "SERIALIZABLE",
            "SERVER",
            "SERVICE",
            "SETS",
            "SIGNAL",
            "SINCE",
            "SITE",
            "SIZE",
            "SKIP",
            "SMTP",
            "SORTED_DATA",
            "SPACE",
            "STACKER",
            "STATEMENT",
            "STATISTICS",
            "STATUS",
            "STORE",
            "STRIP",
            "SUBSCRIBE",
            "SUBSCRIPTION",
            "SYNCHRONIZATION",
            "TABLOCK",
            "TABLOCKX",
            "TB",
            "TEMPLATE",
            "TIES",
            "TRANSACTION",
            "TRANSACTIONAL",
            "TRANSLOG",
            "TRIES",
            "TYPE",
            "UNCONDITIONALLY",
            "UNENFORCED",
            "UNLOAD",
            "UPDLOCK",
            "UPGRADE",
            "URL",
            "USE",
            "UTC",
            "UTILITIES",
            "VALUE",
            "VERIFY",
            "VIM",
            "VIRTUAL",
            "WARNING",
            "WD",
            "WEB",
            "WRITEFILE",
            "WRITESERVER",
            "XLOCK",
            "ZEROS",
            "IFTHEN"
    }
    ;

    private static final String[] _reservedwords =
    {
        "ADD",
            "ALL",
            "ALTER",
            "AND",
            "ANY",
            "AS",
            "ASC",
            "BACKUP",
            "BEGIN",
            "BETWEEN",
            "BIGINT",
            "BINARY",
            "BIT",
            "BOTTOM",
            "BREAK",
            "BY",
            "CALL",
            "CAPABILITY",
            "CASCADE",
            "CASE",
            "CAST",
            "CHAR_CONVERT",
            "CHARACTER",
            "CHECK",
            "CHECKPOINT",
            "CLOSE",
            "COMMENT",
            "COMMIT",
            "CONFLICT",
            "CONNECT",
            "CONSTRAINT",
            "CONTAINS",
            "CONTINUE",
            "CONVERT",
            "CREATE",
            "CROSS",
            "CUBE",
            "CURRENT",
            "CURRENT_TIMESTAMP",
            "CURRENT_USER",
            "CURSOR",
            "DATE",
            "DBSPACE",
            "DEALLOCATE",
            "DEC",
            "DECIMAL",
            "DECLARE",
            "DEFAULT",
            "DELETE",
            "DELETING",
            "DESC",
            "DISTINCT",
            "DO",
            "DOUBLE",
            "DROP",
            "DYNAMIC",
            "ELSE",
            "ELSEIF",
            "ENCRYPTED",
            "END",
            "ENDIF",
            "ESCAPE",
            "EXCEPT",
            "EXCEPTION",
            "EXEC",
            "EXECUTE",
            "EXISTING",
            "EXISTS",
            "EXTERNLOGIN",
            "FETCH",
            "FIRST",
            "FLOAT",
            "FOR",
            "FORCE",
            "FOREIGN",
            "FORWARD",
            "FROM",
            "FULL",
            "GOTO",
            "GRANT",
            "GROUP",
            "HAVING",
            "HOLDLOCK",
            "IDENTIFIED",
            "IF",
            "IN",
            "INDEX",
            "INDEX_LPAREN",
            "INNER",
            "INOUT",
            "INSENSITIVE",
            "INSERT",
            "INSERTING",
            "INSTALL",
            "INSTEAD",
            "INT",
            "INTEGER",
            "INTEGRATED",
            "INTERSECT",
            "INTO",
            "IQ",
            "IS",
            "ISOLATION",
            "JOIN",
            "KEY",
            "LATERAL",
            "LEFT",
            "LIKE",
            "LOCK",
            "LOGIN",
            "LONG",
            "MATCH",
            "MEMBERSHIP",
            "MESSAGE",
            "MODE",
            "MODIFY",
            "NATURAL",
            "NEW",
            "NO",
            "NOHOLDLOCK",
            "NOT",
            "NOTIFY",
            "NULL",
            "NUMERIC",
            "OF",
            "OFF",
            "ON",
            "OPEN",
            "OPTION",
            "OPTIONS",
            "OR",
            "ORDER",
            "OTHERS",
            "OUT",
            "OUTER",
            "OVER",
            "PASSTHROUGH",
            "PRECISION",
            "PREPARE",
            "PRIMARY",
            "PRINT",
            "PRIVILEGES",
            "PROC",
            "PROCEDURE",
            "PUBLICATION",
            "RAISERROR",
            "READTEXT",
            "REAL",
            "REFERENCE",
            "REFERENCES",
            "RELEASE",
            "REMOTE",
            "REMOVE",
            "RENAME",
            "REORGANIZE",
            "RESOURCE",
            "RESTORE",
            "RESTRICT",
            "RETURN",
            "REVOKE",
            "RIGHT",
            "ROLLBACK",
            "ROLLUP",
            "SAVE",
            "SAVEPOINT",
            "SCROLL",
            "SELECT",
            "SENSITIVE",
            "SESSION",
            "SET",
            "SETUSER",
            "SHARE",
            "SMALLINT",
            "SOME",
            "SQLCODE",
            "SQLSTATE",
            "START",
            "STOP",
            "SUBTRANS",
            "SUBTRANSACTION",
            "SYNCHRONIZE",
            "SYNTAX_ERROR",
            "TABLE",
            "TEMPORARY",
            "THEN",
            "TIME",
            "TIMESTAMP",
            "TINYINT",
            "TO",
            "TOP",
            "TRAN",
            "TRIGGER",
            "TRUNCATE",
            "TSEQUAL",
            "UNBOUNDED",
            "UNION",
            "UNIQUE",
            "UNIQUEIDENTIFIER",
            "UNKNOWN",
            "UNSIGNED",
            "UPDATE",
            "UPDATING",
            "USER",
            "USING",
            "VALIDATE",
            "VALUES",
            "VARBINARY",
            "VARCHAR",
            "VARIABLE",
            "VARYING",
            "VIEW",
            "WAIT",
            "WAITFOR",
            "WHEN",
            "WHERE",
            "WHILE",
            "WINDOW",
            "WITH",
            "WITH_CUBE",
            "WITH_LPAREN",
            "WITH_ROLLUP",
            "WITHIN",
            "WORK",
            "WRITETEXT"
    }
    ;

    private static final String[] _predicates =
    {

        ",",  
            ";",  
            ".",  
            "~", 
            ">", 
            ">=", 
            "<", 
            "<=", 
            "=",  
            "<>", 
            "!=", 
            "!<", 
            "!>", 
            "(+)",  
            "(",  
            ")",  
            "*",  
            "/",  
            "+",  
            "-",  
            "?",  
            "%",  
            "&", 
            "", 
            "^", 
            ":", 
            "{", 
            "\"",
    }
    ;

    private static final String[] _types =
    {
        "BIGINT",     
            "BINARY", 
            "BIT", 
            "CHAR", 
            "CHARACTER", 
            "DATE", 
            "DATETIME", 
            "DEC",
            "DECIMAL", 
            "DOUBLE", 
            "FLOAT", 
            "IMAGE", 
            "INTEGER", 
            "INT", 
            "LONG", 
            "MONEY", 
            "NUMERIC", 
            "REAL", 
            "SMALLDATETIME", 
            "SMALLINT", 
            "SMALLMONEY", 
            "SYSNAME", 
            "TEXT", 
            "TIME", 
            "TIMESTAMP", 
            "TINYINT", 
            "UNIQUEIDENTIFIER", 
            "UNIQUEIDENTIFIERSTR", 
            "UNSIGNED", 
            "VARBINARY", 
            "VARCHAR", 
            "XML"
    }
    ;
    private static final String[] _constants =
    {
        "FALSE", "NULL", "TRUE", "false", "true", "null" 
    }
    ;
    private static final String[] _functions =
    {
        "ABS",
            "ACOS",
            "ARGN",
            "ASCII",
            "ASIN",
            "ATAN",
            "ATN2",
            "AVG",
            "BASE64_DECODE",
            "BASE64_ENCODE",
            "BYTE_LENGTH",
            "BYTE_SUBSTR",
            "CAST",
            "CEILING",
            "CHARINDEX",
            "CHAR_LENGTH",
            "COALESCE",
            "COMPARE",
            "COMPRESS",
            "CONNECTION_PROPERTY",
            "CONVERT",
            "CORR",
            "COS",
            "COT",
            "COUNT",
            "COVAR_POP",
            "COVAR_SAMP",
            "CSCONVERT",
            "CUME_DIST",
            "DATALENGTH",
            "DATE",
            "DATEADD",
            "DATEDIFF",
            "DATEFORMAT",
            "DATENAME",
            "DATEPART",
            "DATETIME",
            "DAY",
            "DAYNAME",
            "DAYS",
            "DB_ID",
            "DB_NAME",
            "DB_EXTENDED_PROPERTY",
            "DB_PROPERTY",
            "DECOMPRESS",
            "DECRYPT",
            "DEGREES",
            "DENSE_RANK",
            "DIFFERENCE",
            "DOW",
            "ENCRYPT",
            "ERRORMSG",
            "ESTIMATE",
            "ESTIMATE_SOURCE",
            "EVENT_CONDITION",
            "EVENT_CONDITION_NAME",
            "EVENT_PARAMETER",
            "EXP",
            "EXPERIENCE_ESTIMATE",
            "EXPLANATION",
            "EXPRTYPE",
            "FLOOR",
            "GET_IDENTITY",
            "GETDATE",
            "GRAPHICAL_PLAN",
            "GRAPHICAL_ULPLAN",
            "GREATER",
            "GROUPING",
            "HASH",
            "HEXTOINT",
            "HOUR",
            "HOURS",
            "HTML_DECODE",
            "HTML_ENCODE",
            "HTTP_DECODE",
            "HTTP_ENCODE",
            "HTTP_HEADER",
            "HTTP_VARIABLE",
            "IDENTITY",
            "IFNULL",
            "INDEX_ESTIMATE",
            "INSERTSTR",
            "INTTOHEX",
            "ISDATE",
            "ISNULL",
            "ISNUMERIC",
            "LCASE",
            "LENGTH",
            "LESSER",
            "LIST",
            "LOCATE",
            "LOG",
            "LOG10",
            "LONG_ULPLAN",
            "LOWER",
            "LTRIM",
            "MAX",
            "MIN",
            "MINUTE",
            "MINUTES",
            "MOD",
            "MONTH",
            "MONTHNAME",
            "MONTHS",
            "NEWID",
            "NEXT_CONNECTION",
            "NEXT_DATABASE",
            "NEXT_HTTP_HEADER",
            "NEXT_HTTP_VARIABLE",
            "NOW",
            "NULLIF",
            "NUMBER",
            "OPENXML",
            "PATINDEX",
            "PERCENT_RANK",
            "PI",
            "PLAN",
            "POWER",
            "PROPERTY_DESCRIPTION",
            "PROPERTY",
            "PROPERTY_NAME",
            "PROPERTY_NUMBER",
            "QUARTER",
            "RADIANS",
            "RAND",
            "RANK",
            "REGR_AVGX",
            "REGR_AVGY",
            "REGR_COUNT",
            "REGR_INTERCEPT",
            "REGR_R2",
            "REGR_SLOPE",
            "REGR_SXX",
            "REGR_SXY",
            "REGR_SYY",
            "REMAINDER",
            "REPEAT",
            "REPLACE",
            "REPLICATE",
            "REWRITE",
            "ROUND",
            "ROW_NUMBER",
            "RTRIM",
            "SECOND",
            "SECONDS",
            "SHORT_ULPLAN",
            "SIGN",
            "SIMILAR",
            "SIN",
            "SORTKEY",
            "SOUNDEX",
            "SPACE",
            "SQLDIALECT",
            "SQRT",
            "STDDEV",
            "STDDEV_POP",
            "STDEV_SAMP",
            "STR",
            "STRING",
            "STRTOUUID",
            "STUFF",
            "SUBSTRING",
            "SUM",
            "TAN",
            "TEXTPTR",
            "TODAY",
            "TRACEBACK",
            "TRANSACTSQL",
            "TRIM",
            "TRUNCNUM",
            "UCASE",
            "UPPER",
            "UUIDTOSTR",
            "VAR_POP",
            "VAR_SAMP",
            "VARIANCE",
            "VAREXISTS",
            "WATCOMSQL",
            "WEEKS",
            "XMLAGG",
            "XMLCONCAT",
            "XMLELEMENT",
            "XMLFOREST",
            "XMLGEN",
            "YEAR",
            "YEARS",
            "YMD"
    }
    ;

    private static final String[] _comments      =
    {
        "--", 
            "//"
    }
    ;

    private Object[] _allWords =
    {
        _reservedwords, _unreservedwords, _predicates, _types, _constants, _functions 
    }
    ;

    /**
         * @return Returns the functions.
         */
    public String[] getFunctions()
    {
        return _functions;
    }
    /**
         * @return Returns the predicates.
         */
    public String[] getPredicates()
    {
        return _predicates;
    }
    /**
         * @return Returns the reservedwords.
         */
    public String[] getReservedwords()
    {
        return _reservedwords;
    }

    public String[] getUnreservedwords()
    {
        return _unreservedwords;
    }

    /**
         * @return Returns the types.
         */
    public String[] getTypes()
    {
        return _types;
    }
    /**
         * @return Returns the allWords.
         */
    public Object[] getAllWords()
    {
        return _allWords;
    }
    /**
         * @return Returns the constants.
         */
    public String[] getConstants()
    {
        return _constants;
    }

    public String[] getSingleLineComments()
    {
        return _comments;
    }
    public String[] getGlobalVariables() 
    {
        return _globalVariables;
    }
}

