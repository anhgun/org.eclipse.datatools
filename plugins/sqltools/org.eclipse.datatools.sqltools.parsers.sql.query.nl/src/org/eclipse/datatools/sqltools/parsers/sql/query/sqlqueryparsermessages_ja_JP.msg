# NLS_MESSAGEFORMAT_VAR          needed to handle quotes correctly
#
# File: sqlqueryparsermessage.properties
# Description: Properties file for classes in the SQLQueryParser Plugin

# ==============================================================================
# Copyright (c) 2004, 2005 IBM Corporation and others.
# All rights reserved. This program and the accompanying materials 
# are made available under the terms of the Eclipse Public License v1.0
# which is available at
# http://www.eclipse.org/legal/epl-v10.html
# ==============================================================================

DataTypeResolver.DATA_TYPE_UNDETERMINED 		= "{0}" �̃f�[�^�^���s���ł��B
DataTypeResolver.VARIABLE_TYPE_UNDETERMINED 	= �ϐ� "{0}" �̃f�[�^�^���s���ł��B
DataTypeResolver.DATA_TYPES_INCOMPATIBLE		= "{0}" �� "{1}" �̃f�[�^�^�Ɍ݊���������܂���B

TableReferenceResolver.SCHEMAS_NOT_LOADED   	= �f�[�^�x�[�X�X�L�[�}��������܂���B�f�[�^�x�[�X�ڑ� "{0}" ���m�F���Ă��������B
TableReferenceResolver.UNRESOLVED_COLUMN		= �� "{0}" �̃e�[�u����������܂���B
TableReferenceResolver.UNRESOLVED_TABLE			= �e�[�u�� "{0}" ��������܂���B
TableReferenceResolver.TABLE_HAS_NO_SUCH_COLUMN	= �e�[�u�� "{0}" �ɗ� "{1}" ���܂܂�Ă��܂���B
TableReferenceResolver.AMBIGUOUS_COLUMN			= �� "{0}" �������܂��ł��B
TableReferenceResolver.AMBIGUOUS_TABLE			= �e�[�u���� "{0}" �������܂��ł��B
TableReferenceResolver.AMBIGUOUS_TABLE_ALIAS	= �e�[�u���̃G�C���A�X "{0}" �������܂��ł��B

RoutineReferenceResolver.UNRESOLVED_PROC        = �v���V�[�W����������܂���B
RoutineReferenceResolver.INCORRECT_PARM_COUNT	= �p�����^�̐�������������܂���B

#
# following messages to translate names of syntax rules that were violated and caused parser error
# fill-ins - no sentences! first letter should be lower case if not a KEYWORD
#
! uppercase words are keywords and not to be translated
! "predicate" is a SQL language term equivalent to the word "test"
! "term", "factor" are closely related to mathematical terms "term" and "factor"
SQLQueryParser.<alias_name> 					= �G�C���A�X��
SQLQueryParser.<all_or_any_cond>		 		= �ʉ���r
SQLQueryParser.<as_alias> 						= AS �̃G�C���A�X��
SQLQueryParser.<boolean_expression>				= �_���l�̎�
SQLQueryParser.<boolean_factor> 				= �_���l�̃t�@�N�^
SQLQueryParser.<boolean_primary> 				= �_���l�̃v���C�}��
SQLQueryParser.<boolean_term> 					= �_���l�̍�
SQLQueryParser.<boolean_values> 				= truth �l
SQLQueryParser.<case_expression> 				= CASE ��
SQLQueryParser.<case_search_when> 				= WHEN-THEN ����
SQLQueryParser.<case_search_when_list> 			= WHEN-THEN �����̃��X�g
SQLQueryParser.<case_simple_when> 				= WHEN-THEN ��
SQLQueryParser.<case_simple_when_list>	 		= WHEN-THEN ���̃��X�g
SQLQueryParser.<cast_expression> 				= CAST ��
SQLQueryParser.<column> 						= ��
SQLQueryParser.<column_name> 					= ��
SQLQueryParser.<column_name_list> 				= �񖼂̃��X�g
SQLQueryParser.<column_ref> 					= ��Q��
SQLQueryParser.<condition> 						= ����
SQLQueryParser.<constant> 						= �ȈՒl
SQLQueryParser.<datatype> 						= �f�[�^�^
SQLQueryParser.<datatype_array_type> 			= ARRAY �f�[�^�^
SQLQueryParser.<datatype_binary> 				= �o�C�i���̃f�[�^�^
SQLQueryParser.<datatype_predefined>			= ��`�ς݂̃f�[�^�^
SQLQueryParser.<datatype_character> 			= �����̃f�[�^�^
SQLQueryParser.<datatype_character_national>	= �i�V���i���L�����N�^�̃f�[�^�^
SQLQueryParser.<datatype_collection_type> 		= �R���N�V�����̃f�[�^�^
SQLQueryParser.<datatype_date> 					= ���t�̃f�[�^�^
SQLQueryParser.<datatype_multiset_type> 		= MULTISET �f�[�^�^
SQLQueryParser.<datatype_numerical> 			= ���l�̃f�[�^�^
SQLQueryParser.<datatype_numerical_approximate>	= �ߎ��l�̃f�[�^�^
SQLQueryParser.<datatype_numerical_exact> 		= ���m�l�̃f�[�^�^
SQLQueryParser.<datatype_numerical_fixed_precision>	= �Œ菬���_�̃f�[�^�^
SQLQueryParser.<datatype_numerical_integer> 	= �����̃f�[�^�^
SQLQueryParser.<datatype_opt_size_unit> 		= �f�[�^�^�̒����̏搔 (K�AM�A�܂��� G)
SQLQueryParser.<datatype_time> 					= ���Ԃ̃f�[�^�^
SQLQueryParser.<datatype_user_defined_distinct>	= �ʂ̃��[�U��`�^
SQLQueryParser.<delete_stmt> 					= DELETE ��
SQLQueryParser.<duration> 						= ����
SQLQueryParser.<exists> 						= EXISTS �q��
SQLQueryParser.<expression> 					= �l��
SQLQueryParser.<expression_commalist> 			= �l���̃R���}��؂胊�X�g
SQLQueryParser.<expression_commalist_multiple_elements>	= �l���̃R���}��؂胊�X�g (�����̗v�f)
SQLQueryParser.<expression_factor> 				= �l���̃t�@�N�^
SQLQueryParser.<expression_term>		 		= �l���̍�
SQLQueryParser.<func_ref> 						= �֐��̎Q��
SQLQueryParser.<function> 						= �֐�
SQLQueryParser.<grouping> 						= GROUP BY ��
SQLQueryParser.<grouping_exp> 					= �O���[�v��
SQLQueryParser.<grouping_sets> 					= GROUPING SETS
SQLQueryParser.<grouping_sets_element> 			= GROUPING SETS �̗v�f
SQLQueryParser.<grouping_sets_element_exp> 		= GROUPING SETS �̗v�f�̎�
SQLQueryParser.<grouping_sets_element_exp_list>	= GROUPING SETS �̗v�f�̎��̃��X�g
SQLQueryParser.<grouping_sets_element_list> 	= GROUPING SETS �̗v�f�̃��X�g
SQLQueryParser.<grouping_spec> 					= GROUP BY �̎w��
SQLQueryParser.<grouping_spec_list> 			= GROUP BY �̎w��̃��X�g
SQLQueryParser.<identifier> 					= ���ʎq
SQLQueryParser.<in_cond> 						= IN �q��
SQLQueryParser.<insert_row> 					= �s�̑}��
SQLQueryParser.<insert_row_commalist> 			= �}���s�̃J���}��؂胊�X�g
SQLQueryParser.<insert_stmt> 					= INSERT ��
SQLQueryParser.<intervaltest> 					= BETWEEN �q��
SQLQueryParser.<liketest> 						= LIKE �q��
! "predicate" here could also be "test" 
SQLQueryParser.<nulltest> 						= NULL �q��
SQLQueryParser.<opt_all_distinct> 				= ALL �܂��� DISTINCT
SQLQueryParser.<opt_as> 						= �I�v�V������ AS
SQLQueryParser.<opt_as_alias> 					= �I�v�V������ AS �̃G�C���A�X��
SQLQueryParser.<opt_as_target_table> 			= �I�v�V������ AS �̃^�[�Q�b�g�e�[�u��
SQLQueryParser.<opt_asc_desc> 					= �I�v�V������ ASC �܂��� DESC
SQLQueryParser.<opt_case_else> 					= �I�v�V������ ELSE ��
SQLQueryParser.<opt_column_name_list> 			= �񖼂̃I�v�V�����̃��X�g
SQLQueryParser.<opt_escape> 					= �I�v�V������ ESCAPE ��
SQLQueryParser.<opt_expression_commalist> 		= �l���̃I�v�V�����̃J���}��؂胊�X�g
SQLQueryParser.<opt_group_by_clause> 			= �I�v�V������ GROUP BY ��
SQLQueryParser.<opt_having_clause> 				= �I�v�V������ HAVING ��
SQLQueryParser.<opt_join_type> 					= �I�v�V������ JOIN �^
SQLQueryParser.<opt_join_type_outer> 			= �I�v�V������ OUTER
SQLQueryParser.<opt_order_by_clause> 			= �I�v�V������ ORDER BY ��
! "Schema" is a database related term
SQLQueryParser.<opt_schema_dot> 				= �I�v�V�����̃X�L�[�}�C���q
! "table" is a database related term
SQLQueryParser.<opt_table_correlation> 			= �I�v�V�����̃e�[�u���G�C���A�X
SQLQueryParser.<opt_target_column_list> 		= �^�[�Q�b�g��̃I�v�V�����̃��X�g
SQLQueryParser.<opt_where_clause> 				= �I�v�V������ WHERE ��
SQLQueryParser.<ordering_spec> 					= �����̎w��
SQLQueryParser.<ordering_spec_commalist> 		= �����̎w��̃J���}��؂胊�X�g
SQLQueryParser.<parameter> 						= �p�����^
SQLQueryParser.<project> 						= �I��
SQLQueryParser.<query_combined> 				= �����N�G��
SQLQueryParser.<query_combined_operator>		= �����N�G�����Z�q UNION�AEXCEPT�A�܂��� INTERSECT
SQLQueryParser.<query_exp>						= �N�G����
SQLQueryParser.<query_exp_root>					= �N�G����
SQLQueryParser.<query_select>					= SELECT �N�G��
SQLQueryParser.<query_stmt>						= SQL �N�G����
SQLQueryParser.<query_term>						= �N�G���W�J
SQLQueryParser.<query_values>					= VALUES �e�[�u���R���X�g���N�^
SQLQueryParser.<relop>							= �����[�V���i�����Z�q
SQLQueryParser.<scalcomp>						= �X�J���[��r
SQLQueryParser.<schema>							= �X�L�[�}
SQLQueryParser.<selection>						= �I��
SQLQueryParser.<simplecomp>						= �ȈՔ�r
SQLQueryParser.<special_register>				= ���ꃌ�W�X�^
SQLQueryParser.<sql_dml_stmt>					= SQL DML ��
SQLQueryParser.<sql_dml_stmt_list>				= SQL DML ���̃��X�g
SQLQueryParser.<sql_dml_stmt_xspan>				= SQL DML ���̃��X�g
SQLQueryParser.<subquery>						= �T�u�N�G��
SQLQueryParser.<super_groups>					= CUBE �܂��� ROLLUP �̃O���[�v��
SQLQueryParser.<super_groups_element>			= �O���[�v��
SQLQueryParser.<super_groups_element_exp>		= �O���[�v��
SQLQueryParser.<super_groups_element_exp_list>	= ���̃O���[�v���̃��X�g
SQLQueryParser.<super_groups_element_list>		= ���̃O���[�v���̃��X�g
SQLQueryParser.<table>							= �e�[�u��
SQLQueryParser.<table_correlation>				= �e�[�u���̃G�C���A�X
SQLQueryParser.<table_join>						= �W���C�����ꂽ�e�[�u��
SQLQueryParser.<table_name_or_alias> 			= �e�[�u�����܂��̓e�[�u���̃G�C���A�X
SQLQueryParser.<table_query>					= �l�X�g���ꂽ�e�[�u���̃N�G��
SQLQueryParser.<table_ref>						= �e�[�u���Q��
SQLQueryParser.<table_ref_commalist>			= �e�[�u���Q�Ƃ̃R���}��؂胊�X�g
SQLQueryParser.<target_column_list>				= �^�[�Q�b�g��̃��X�g
SQLQueryParser.<target_table>					= �^�[�Q�b�g�e�[�u��
SQLQueryParser.<update_assignment_clause>		= UPDATE �����
SQLQueryParser.<update_assignment_expression>	= UPDATE �����
SQLQueryParser.<update_assignment_expression_commalist>	= UPDATE ������̃R���}��؂胊�X�g
SQLQueryParser.<update_stmt>					= UPDATE ��
SQLQueryParser.<values_row>						= �l�̍s
SQLQueryParser.<values_row>						= �l�̍s
SQLQueryParser.<values_row_commalist>			= �l�̍s�̃R���}��؂胊�X�g
SQLQueryParser.<with_clause>					= WITH ��
SQLQueryParser.<with_table_spec>				= WITH �e�[�u���̎w��
SQLQueryParser.<with_table_spec_list>			= WITH �e�[�u���̎w��̃��X�g



SQLQueryDB2Parser.<olap_aggregation_function>	= OLAP �W�v�֐�
SQLQueryDB2Parser.<olap_current_row>			= ���݂̍s
SQLQueryDB2Parser.<olap_function>				= OLAP �֐�
SQLQueryDB2Parser.<olap_group_end>				= FOLLOWING ��
SQLQueryDB2Parser.<olap_group_start>			= PRECEDING ��
SQLQueryDB2Parser.<olap_group_type>				= OLAP �O���[�v�̌^
SQLQueryDB2Parser.<olap_numbering_function>		= OLAP �ԍ��t���֐�
SQLQueryDB2Parser.<olap_order_by_expression>	= OLAP ORDER BY ��
SQLQueryDB2Parser.<olap_order_by_list>			= OLAP ORDER BY ���̃��X�g
SQLQueryDB2Parser.<olap_partitioning_expression_list>	= OLAP �p�[�e�B�V�������̃��X�g
SQLQueryDB2Parser.<olap_partitioning_expression>		= OLAP �p�[�e�B�V������
SQLQueryDB2Parser.<olap_rank_or_dense_rank>				= RANK() �܂��� DENSE_RANK()
SQLQueryDB2Parser.<olap_ranking_function>				= OLAP �����N�t���֐�
SQLQueryDB2Parser.<olap_rows_or_range>					= ROWS �܂��� RANGE
SQLQueryDB2Parser.<olap_window_order_clause>			= OLAP �E�B���h�E�� ORDER ��
SQLQueryDB2Parser.<opt_olap_asc_desc>					= OLAP ASC/DESC �̎w��
SQLQueryDB2Parser.<opt_olap_window_aggregation_group>	= �I�v�V������ OLAP �E�B���h�E�̏W�v�O���[�v
SQLQueryDB2Parser.<opt_olap_window_order_agregration_group>	= �I�v�V������ OLAP �E�B���h�E�� ORDER ��̏W�v�O���[�v 
SQLQueryDB2Parser.<opt_olap_window_order_clause>			= �I�v�V������ OLAP �E�B���h�E�� ORDER ��
SQLQueryDB2Parser.<opt_olap_window_parition_clause>			= �I�v�V������ OLAP �E�B���h�E�� PARTITION ��

SQLQueryDB2Parser.<opt_xml_element_attributes_function>		= �I�v�V������ XMLATTRIBUTES �֐�
SQLQueryDB2Parser.<opt_xml_element_content_list>			= XML �v�f�̃R���e�L�X�g���̃I�v�V�����̃��X�g
SQLQueryDB2Parser.<opt_xml_element_namespaces_function>		= �I�v�V������ XMLNAMESPACES �֐�
SQLQueryDB2Parser.<opt_xml_forest_namespaces_function>		= �I�v�V������ XMLNAMESPACES �֐�
SQLQueryDB2Parser.<xml_agg_function>			= XMLAGG �֐�
SQLQueryDB2Parser.<xml_attribute_list>			= XML �������̃��X�g
SQLQueryDB2Parser.<xml_attribute>				= XML ������
SQLQueryDB2Parser.<xml_attributes_function>		= XMLATTRIBUTES �֐�
SQLQueryDB2Parser.<xml_concat_function>			= XMLCONCAT �֐�
SQLQueryDB2Parser.<xml_element_content_list>	= XML �v�f�̃R���e�L�X�g���̃��X�g
SQLQueryDB2Parser.<xml_element_content>			= XML �v�f�̃R���e�L�X�g��
SQLQueryDB2Parser.<xml_element_function>		= XMLELEMENT �֐�
SQLQueryDB2Parser.<xml_forest_element_list>		= XMLFOREST �v�f�̃��X�g
SQLQueryDB2Parser.<xml_forest_element>			= XMLFOREST �v�f�̎�
SQLQueryDB2Parser.<xml_forest_function>			= XMLFOREST �֐���XMLSERIALIZE �܂��� XML2CLOB
SQLQueryDB2Parser.<xml_function>				= XML �֐� 
SQLQueryDB2Parser.<xml_namespace_list>			= XML �l�[���X�y�[�X�̃��X�g
SQLQueryDB2Parser.<xml_namespace_prefix>		= XML �l�[���X�y�[�X�̐ړ���
SQLQueryDB2Parser.<xml_namespace_uri>			= XML �l�[���X�y�[�X�� URI
SQLQueryDB2Parser.<xml_namespace>				= XML �l�[���X�y�[�X
SQLQueryDB2Parser.<xml_namespaces_function>		= XMLNAMESPACES �֐�
SQLQueryDB2Parser.<xml_value_datatype>			= XML �l�̃f�[�^�^
SQLQueryDB2Parser.<xml_value_function_list>		= XML �l�̊֐��̃��X�g
SQLQueryDB2Parser.<xml_value_function>			= XML �l�̊֐�

