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
wizard.title.selectFolder=Source de donn�es XML
wizard.defaultMessage.selectFolder=D�finissez les URL du fichier XML et les informations du sch�ma.
wizard.title.newDataSet=Nouveau jeu de donn�es
wizard.title.selectXmlFile=S�lectionner des donn�es XML pour l'aper�u
wizard.defaultMessage.selectFile=S�lectionnez une source XML exemple pour permettre l'aper�u de donn�es lors de cette session.
wizard.title.xPathChoose=D�finir la mise en correspondance de table
wizard.defaultMessage.selectXPath=D�finir la mise en correspondance de la ligne du jeu de donn�es en s�lectionnant un �l�ment de la structure XML.\nChaque occurrence de l'�l�ment XML s�lectionn� dans le document XML est mis en correspondance avec une ligne du jeu de donn�es.
wizard.title.selectColumn=D�finir la mise en correspondance de colonne
wizard.title.defineColumnMapping=Cr�ez des colonnes de jeux de donn�es en s�lectionnant et en ajoutant des �l�ments provenant de la structure XML.\nChaque attribut ou chaque �l�ment XML ajout� est associ� � une colonne de jeu de donn�es. 

#preference
designer.preview.preference.numberOfElementPassedToGetSchema=Nombre d'�l�ments de donn�es � analyser pour le sch�ma XML :
designer.preview.preference.numberOfElementPassedToGetSchema.errormessage=Entrez un nombre compris entre 0 et {0}.
designer.preview.preference.columnMappingPage.group.title=Mise en correspondance de colonne

#XML data source folder selection wizard page
XMLSelectionWizardPage.message.error.emptyXMLSource=Veuillez pr�ciser l'URL source XML ou s�lectionner le fichier XML.

#row mapping page messages
xPathChoosePage.messages.elementSelection.label=S�lection de l'�l�ment XML
xPathChoosePage.messages.elementSelection.item.absolutePath=El�ments &XML intitul�s "{0}" sur un chemin d'acc�s absolu fixe\n
xPathChoosePage.messages.elementSelection.item.anyLocation=&El�ments XML intitul�s "{0}" n'importe o�\n
xPathChoosePage.messages.elementSelection.disable.absolutePath=El�ments &XML � tout chemin d'acc�s absolu fixe\n 
xPathChoosePage.messages.elementSelection.disable.anyLocation=&El�ments XML n'importe o�\n 
xPathChoosePage.messages.elementSelection.item.custom=Exp&ression XPath personnalis�e
xPathChoosePage.messages.xPathExpression=Expression &XPath
xPathChoosePage.messages.xmlStructure=Structure XML
xPathChoosePage.messages.xmlColumnMapping=Mise en correspondance de colonne
xPathChoosePage.messages.xpathChange=V�rifiez que la mise en correspondance de table modifi�e est compatible avec la mise en correspondance de colonne le cas �ch�ant.   
xPathChoosePage.FileNameIcon=Ic�ne du nom de fichier
xPathChoosePage.XMLElementIcon=Ic�ne d'�l�ment XML
xPathChoosePage.ColumnIcon=Ic�ne de colonne
xPathChoosePage.messages.btnAdd.tooltip=Utilisez le n�ud s�lectionn� comme expression XPath.
xPathChoosePage.messages.noURLOfSourceOrSchema=Aucune URL de source XML ou de sch�ma XML fournie.

#sample xml data file page messages
xmlDataSetSelectionPage.messages.lineofdata=premi�res lignes de donn�es source
xmlDataSetSelectionPage.warning.errorReadXMLFile=Erreur lors de la lecture des donn�es XML � partir du fichier [{0}]\n{1}. Voulez-vous tout de m�me continuer ?

#column mapping page messages
button.refresh=Actualiser
menu.menuItem.removeAll=Supprimer tout
menu.menuItem.remove=Supprimer
menu.button.add=&Ajouter...
menu.button.edit=Modifi&er...
menu.button.remove=Supp&rimer
menu.button.up=Vers le ha&ut
menu.button.down=Vers le &bas
menu.button.preview=Afficher le&s exemples de donn�es
lable.selectXmlFile=Entrez l'URL de la source &XML ou acc�dez au fichier contenant les donn�es :
label.selectEncoding=S�lectionner le &codage du sch�ma et de la source XML sp�cifi�s ci-dessus :
lable.selectXmlSchmaFile=Entrez l'URL du sch�ma X&ML ou acc�dez au fichier contenant le\n sch�ma. Ne renseignez pas ce champ si aucun sch�ma n'est disponible :
label.preview=A&per�u des
label.useXMLFileFromDataSource=&Utilisez le fichier XML d�fini dans la source de donn�es.
RowMappingDialog.title=S�lectionner ou modifier l'expression XPath.
RowMappingDialog.info=S�lectionnez une des expressions XPath pr�d�finies pour le noeud s�lectionn� ou\n entrez une autre expression :
ColumnMappingPage.AddSingleButton.tooltip=Utilisez le n�ud choisi comme mise en correspondance de colonne.
ColumnMappingPage.AddAllButton.tooltip=Utilisez toutes les colonnes filles du n�ud choisi comme mise en correspondance de colonne.
ColumnMappingTable.upButton.tooltip=D�placez la mise en correspondance de colonne vers le haut.
ColumnMappingTable.downButton.tooltip=D�placez la mise en correspondance de colonne vers le bas.
ColumnMappingTable.removeButton.tooltip=Supprimez la mise en correspondance de colonne.
ColumnMappingTable.editButton.tooltip=Modifiez la mise en correspondance de colonne.
ColumnMappingTable.previewButton.tooltip=Affichez les donn�es XML exemples. 
ColumnMappingDialog.group.message=S�lection XPath
ColumnMappingDialog.info.columnName=Nom de &colonne :
ColumnMappingDialog.info.xPath=Expression &XPath :
ColumnMappingDialog.info.dataType=Type de &donn�es :
ColumnMappingDialog.dialog.info=S�lectionnez une des expressions XPath pr�d�finies pour la colonne en cours ou entrez une nouvelle expression XPath. 
ColumnMappingDialog.prompt.maxRow=La source de donn�es d�passe 500 lignes. Cette page ne permet d'afficher que les 500 premi�res lignes.
ColumnMappingDialog.MenuItem.CreateParameter=Cr�er un param�tre
ColumnMappingDialog.MenuItem.DeleteParameter=Supprimer le param�tre
XMLDataPreviewDialog.title=Donn�es XML exemples

dataset.editor.columnName=Nom
dataset.editor.xpathexpression=XPath
dataset.editor.datatype=Type
dataset.editor.rowelement=El�ment de ligne
dataset.error.populateXMLTree=La source de donn�es XML ne peut pas �tre r�cup�r�e. Le fichier de source de donn�es XML est incorrect ou le fichier n'existe pas.
dataset.error.CannotPopulateXMLTree=La source de donn�es XML ne peut pas �tre r�cup�r�e.

error.label=Erreur
error.selectFolder=L'URL de fichier s�lectionn�e n'est pas valide ou le fichier n'existe pas.
error.emptyPath=L'URL du fichier est vide.
error.xpath.canNotContainAttribute=L'expression XPath ne peut mettre en correspondance l'attribut XML.
error.xpath.getPathList=Une erreur s'est produite lors de la r�cup�ration de la liste XPath par l'�l�ment d'arborescence XML s�lectionn�.
error.dataset.Error.MissingFileLocation=Veuillez pr�ciser l'emplacement du fichier XML.
error.dataset.maxRowNumberError=Le nombre maximal de lignes doit �tre renseign� par un nombre.
error.columnMapping.createPage=Une erreur s'est produite dans la page de mise en correspondance de colonne 
error.columnMapping.columnElement.create=Une erreur s'est produite lors de la mise en correspondance d'un �l�ment de mise en correspondance de colonne.
error.columnMapping.columnElement.edit=Une erreur s'est produite lors de la modification d'un �l�ment d'une colonne de mise en correspondance.
error.columnMapping.ATreeNode.getChildren=Une erreur s'est produite lors le la r�cup�ration des n�uds enfants de l'�l�ment XML s�lectionn�.
error.columnMapping.SelectedTreeItem.notNull=Aucun �l�ment d'arborescence n'est s�lectionn� pour cr�er un �l�ment de mise en correspondance de colonne.
error.columnMapping.noMappingColumn=Veuillez mettre au moins une colonne en correspondance.
error.columnMapping.tableMappingXPathNotExist=L'expression XPath de mise en correspondance de table n'existe pas.
error.file.null=Toutes les URL sont vides. Vous n'avez donc pas s�lectionn� de source de donn�es. Souhaitez-vous continuer ?
error.columnMapping.sameColumnName=Le nom de colonne [{0}] existe d�j�. Utilisez un autre nom.
error.invalidXpath=L'expression XPath est incorrecte.
error.invalidSource=Fichier source xml introuvable.

#data types for column mapping
datatypes.dateTime=Date Heure
datatypes.decimal=D�cimales
datatypes.float=Flottant
datatypes.integer=Entier
datatypes.string=Cha�ne
datatypes.date=Date
datatypes.time=Heure
datatypes.boolean=Bool�en

#column name in column mapping table
columnName.name=Nom
columnName.xPathName=XPath
columnName.typeName=Type

dataset.new=Nouveau jeu de donn�es
file.choose=Parc&ourir...
schema.choose=&Parcourir...
title.warning=Avertissement
FileSelectionButton.menuItem.absolutePath=Chemin d'acc�s &absolu
FileSelectionButton.menuItem.relativePath=Chemin d'acc�s &relatif
SelectRelativeFileDialog.Title=S�lectionner un fichier

datasource.propertyPage.tooltip=Source de donn�es XML
wizard.autoEncoding=Auto
