###############################################################################
# Copyright (c) 2004, 2008 Actuate Corporation.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
# 
# Contributors:
#  Actuate Corporation - initial API and implementation
#  
###############################################################################
# wizard dialog messages
wizard.title.selectFolder=Fuente de datos XML
wizard.defaultMessage.selectFolder=Defina las URL al archivo XML y la informaci�n de esquema.
wizard.title.newDataSet=Nuevo conjunto de datos
wizard.title.selectXmlFile=Seleccionar datos XML para la vista previa
wizard.defaultMessage.selectFile=Seleccione una fuente de XML de muestra para activar la vista previa de datos en esta secci�n.
wizard.title.xPathChoose=Definir asignaci�n de tablas
wizard.defaultMessage.selectXPath=Definir asignaci�n de filas de conjunto de datos seleccionando un elemento de la estructura XML.\nCada aparici�n del elemento XML seleccionado en el documento XML se asigna a una fila de conjunto de datos.
wizard.title.selectColumn=Definir asignaci�n de columnas
wizard.title.defineColumnMapping=Crear columnas de conjunto de datos seleccionando y a�adiendo elementos de la estructura XML.\nCada atributo o elemento XML a�adido se asigna a una columna de conjunto de datos. 

#preference
designer.preview.preference.numberOfElementPassedToGetSchema=N�mero de elementos datos a analizar para el esquema XML:
designer.preview.preference.numberOfElementPassedToGetSchema.errormessage=Introduzca un n�mero entre 0 y {0}.
designer.preview.preference.columnMappingPage.group.title=Asignaci�n de columnas

#XML data source folder selection wizard page
XMLSelectionWizardPage.message.error.emptyXMLSource=Especifique la URL fuente del XML o examine el archivo XML.

#row mapping page messages
xPathChoosePage.messages.elementSelection.label=Selecci�n de elemento XML
xPathChoosePage.messages.elementSelection.item.absolutePath=Elementos &XML con nombre "{0}" en una ruta absoluta fija\n
xPathChoosePage.messages.elementSelection.item.anyLocation=&Elementos XML con nombre "{0}" en cualquier ubicaci�n\n
xPathChoosePage.messages.elementSelection.disable.absolutePath=Elementos &XML en una ruta absoluta fija\n 
xPathChoosePage.messages.elementSelection.disable.anyLocation=&Elementos XML en cualquier ubicaci�n\n 
xPathChoosePage.messages.elementSelection.item.custom=Expresi�n XPath p&ersonalizada
xPathChoosePage.messages.xPathExpression=Expresi�n &XPath
xPathChoosePage.messages.xmlStructure=Estructura XML
xPathChoosePage.messages.xmlColumnMapping=Asignaci�n de columnas
xPathChoosePage.messages.xpathChange=Aseg�rese de que la asignaci�n de tabla modificada es compatible con la asignaci�n de columnas, cuando sea aplicable.   
xPathChoosePage.FileNameIcon=Icono de nombre de archivo
xPathChoosePage.XMLElementIcon=Icono de elemento XML
xPathChoosePage.ColumnIcon=Icono de columna
xPathChoosePage.messages.btnAdd.tooltip=Utilice el nodo seleccionado como Expresi�n XPath.
xPathChoosePage.messages.noURLOfSourceOrSchema=No se ha proporcionado ninguna URL de la fuente XML ni esquema XML.

#sample xml data file page messages
xmlDataSetSelectionPage.messages.lineofdata=l�neas de datos fuente
xmlDataSetSelectionPage.warning.errorReadXMLFile=Error al leer los datos XML del archivo [{0}]\n{1}. �Desea continuar?

#column mapping page messages
button.refresh=Actualizar
menu.menuItem.removeAll=Quitar todos
menu.menuItem.remove=Quitar
menu.button.add=&A�adir...
menu.button.edit=&Editar...
menu.button.remove=Quita&r
menu.button.up=&Arriba
menu.button.down=Abaj&o
menu.button.preview=Mo&strar datos de muestra
lable.selectXmlFile=Introduzca la URL de la fuente &XML o busque el archivo que contiene los datos:
label.selectEncoding=Seleccionar &codificaci�n para la fuente XML y el esquema especificado anteriormente:
lable.selectXmlSchmaFile=Introduzca la URL del esquema X&ML o busque el archivo que contiene el\n esquema. D�jelo vac�o si no hay ning�n esquema disponible:
label.preview=&Previsualizar las primeras
label.useXMLFileFromDataSource=&Utilice el archivo XML definido en fuente de datos.
RowMappingDialog.title=Seleccione o edite la expresi�n XPath.
RowMappingDialog.info=Seleccione una de las expresiones XPath predefinidas para el nodo que ha seleccionado o\n introduzca otra expresi�n:
ColumnMappingPage.AddSingleButton.tooltip=Utilice el nodo seleccionado como asignaci�n de columna.
ColumnMappingPage.AddAllButton.tooltip=Utilice todas las columnas secundarias del nodo seleccionado como asignaci�n de columna.
ColumnMappingTable.upButton.tooltip=Mover asignaci�n de columna hacia arriba.
ColumnMappingTable.downButton.tooltip=Mover asignaci�n de columna hacia abajo.
ColumnMappingTable.removeButton.tooltip=Quitar asignaci�n de columna.
ColumnMappingTable.editButton.tooltip=Editar asignaci�n de columna.
ColumnMappingTable.previewButton.tooltip=Vista previa de datos XML de muestra. 
ColumnMappingDialog.group.message=Selecci�n XPath
ColumnMappingDialog.info.columnName=Nombre de &columna:
ColumnMappingDialog.info.xPath=E&xpresi�n XPath:
ColumnMappingDialog.info.dataType=Tipo de &datos:
ColumnMappingDialog.dialog.info=Seleccione alguna de las expresiones XPath predefinidas para la columna actual o introduzca otra expresi�n XPath. 
ColumnMappingDialog.prompt.maxRow=Los datos fuente tienen m�s de 500 l�neas. La vista previa s�lo mostrar� las primeras 500 l�neas en esta p�gina.
ColumnMappingDialog.MenuItem.CreateParameter=Crear par�metro
ColumnMappingDialog.MenuItem.DeleteParameter=Eliminar par�metro
XMLDataPreviewDialog.title=Datos XML de muestra

dataset.editor.columnName=Nombre
dataset.editor.xpathexpression=XPath
dataset.editor.datatype=Tipo
dataset.editor.rowelement=Elemento de fila
dataset.error.populateXMLTree=No se puede recuperar la fuente de datos XML. El archivo de fuente de datos XML no es v�lido o no existe.
dataset.error.CannotPopulateXMLTree=No se puede recuperar la fuente de datos XML.

error.label=Error
error.selectFolder=La URL de archivo seleccionada no es v�lida o el archivo no existe.
error.emptyPath=La URL del archivo est� vac�a.
error.xpath.canNotContainAttribute=No se puede asignar la expresi�n XPath a un atributo XML.
error.xpath.getPathList=Se ha producido un error al obtener la lista de XPath por el elemento del �rbol XML seleccionado.
error.dataset.Error.MissingFileLocation=Especifique la ubicaci�n del archivo XML.
error.dataset.maxRowNumberError=La fila m�xima debe ser un n�mero.
error.columnMapping.createPage=Se ha producido un error en la p�gina de asignaci�n de columna. 
error.columnMapping.columnElement.create=Se ha producido un error al asignar un elemento de asignaci�n de columna.
error.columnMapping.columnElement.edit=Se ha producido un error al editar el elemento de asignaci�n de columna.
error.columnMapping.ATreeNode.getChildren=Se ha producido un error al recuperar los nodos secundarios del elemento XML seleccionado.
error.columnMapping.SelectedTreeItem.notNull=No se ha seleccionado ning�n elemento del �rbol para crear un elemento de asignaci�n de columna. Seleccione uno o m�s elementos.
error.columnMapping.noMappingColumn=Asigne al menos una columna.
error.columnMapping.tableMappingXPathNotExist=La asignaci�n de tablas XPath no existe.
error.file.null=Todas las URL est�n vac�as, lo que significa que no ha seleccionado ninguna fuente de datos. �Seguro que desea conservarlo?
error.columnMapping.sameColumnName=El nombre de la columna [{0}] ya existe. Utilice otro nombre.
error.invalidXpath=La expresi�n XPath no es v�lida.
error.invalidSource=No se puede encontrar el archivo fuente .xml.

#data types for column mapping
datatypes.dateTime=Fecha Hora
datatypes.decimal=Decimal
datatypes.float=Flotante
datatypes.integer=Entero
datatypes.string=String
datatypes.date=Fecha
datatypes.time=Hora
datatypes.boolean=Booleano

#column name in column mapping table
columnName.name=Nombre
columnName.xPathName=XPath
columnName.typeName=Tipo

dataset.new=Nuevo conjunto de datos
file.choose=&Examinar...
schema.choose=E&xaminar...
title.warning=Advertencia
FileSelectionButton.menuItem.absolutePath=&Ruta absoluta
FileSelectionButton.menuItem.relativePath=&Ruta relativa
SelectRelativeFileDialog.Title=Seleccionar un archivo

datasource.propertyPage.tooltip=Fuente de datos XML
wizard.autoEncoding=Autom�tico
