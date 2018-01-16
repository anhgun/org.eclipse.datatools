###############################################################################
# Copyright (c) 2001, 2004, 2008 IBM Corporation and others.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
# 
# Contributors:
#     IBM Corporation - initial API and implementation
###############################################################################
pluginName=Eclipse Data Tools Platform SQM UI Plug-in
providerName=Eclipse Data Tools Platform

#
## Extension Point Names
#
LABEL_SERVICE_EXTENSION_POINT_NAME=labelService
ELEMENT_ID_EXTENSION_POINT_NAME=elementID
MARKER_NAVIGATION_PROVIDER_EXTENSION_POINT_NAME=markerNavigationProvider
DATA_SOURCE_EXPLORER_SORTER=sorterValidatorProvider
FILTER_INFORMATION_EXTENSION_POINT_NAME=ɸѡ����Ϣ

#
## Model Explorer Selection
#
datatools.core.ui.modelExplorerSelection = ģ����Դ�����ѡ��

#
## Preferences for Label Decoration
#
datatools.core.ui.preferences.labeldecorators = ��ǩ����

#
## Preferences
#
datatools.core.ui.preferences.data = SQL ����
datatools.core.ui.preferences.output = ���

#
## Views
#
datatools.core.ui.modelElementProperties = ����ģ��Ԫ������
datatools.core.ui.views.interactiveSQL = ��ʾ SQL

#
## Model Explorer
#
datatools.core.ui.contentProviders = ����ģ�������ṩ����
datatools.core.ui.parserProviders = ����ģ�ͷ��������ṩ����
datatools.core.ui.iconProviders = ����ģ��ͼ���ṩ����

#
## Nature 
#
datatools.core.ui.projectNature = ���ݿ���Ŀ���ݱ���

#
## Wizards
# 
datatools.core.ui.category.project = ���ݿ�
datatools.core.ui.category.model = ���ݿ�ģ��
datatools.core.ui.project.basic = ���������Ŀ
datatools.core.ui.project.description = �������������Ŀ
datatools.core.ui.model.basic = ��������ģ��

#
## Preferences
#
datatools.core.ui.preferences.modeler = ����
datatools.core.ui.preferences.default = ���ݿ�ȱʡֵ

#
## Popup && Actions
#
datatools.core.ui.actions.close = �ر�
datatools.core.ui.actions.add = ���� SQL
datatools.core.ui.actions.addMQT = MQT
datatools.core.ui.actions.addSchema = �ܹ�
datatools.core.ui.actions.addTable = ��
datatools.core.ui.actions.addView = ��ͼ
datatools.core.ui.actions.addColumn = ��
datatools.core.ui.actions.delete = ɾ��
datatools.core.ui.actions.addTrigger = ������
datatools.core.ui.globalActionHandlerProviders = ����ȫ�ֲ���
datatools.core.ui.actions.selectSupplier = ������ΨһԼ����
datatools.core.ui.actions.fe=���� DDL...
datatools.core.ui.actions.re=�� DDL ���з��򹤳�...
datatools.core.ui.actions.dataModeler = ���ݽ�ģ��
datatools.core.ui.actions.addDomain = ��
datatools.core.ui.actions.addSequence = ����
datatools.core.ui.actions.addStoredProcedure = �洢����
datatools.core.ui.actions.addJavaStoredProcedure = Java �洢����
datatools.core.ui.actions.generateForeignKeyIndex = ����
datatools.core.ui.actions.generatePrimaryKeyIndex = ����
datatools.core.ui.actions.addDatabase = ���ݿ�
datatools.core.ui.actions.addTableIndex = ����
datatools.core.ui.actions.addTableCheckConstraint = ���Լ��
datatools.core.ui.actions.addUniqueConstraint = ΨһԼ��
datatools.core.ui.actions.addAlias = ����
datatools.core.ui.actions.addDistinctUDT = ��ֵ�û���������
datatools.core.ui.actions.addStructuredUDT = �ṹ���û���������
datatools.core.ui.actions.addMQTIndex = ����
datatools.core.ui.actions.addMQTTrigger = ������
#
## Editors
#
datatools.core.ui.model.editor = SQL ģ�ͱ༭��

#
## Decorators
#
datatools.core.ui.modelexplorer.modelExplorerColumnDecoration = ���ݹ��� - ����������
datatools.core.ui.modelexplorer.modelExplorerForeignKeyDecoration = ���ݹ��� - ���������ָʾ��
datatools.core.ui.modelexplorer.DependencyDecoration = ���ݹ��� - ����������
datatools.core.ui.modelexplorer.bookmarkDecoration  = ���ݹ��� - ��ǩָʾ��
datatools.core.ui.modelexplorer.filterDecoration = ���ݹ��� - ��������Դ������ɸѡ���ڵ�ָʾ��
datatools.core.ui.modelexplorer.indextriggerDecoration = ���ݹ��� - �����ʹ���������

#
## Model Explorer Sorter Provider
#
datatools.core.ui.modelexplorer.sorterProviders = ģ����Դ������������ṩ����
datatools.core.ui.modelexplorer.menu.storageOrderSorter = �洢��˳��
datatools.core.ui.modelexplorer.menu.name = ����
datatools.core.ui.modelexplorer.menu.type = ����
datatools.core.ui.modelexplorer.menu.stereotype = ����������
datatools.core.ui.modelexplorer.menu.visibility = �ɼ���

#
## Model Explorer DnD
#
datatools.core.ui.modelexplorer.dragDrop = �Ϸ�

#
## Marker
#
datatools.core.ui.modelexplorer.marker.dangling = ��������


#
## Type for Label Service 
#
database = ���ݿ�
schema = �ܹ�
baseTable = ��
column = ��
domain = ��
udt = �û���������
index = ����
procedure = �洢����
view = ��ͼ
parameter = ����
trigger = ������
sequence = ����
source= Դ
attributeDefinition = ���Զ���
function = �û����庯��
dependency = �����
primaryKey = ����
foreignKey = ���
folder = �߼��ļ���
CheckConstraint = ���Լ��
UniqueConstraint = ΨһԼ��
existingConnection = �����ļ���
connectedConnection = �����
disconnectedConnection = �ѶϿ�������
cachedConnection = �Ѹ��ٻ��������
catalog = Ŀ¼
user = �û�
group = ��
role = ��ɫ
authorization = ��Ȩ ID

DEFAULT_SCHEMA_FILTER_PROPERTY_PAGE_NAME=ȱʡ�ܹ�ɸѡ��
DEFAULT_TABLE_FILTER_PROPERTY_PAGE_NAME=ȱʡ��ɸѡ��
DEFAULT_STORED_PROCEDURE_FILTER_PROPERTY_PAGE_NAME=ȱʡ�洢����ɸѡ��
FILTER_SETTINGS_PROPERTY_PAGE_NAME=ɸѡ������