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
FILTER_INFORMATION_EXTENSION_POINT_NAME=filterInformation

#
## Model Explorer Selection
#
datatools.core.ui.modelExplorerSelection = ���f���G�N�X�v���[���̑I��

#
## Preferences for Label Decoration
#
datatools.core.ui.preferences.labeldecorators = ���x���̑���

#
## Preferences
#
datatools.core.ui.preferences.data = SQL �J��
datatools.core.ui.preferences.output = �o��

#
## Views
#
datatools.core.ui.modelElementProperties = �f�[�^���f���v�f�̃v���p�e�B
datatools.core.ui.views.interactiveSQL = SQL ��\��

#
## Model Explorer
#
datatools.core.ui.contentProviders = �������f���̃R���e���c�̃v���o�C�_
datatools.core.ui.parserProviders = �������f���̃p�[�T�̃v���o�C�_
datatools.core.ui.iconProviders = �������f���̃A�C�R���̃v���o�C�_

#
## Nature 
#
datatools.core.ui.projectNature = �f�[�^�x�[�X�v���W�F�N�g�̃f�[�^�̖{��

#
## Wizards
# 
datatools.core.ui.category.project = �f�[�^�x�[�X
datatools.core.ui.category.model = �f�[�^�x�[�X���f��
datatools.core.ui.project.basic = �f�[�^�f�U�C���v���W�F�N�g
datatools.core.ui.project.description = �f�[�^�f�U�C���v���W�F�N�g�̍쐬
datatools.core.ui.model.basic = �����f�[�^���f��

#
## Preferences
#
datatools.core.ui.preferences.modeler = �f�[�^
datatools.core.ui.preferences.default = �f�[�^�x�[�X�̃f�t�H���g�l

#
## Popup && Actions
#
datatools.core.ui.actions.close = ����
datatools.core.ui.actions.add = SQL �̒ǉ�
datatools.core.ui.actions.addMQT = MQT
datatools.core.ui.actions.addSchema = �X�L�[�}
datatools.core.ui.actions.addTable = �e�[�u��
datatools.core.ui.actions.addView = �r���[
datatools.core.ui.actions.addColumn = ��
datatools.core.ui.actions.delete = �폜
datatools.core.ui.actions.addTrigger = �g���K
datatools.core.ui.globalActionHandlerProviders = �f�[�^�̃O���[�o���A�N�V����
datatools.core.ui.actions.selectSupplier = �ŗL�̐���e�[�u���ւ̈ړ�
datatools.core.ui.actions.fe=DDL �̐���...
datatools.core.ui.actions.re=DDL ����̃��o�[�X�G���W�j�A�����O...
datatools.core.ui.actions.dataModeler = �f�[�^���f��
datatools.core.ui.actions.addDomain = �h���C��
datatools.core.ui.actions.addSequence = �V�[�P���X
datatools.core.ui.actions.addStoredProcedure = �X�g�A�h�v���V�[�W��
datatools.core.ui.actions.addJavaStoredProcedure = Java �X�g�A�h�v���V�[�W��
datatools.core.ui.actions.generateForeignKeyIndex = �C���f�b�N�X
datatools.core.ui.actions.generatePrimaryKeyIndex = �C���f�b�N�X
datatools.core.ui.actions.addDatabase = �f�[�^�x�[�X
datatools.core.ui.actions.addTableIndex = �C���f�b�N�X
datatools.core.ui.actions.addTableCheckConstraint = �`�F�b�N�̐���
datatools.core.ui.actions.addUniqueConstraint = �ŗL�̐���
datatools.core.ui.actions.addAlias = �G�C���A�X
datatools.core.ui.actions.addDistinctUDT = �ʂ̃��[�U��`�^
datatools.core.ui.actions.addStructuredUDT = �\�������ꂽ���[�U��`�^
datatools.core.ui.actions.addMQTIndex = �C���f�b�N�X
datatools.core.ui.actions.addMQTTrigger = �g���K
#
## Editors
#
datatools.core.ui.model.editor = SQL ���f���G�f�B�^

#
## Decorators
#
datatools.core.ui.modelexplorer.modelExplorerColumnDecoration = �f�[�^�c�[�� - ��̃f�[�^�^
datatools.core.ui.modelexplorer.modelExplorerForeignKeyDecoration = �f�[�^�c�[�� - �O���L�[�܂��̓v���C�}���L�[�̃C���W�P�[�^
datatools.core.ui.modelexplorer.DependencyDecoration = �f�[�^�c�[�� - �ˑ��֌W�̑���
datatools.core.ui.modelexplorer.bookmarkDecoration  = �f�[�^�c�[�� - �u�b�N�}�[�N�̃C���W�P�[�^
datatools.core.ui.modelexplorer.filterDecoration = �f�[�^�c�[�� - �T�[�o�G�N�X�v���[���̃t�B���^�m�[�h�C���W�P�[�^
datatools.core.ui.modelexplorer.indextriggerDecoration = �f�[�^�c�[�� - �C���f�b�N�X�ƃg���K�̑���

#
## Model Explorer Sorter Provider
#
datatools.core.ui.modelexplorer.sorterProviders = ���f���G�N�X�v���[���̃\�[�g�v���o�C�_
datatools.core.ui.modelexplorer.menu.storageOrderSorter = �ۑ��̏���
datatools.core.ui.modelexplorer.menu.name = ���O
datatools.core.ui.modelexplorer.menu.type = ���
datatools.core.ui.modelexplorer.menu.stereotype = �X�e���I�^�C�v
datatools.core.ui.modelexplorer.menu.visibility = �\��/��\��

#
## Model Explorer DnD
#
datatools.core.ui.modelexplorer.dragDrop = �h���b�O���h���b�v

#
## Marker
#
datatools.core.ui.modelexplorer.marker.dangling = ���݂�Q��


#
## Type for Label Service 
#
database = �f�[�^�x�[�X
schema = �X�L�[�}
baseTable = �e�[�u��
column = ��
domain = �h���C��
udt = ���[�U��`�^
index = �C���f�b�N�X
procedure = �X�g�A�h�v���V�[�W��
view = �r���[
parameter = �p�����^
trigger = �g���K
sequence = �V�[�P���X
source= �\�[�X
attributeDefinition = �����̒�`
function = ���[�U��`�̊֐�
dependency = �ˑ��֌W
primaryKey = �v���C�}���L�[
foreignKey = �O���L�[
folder = �_���t�H���_
CheckConstraint = �`�F�b�N�̐���
UniqueConstraint = �ŗL�̐���
existingConnection = �ڑ��t�H���_
connectedConnection = ���C�u�ڑ�
disconnectedConnection = �ؒf���ꂽ�ڑ�
cachedConnection = �L���b�V�����ꂽ�ڑ�
catalog = �J�^���O
user = ���[�U
group = �O���[�v
role = ����
authorization = �F�� ID

DEFAULT_SCHEMA_FILTER_PROPERTY_PAGE_NAME=�f�t�H���g�̃X�L�[�}�t�B���^
DEFAULT_TABLE_FILTER_PROPERTY_PAGE_NAME=�f�t�H���g�̃e�[�u���t�B���^
DEFAULT_STORED_PROCEDURE_FILTER_PROPERTY_PAGE_NAME=�f�t�H���g�̃X�g�A�h�v���V�[�W���t�B���^
FILTER_SETTINGS_PROPERTY_PAGE_NAME=�t�B���^�̐ݒ�