#
#************************************************************************
# Copyright (c) 2004, 2013 Actuate Corporation.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
#
# Contributors:
#  Actuate Corporation - initial API and implementation
#  
#************************************************************************
#
logManager_duplicateName=Protokollfunktion mit dem gleichen Namen ist bereits vorhanden.
#
manifest_CANNOT_FIND_EXTENSION=ODA-Datenquellenerweiterung ({0}) nicht gefunden.\nPr�fen Sie die Arbeitsplatz-Protokolldatei auf Probleme mit dem Laden des Erweiterungs-Bundles und dessen Abh�ngigkeiten.
manifest_nullArgument=Das Argument darf nicht Null sein.
manifest_NO_DATA_SOURCE_EXTN_ID_DEFINED=In der Datenquellenerweiterung der Datei 'plugin.xml' des ODA-Treibers fehlt ein Attribut 'id'.
manifest_INVALID_VERSION_VALUE=Die Datei ''plugin.xml'' des ODA-Treibers enth�lt einen ung�ltigen Wert f�r odaVersion ({0}) in der Datenquellenerweiterung ({1}).
manifest_NO_DRIVER_CLASS_DEFINED=In der Datei ''plugin.xml'' des ODA-Treibers fehlt ein Attribut ''driverClass'' in der Datenquellenerweiterung ({0}).
manifest_INVALID_SET_THREAD_CONTEXT_CLASSLOADER_VALUE=Die Datei ''plugin.xml'' des ODA-Treibers enth�lt einen ung�ltigen Wert f�r setThreadContextClassLoader ({0}) in der Datenquellenerweiterung ({1}).
manifest_NO_DATA_SET_TYPES_DEFINED=F�r die ODA-Datenquellen-Erweiterung ({0}) ist kein <dataSet>-Element in der Erweiterung definiert. Dies ist eine g�ltige Konfiguration, begrenzt jedoch die ODA-Erweiterungsf�higkeiten.
manifest_NO_ATTRIBUTE_ID_DEFINED=In der Plug-in-Erweiterung des ODA-Treibers fehlt ein Attribut ({0}) im Element ({1}).
manifest_NO_DATA_TYPE_MAPPINGS_DEFINED=In der Datei ''plugin.xml'' des ODA-Treibers sollte mindestens ein Element <dataTypeMapping> f�r das Element <dataSet> ({0}) definiert sein.
manifest_NO_NATIVE_TYPE_CODE_DEFINED=In der Datei ''plugin.xml'' des ODA-Treibers fehlt ein Attribut ''nativeDataTypeCode'' im Element <dataTypeMapping> ({0}) des Elements <dataSet> ({1}).
manifest_INVALID_NATIVE_TYPE_CODE_VALUE=Die Datei ''plugin.xml'' des ODA-Treibers enth�lt einen ung�ltigen Wert f�r nativeDataTypeCode ({0}) im Element <dataTypeMapping> ({1}) des Elements <dataSet> ({2}).
manifest_NO_NATIVE_TYPE_NAME_DEFINED=In der Datei ''plugin.xml'' des ODA-Treibers fehlt ein Attribut ''nativeDataType'' im Element <dataTypeMapping> des Elements <dataSet> ({0}).
manifest_NO_ODA_SCALAR_DATA_TYPE_DEFINED_1=In der Datei ''plugin.xml'' des ODA-Treibers fehlt ein Attribut ''odaScalarDataType'' im Element <dataTypeMapping> ({0}).
manifest_NO_ODA_SCALAR_DATA_TYPE_DEFINED_2=In der Datei ''plugin.xml'' des ODA-Treibers fehlt ein Attribut ''odaScalarDataType'' im Element <alternativeOdaDataType> des Elements <dataTypeMapping> ({0}).
manifest_INVALID_ODA_SCALAR_DATA_TYPE_VALUE=Die Datei ''plugin.xml'' des ODA-Treibers enth�lt einen ung�ltigen Wert f�r odaScalarDataType ({0}) im Element <dataTypeMapping> ({1}).
manifest_INVALID_LOG_LEVEL_VALUE=Die Datei ''plugin.xml'' des ODA-Treibers enth�lt einen ung�ltigen Wert f�r logLevel ({0}) in der Datenquellenerweiterung ({1}).
manifest_MISSING_ELEMENT_IN_EXTENSION_MANIFEST=Bei der Erweiterung ({0}) fehlt ein {1}-Element.
manifest_NO_LOG_FILENAME_PREFIX_DEFINED=In der Datei ''plugin.xml'' des ODA-Treibers fehlt ein Attribut ''logFileNamePrefix'' im Element <traceLogging> der Datenquellenerweiterung ({0}).
manifest_UNKNOWN_BUNDLE_LOCATION=Der Installationspfad der ODA-Erweiterung ({0}) wurde nicht gefunden.  Die ODA-Verbraucheranwendung muss einen ResourceIdentifiers im AppContext angeben, um den Pfad zu l�sen.
#
sortSpec_INVALID_SORT_MODE_SPECIFIED=Es wurde ein ung�ltiger Sortiermodus angegeben\: {0}.
sortSpec_NULL_COLUMN_NAME_SPECIFIED=Es wurde ein Nullspaltenname angegeben.
sortSpec_INVALID_COLUMN_NAME_SPECIFIED=Es wurde ein ung�ltiger Spaltenname angegeben\: {0}.
sortSpec_INVALID_NULL_ORDERING=Ung�ltiger Null-Reihenfolgewert: {0}.
sortSpec_INVALID_SORT_ORDER_SPECIFIED=Es wurde eine ung�ltige Sortierreihenfolge angegeben\: {0}.
sortSpec_NO_DYNAMIC_SORT_KEY_FOR_SORTMODENONE=Dieser Wert f�r 'sortSpec' mit 'sortModeNone' l�sst keine dynamischen Sortierschl�ssel zu.
sortSpec_ONE_SORTCOLUMN_FOR_SINGLE_COLUMN_MODE=Es ist bereits eine Sortierspalte vorhanden.  Der Modus 'sortModeSingleColumn' l�sst maximal eine dynamische Sortierspalte zu.
sortSpec_ONE_SORTORDER_FOR_SINGLE_ORDER_MODE=Der Modus 'sortModeSingleOrder' unterst�tzt nur eine Sortierreihenfolge.
sortSpec_ONLY_IN_SINGLE_ORDER_MODE=Wird nur im Modus 'sortModeSingleOrder' unterst�tzt.
sortSpec_INDEX_OUT_OF_BOUND=Index: {0}, Anzahl: {1}.
#
stringSubUtil_NO_STRING_VALUE_TO_REPLACE=Kein Zeichenfolgewert f�r Ersetzung\: {0}.
stringSubUtil_DELIMITER_CANNOT_BE_EMPTY=Der Begrenzer darf keine leere Zeichenfolge sein oder ausschlie�lich Leerzeichen enthalten.
stringSubUtil_DELIMITER_CANNOT_BE_NULL=Der Begrenzer darf nicht Null sein.
stringSubUtil_SUBSTITUTION_LIST_CANNOT_BE_NULL=Die Zeichenfolgensubstitutionsliste darf nicht Null sein.
stringSubUtil_SUBSTITUTION_VALUE_CANNOT_BE_NULL=Der Zeichenfolgensubstitutionswert darf nicht Null sein.
stringSubUtil_TEXT_STRING_CANNOT_BE_NULL=Die Textzeichenfolge darf nicht Null sein.
stringSubUtil_NAME_VALUE_MAP_CANNOT_BE_NULL=Die Zuordnung Name-Wert darf nicht Null sein.
#
profileProperty_PROFILE_NAME=Name des Verbindungs&profils
profileProperty_PROFILE_STORE_PATH=&URL von Speicher f�r Verbindungsprofil
profileProperty_GROUP_PROPERTIES=Referenz f�r externes Verbindungsprofil
#
querySpec_CUSTOM_AGGR_EXCEED_MAX_ARGS=The custom aggregate expression ({0}) has {1} arguments, which exceeds the allowed maximum of {2} arguments.
querySpec_CUSTOM_AGGR_INCOMPATIBLE_DUPL_CHECK=Ignorieren doppelter Werte f�r benutzerdefinierten Aggregattyp ({0}) nicht m�glich.
querySpec_CUSTOM_AGGR_INCOMPATIBLE_NULL_CHECK=Ignorieren von Nullwerten f�r benutzerdefinierten Aggregattyp ({0}) nicht m�glich.
querySpec_CUSTOM_AGGR_LESS_THAN_MIN_ARGS=Benutzerdefinierter Aggregatausdruck ({0}) hat {1} Argumente, es sind jedoch mindestens {2} Argumente erforderlich.
querySpec_CUSTOM_FILTER_EXCEED_MAX_ARGS=The custom filter expression ({0}) has {1} arguments, which exceeds the allowed maximum of {2} arguments.
querySpec_CUSTOM_FILTER_LESS_THAN_MIN_ARGS=Benutzerdefinierter Filterausdruck ({0}) hat {1} Argumente, es sind jedoch mindestens {2} Argumente erforderlich.
querySpec_CUSTOM_FUNC_EXCEED_MAX_ARGS=The custom function value expression ({0}) has {1} arguments, which exceeds the allowed maximum of {2} arguments.
querySpec_CUSTOM_FUNC_INCOMPATIBLE_DUPL_CHECK=The custom function type ({0}) cannot ignore duplicate values.
querySpec_CUSTOM_FUNC_LESS_THAN_MIN_ARGS=The custom function value expression ({0}) has {1} arguments, but requires a minimum of {2} arguments.
querySpec_EXTENSION_ID_NOT_FOUND=Keine {0}-Erweiterung mit ID ({1}) gefunden.
querySpec_ILLEGAL_CONSTRUCTOR_ARG=Illegal {0} constructor argument
querySpec_INCOMPLETE_COMBINED_QUERY=Unvollst�ndig kombinierte Abfragespezifikation.
querySpec_INVALID_AGGR_EXPR=Ung�ltiger Aggregatausdruck.
querySpec_INVALID_AGGR_HIDE_COLUMN=Ung�ltige Aggregatprojektion auf eine ausgeblendete Spalte {0}.
querySpec_INVALID_ARG=Ung�ltiges Argument: {0}.
querySpec_INVALID_BASE_QUERY=Ung�ltige Basisabfrage
querySpec_INVALID_CLASS_TYPE_ATTRIBUTE=Ung�ltiger Klassentyp: ({0}).  Attribut {1} muss eine Instanz von {2} sein.
querySpec_INVALID_COLUMN_IDENTIFIER=Invalid column reference {0}.
querySpec_INVALID_EXT_POINT_ATTR_VALUE={0}-Erweiterung ({1}) hat ung�ltigen Wert ({2}) f�r Attribut {3}.
querySpec_INVALID_EXT_POINT_ELEMENT={0}-Erweiterung ({1}) ist ung�ltig.  Erforderliche Inhalte finden Sie in der Schemadefinition.
querySpec_INVALID_FILTER_EXPR=Ung�ltiger Filterausdruck.
querySpec_INVALID_RESULT_PROJ=Ung�ltige Ergebnisprojektion.
querySpec_INVALID_SORT_KEY=Ung�ltiger Sortierschl�ssel.
querySpec_INVALID_SORT_SPEC=Ung�ltige Sortierangaben.
querySpec_INVALID_VALUE_EXPR=Invalid value expression.
querySpec_MAX_ONE_NEGATING_EXPR=Es kann nicht mehr als ein Ausdruck mit Negation zu {0} hinzugef�gt werden.
querySpec_MISSING_ATOMIC_QUERY_TEXT=Fehlender Abfragetext in atomarer Basisabfrage.
querySpec_MISSING_COMBINED_MATCHING_EXPR=Fehlende �bereinstimmende Ausdr�cke in kombinierten Bedingungen.
querySpec_MISSING_COMPOSITE_MIN_CHILDREN=Composite {0} muss mindestens {1} untergeordnete Ausdr�cke enthalten.
querySpec_MISSING_EXPR_VARIABLE=F�r Filterausdruck ({0}) fehlt eine verbundene Variable.
querySpec_MISSING_EXT_POINT_ATTR_VALUE=Bei {0}-Erweiterung ({1}) fehlt der Attributwert f�r {2} in Element {3}.
querySpec_MISSING_EXT_POINT_ELEMENT=Bei {0}-Erweiterung ({1}) fehlt das Element {2}.
querySpec_MISSING_EXT_POINT_MIN_ELEMENT=F�r {0}-Erweiterung ({1}) muss mindestens ein Element {2} definiert sein.
querySpec_NON_DEFINED_COMBINED_OP=Typ ({0}) des Operators zur Kombinierung von Ausdr�cken nicht in Erweiterungsregistrierung dynamicResultSet gefunden.
querySpec_NON_DEFINED_CUSTOM_AGGR=Benutzerdefinierter Aggregatausdruck ({0}) nicht in Erweiterungsregistrierung dynamicResultSet gefunden.
querySpec_NON_DEFINED_CUSTOM_FILTER=Benutzerdefinierter Filterausdruck ({0}) nicht in Erweiterungsregistrierung dynamicResultSet gefunden.
querySpec_NON_DEFINED_CUSTOM_FUNC=The custom function ({0}) is not found in the dynamicResultSet extension registry.
querySpec_NON_RELATED_QUERYSPEC=Die Spalte {0} in einem kombinierten Abfrageausdruck kann nicht von einer Abfrage gekennzeichnet werden, die keine der kombinierten Abfragen ist.
querySpec_NONSUPPORTED_NULL_ORDERING=Null-Reihenfolgenspezifikation wird vom Datenquellen-Anbieter nicht unterst�tzt.
querySpec_NONSUPPORTED_VAR_DATA_TYPE=The ODA data type ({0}) of the value expression ({1}) is not supported by the type of custom expression used.
querySpec_NOT_EXPR_INCOMPATIBLE=Ung�ltige Verwendung eines nicht negierbaren Ausdrucks ({0}) in {1}.
querySpec_NOT_EXPR_MISSING_CHILD=Fehlender Ausdruck mit Negation in NotExpression: ({0}).
querySpec_NULL_CONSTRUCTOR_3ARGS=Null {0} constructor argument(s): {1}, {2}, {3}.
querySpec_NULL_CONSTRUCTOR_ARG=Null {0} constructor argument
querySpec_UNABLE_ADD_TO_NON_LIST_COLLECTION=Wert kann nicht zu vorhandenen Werten hinzugef�gt werden.  Vorhandener Wert ist nicht vom Typ java.util.List.
querySpec_UNEXPECTED_AGGR_EXPR_EXTENSION=Benutzerdefinierter Aggregatausdruck ({0}) einer anderen Erweiterung wird nicht unterst�tzt.
querySpec_UNEXPECTED_AGGR_EXPR_TYPE=Der benutzerdefinierte Aggregatausdruck ({0}) ist keine Instanz von {1}. Verbraucheranwendung muss ExpressionFactory\#createCustomAggregate zum Erstellen einer benutzerdefinierten Ausdrucksinstanz verwenden.
querySpec_UNEXPECTED_CUSTOM_EXPR_EXTENSION=Benutzerdefinierter Filterausdruck ({0}) einer anderen Erweiterung wird nicht unterst�tzt.
querySpec_UNEXPECTED_CUSTOM_EXPR_TYPE=Benutzerdefinierter Filterausdruck ({0}) ist keine {1}-Instanz.\nVerbraucheranwendung muss zum Erstellen eines benutzerdefinierten Filterausdrucks ExpressionFactory\#createCustomExpression verwenden.
querySpec_UNEXPECTED_EXPR_VARIABLE_TYPE=Dieser Typ von ExpressionVariable ({1}) wird nicht unterst�tzt.
querySpec_UNEXPECTED_FUNC_EXPR_EXTENSION=Benutzerdefinierte Funktion ({0}) einer anderen Erweiterung wird nicht unterst�tzt.
querySpec_UNEXPECTED_FUNC_EXPR_TYPE=Die benutzerdefinierte Funktion ({0}) ist keine Instanz von {1}. Verbraucheranwendung muss ExpressionFactory\#createCustomFunction zum Erstellen einer benutzerdefinierten Funktionsinstanz verwenden.
