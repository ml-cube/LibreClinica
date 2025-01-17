-- Copyright 2003-2009 Akaza Research 
-- OpenClinica is distributed under the
-- GNU Lesser General Public License (GNU LGPL).
-- For details see: https://I3LUNG.org/license



CREATE INDEX i_audit_log_event_audit_table ON audit_log_event USING btree (audit_table);
CREATE INDEX i_audit_log_event_user_id ON audit_log_event USING btree (user_id);
CREATE INDEX i_audit_log_event_entity_id ON audit_log_event USING btree (entity_id);
CREATE INDEX i_audit_log_event_audit_log_event_type_id ON audit_log_event USING btree (audit_log_event_type_id);
CREATE INDEX i_audit_log_event_event_crf_id ON audit_log_event USING btree (event_crf_id);
CREATE INDEX i_audit_log_event_study_event_id ON audit_log_event USING btree (study_event_id);
CREATE INDEX i_audit_log_event_event_crf_version_id ON audit_log_event USING btree (event_crf_version_id);
CREATE INDEX i_null_value_type_code ON null_value_type USING btree (code);
CREATE INDEX i_rule_oc_oid ON rule USING btree (oc_oid);
CREATE INDEX i_rule_rule_expression_id ON rule USING btree (rule_expression_id);
CREATE INDEX i_rule_status_id ON rule USING btree (status_id);
CREATE INDEX i_rule_action_rule_set_rule_id ON rule_action USING btree (rule_set_rule_id);
CREATE INDEX i_rule_action_action_type ON rule_action USING btree (action_type);
CREATE INDEX i_rule_action_status_id ON rule_action USING btree (status_id);
CREATE INDEX i_rule_expression_status_id ON rule_expression USING btree (status_id);
CREATE INDEX i_rule_set_rule_expression_id ON rule_set USING btree (rule_expression_id);
CREATE INDEX i_rule_set_study_event_definition_id ON rule_set USING btree (study_event_definition_id);
CREATE INDEX i_rule_set_crf_id ON rule_set USING btree (crf_id);
CREATE INDEX i_rule_set_crf_version_id ON rule_set USING btree (crf_version_id);
CREATE INDEX i_rule_set_study_id ON rule_set USING btree (study_id);
CREATE INDEX i_rule_set_status_id ON rule_set USING btree (status_id);
CREATE INDEX i_rule_set_audit_rule_set_id ON rule_set_audit USING btree (rule_set_id);
CREATE INDEX i_rule_set_audit_status_id ON rule_set_audit USING btree (status_id);
CREATE INDEX i_rule_set_rule_rule_set_id ON rule_set_rule USING btree (rule_set_id);
CREATE INDEX i_rule_set_rule_rule_id ON rule_set_rule USING btree (rule_id);
CREATE INDEX i_rule_set_rule_status_id ON rule_set_rule USING btree (status_id);
CREATE INDEX i_rule_set_rule_audit_rule_set_rule_id ON rule_set_rule_audit USING btree (rule_set_rule_id);
CREATE INDEX i_rule_set_rule_audit_status_id ON rule_set_rule_audit USING btree (status_id);
CREATE INDEX i_dn_event_crf_map_event_crf_id ON dn_event_crf_map USING btree (event_crf_id);
CREATE INDEX i_dn_event_crf_map_discrepancy_note_id ON dn_event_crf_map USING btree (discrepancy_note_id);
CREATE INDEX i_dn_item_data_map_item_data_id ON dn_item_data_map USING btree (item_data_id);
CREATE INDEX i_dn_item_data_map_discrepancy_note_id ON dn_item_data_map USING btree (discrepancy_note_id);
CREATE INDEX i_dn_study_event_map_study_event_id ON dn_study_event_map USING btree (study_event_id);
CREATE INDEX i_dn_study_event_map_discrepancy_note_id ON dn_study_event_map USING btree (discrepancy_note_id);
CREATE INDEX i_dn_study_subject_map_study_subject_id ON dn_study_subject_map USING btree (study_subject_id);
CREATE INDEX i_dn_study_subject_map_discrepancy_note_id ON dn_study_subject_map USING btree (discrepancy_note_id);
CREATE INDEX i_discrepancy_note_discrepancy_note_type_id ON discrepancy_note USING btree (discrepancy_note_type_id);
CREATE INDEX i_discrepancy_note_resolution_status_id ON discrepancy_note USING btree (resolution_status_id);
CREATE INDEX i_discrepancy_note_owner_id ON discrepancy_note USING btree (owner_id);
CREATE INDEX i_discrepancy_note_parent_dn_id ON discrepancy_note USING btree (parent_dn_id);
CREATE INDEX i_discrepancy_note_entity_type ON discrepancy_note USING btree (entity_type);
CREATE INDEX i_discrepancy_note_study_id ON discrepancy_note USING btree (study_id);
CREATE INDEX i_dn_subject_map_subject_id ON dn_subject_map USING btree (subject_id);
CREATE INDEX i_dn_subject_map_discrepancy_note_id ON dn_subject_map USING btree (discrepancy_note_id);
--CREATE INDEX i_audit_event_audit_table ON audit_event USING btree (audit_table);
--CREATE INDEX i_audit_event_user_id ON audit_event USING btree (user_id);
--CREATE INDEX i_audit_event_entity_id ON audit_event USING btree (entity_id);
CREATE INDEX i_dataset_crf_version_map_dataset_id ON dataset_crf_version_map USING btree (dataset_id);
CREATE INDEX i_dataset_crf_version_map_event_definition_crf_id ON dataset_crf_version_map USING btree (event_definition_crf_id);
CREATE INDEX i_dataset_study_group_class_map_dataset_id ON dataset_study_group_class_map USING btree (dataset_id);
CREATE INDEX i_dataset_study_group_class_map_study_group_class_id ON dataset_study_group_class_map USING btree (study_group_class_id);
--CREATE INDEX i_dataset_study_id ON dataset USING btree (study_id);
CREATE INDEX i_dataset_status_id ON dataset USING btree (status_id);
CREATE INDEX i_dataset_filter_map_dataset_id ON dataset_filter_map USING btree (dataset_id);
CREATE INDEX i_dataset_filter_map_filter_id ON dataset_filter_map USING btree (filter_id);
CREATE INDEX i_dataset_filter_map_ordinal ON dataset_filter_map USING btree (ordinal);
CREATE INDEX i_dc_primitive_decision_condition_id ON dc_primitive USING btree (decision_condition_id);
CREATE INDEX i_dc_primitive_item_id ON dc_primitive USING btree (item_id);
CREATE INDEX i_dc_primitive_dynamic_value_item_id ON dc_primitive USING btree (dynamic_value_item_id);
CREATE INDEX i_dc_section_event_section_id ON dc_section_event USING btree (section_id);
CREATE INDEX i_dc_substitution_event_item_id ON dc_substitution_event USING btree (item_id);
CREATE INDEX i_dc_computed_event_dc_event_id ON dc_computed_event USING btree (dc_event_id);
CREATE INDEX i_dc_computed_event_item_target_id ON dc_computed_event USING btree (item_target_id);
CREATE INDEX i_dc_summary_item_map_item_id ON dc_summary_item_map USING btree (item_id);
CREATE INDEX i_decision_condition_crf_version_id ON decision_condition USING btree (crf_version_id);
CREATE INDEX i_decision_condition_status_id ON decision_condition USING btree (status_id);
CREATE INDEX i_completion_status_status_id ON completion_status USING btree (status_id);
CREATE INDEX i_filter_crf_version_map_filter_id ON filter_crf_version_map USING btree (filter_id);
CREATE INDEX i_filter_crf_version_map_crf_version_id ON filter_crf_version_map USING btree (crf_version_id);
CREATE INDEX i_item_group_metadata_item_group_id ON item_group_metadata USING btree (item_group_id);
CREATE INDEX i_item_group_metadata_crf_version_id ON item_group_metadata USING btree (crf_version_id);
CREATE INDEX i_item_group_metadata_item_id ON item_group_metadata USING btree (item_id);
CREATE INDEX i_item_group_crf_id ON item_group USING btree (crf_id);
CREATE INDEX i_item_group_status_id ON item_group USING btree (status_id);
CREATE INDEX i_item_data_item_id ON item_data USING btree (item_id);
CREATE INDEX i_item_data_event_crf_id ON item_data USING btree (event_crf_id);
CREATE INDEX i_item_data_status_id ON item_data USING btree (status_id);
CREATE INDEX i_item_data_ordinal ON item_data USING btree (ordinal);
--CREATE INDEX i_response_set_response_type_id ON response_set USING btree (response_type_id);
CREATE INDEX i_response_set_version_id ON response_set USING btree (version_id);
--CREATE INDEX i_item_form_metadata_item_id ON item_form_metadata USING btree (item_id);
--CREATE INDEX i_item_form_metadata_crf_version_id ON item_form_metadata USING btree (crf_version_id);
CREATE INDEX i_item_form_metadata_parent_id ON item_form_metadata USING btree (parent_id);
CREATE INDEX i_item_form_metadata_decision_condition_id ON item_form_metadata USING btree (decision_condition_id);
--CREATE INDEX i_item_form_metadata_response_set_id ON item_form_metadata USING btree (response_set_id);
CREATE INDEX i_item_form_metadata_ordinal ON item_form_metadata USING btree (ordinal);
--CREATE INDEX i_section_crf_version_id ON section USING btree (crf_version_id);
CREATE INDEX i_section_status_id ON section USING btree (status_id);
--CREATE INDEX i_section_parent_id ON section USING btree (parent_id);
--CREATE INDEX i_study_event_definition_study_id ON study_event_definition USING btree (study_id);
CREATE INDEX i_study_event_definition_status_id ON study_event_definition USING btree (status_id);
CREATE INDEX i_study_event_definition_update_id ON study_event_definition USING btree (update_id);
CREATE INDEX i_study_event_definition_oc_oid ON study_event_definition USING btree (oc_oid);
--CREATE INDEX i_study_event_study_event_definition_id ON study_event USING btree (study_event_definition_id);
--CREATE INDEX i_study_event_study_subject_id ON study_event USING btree (study_subject_id);
CREATE INDEX i_study_event_sample_ordinal ON study_event USING btree (sample_ordinal);
CREATE INDEX i_study_event_date_start ON study_event USING btree (date_start);
CREATE INDEX i_study_event_date_end ON study_event USING btree (date_end);
CREATE INDEX i_study_event_status_id ON study_event USING btree (status_id);
CREATE INDEX i_study_event_subject_event_status_id ON study_event USING btree (subject_event_status_id);
--CREATE INDEX i_study_user_role_study_id ON study_user_role USING btree (study_id);
--CREATE INDEX i_study_group_study_group_class_id ON study_group USING btree (study_group_class_id);
CREATE INDEX i_study_group_class_study_id ON study_group_class USING btree (study_id);
CREATE INDEX i_study_group_class_status_id ON study_group_class USING btree (status_id);
CREATE INDEX i_subject_group_map_study_group_class_id ON subject_group_map USING btree (study_group_class_id);
--CREATE INDEX i_subject_group_map_study_subject_id ON subject_group_map USING btree (study_subject_id);
--CREATE INDEX i_subject_group_map_study_group_id ON subject_group_map USING btree (study_group_id);
CREATE INDEX i_subject_group_map_status_id ON subject_group_map USING btree (status_id);
CREATE INDEX i_study_subject_label ON study_subject USING btree (label);
--CREATE INDEX i_study_subject_subject_id ON study_subject USING btree (subject_id);
--CREATE INDEX i_study_subject_study_id ON study_subject USING btree (study_id);
CREATE INDEX i_study_subject_status_id ON study_subject USING btree (status_id);
CREATE INDEX i_study_subject_oc_oid ON study_subject USING btree (oc_oid);
--CREATE INDEX i_subject_father_id ON subject USING btree (father_id);
--CREATE INDEX i_subject_mother_id ON subject USING btree (mother_id);
CREATE INDEX i_subject_date_of_birth ON subject USING btree (date_of_birth);
CREATE INDEX i_subject_gender ON subject USING btree (gender);
CREATE INDEX i_subject_unique_identifier ON subject USING btree (unique_identifier);
CREATE INDEX i_subject_date_created ON subject USING btree (date_created);
--CREATE INDEX i_event_crf_study_event_id ON event_crf USING btree (study_event_id);
--CREATE INDEX i_event_crf_crf_version_id ON event_crf USING btree (crf_version_id);
CREATE INDEX i_event_crf_date_interviewed ON event_crf USING btree (date_interviewed);
CREATE INDEX i_event_crf_interviewer_name ON event_crf USING btree (interviewer_name);
CREATE INDEX i_event_crf_completion_status_id ON event_crf USING btree (completion_status_id);
CREATE INDEX i_event_crf_status_id ON event_crf USING btree (status_id);
CREATE INDEX i_event_crf_validator_id ON event_crf USING btree (validator_id);
CREATE INDEX i_event_crf_owner_id ON event_crf USING btree (owner_id);
CREATE INDEX i_event_crf_study_subject_id ON event_crf USING btree (study_subject_id);
--CREATE INDEX i_user_account_user_name ON user_account USING btree (user_name);
--CREATE INDEX i_versioning_map_crf_version_id ON versioning_map USING btree (crf_version_id);
--CREATE INDEX i_versioning_map_item_id ON versioning_map USING btree (item_id);
--CREATE INDEX i_item_name ON item USING btree (name);
CREATE INDEX i_item_units ON item USING btree (units);
CREATE INDEX i_item_item_data_type_id ON item USING btree (item_data_type_id);
CREATE INDEX i_item_item_reference_type_id ON item USING btree (item_reference_type_id);
CREATE INDEX i_item_oc_oid ON item USING btree (oc_oid);
CREATE INDEX i_crf_status_id ON crf USING btree (status_id);
CREATE INDEX i_crf_name ON crf USING btree (name);
CREATE INDEX i_crf_owner_id ON crf USING btree (owner_id);
CREATE INDEX i_crf_oc_oid ON crf USING btree (oc_oid);
--CREATE INDEX i_event_definition_crf_study_event_definition_id ON event_definition_crf USING btree (study_event_definition_id);
CREATE INDEX i_event_definition_crf_study_id ON event_definition_crf USING btree (study_id);
CREATE INDEX i_event_definition_crf_crf_id ON event_definition_crf USING btree (crf_id);
CREATE INDEX i_event_definition_crf_default_version_id ON event_definition_crf USING btree (default_version_id);
CREATE INDEX i_event_definition_crf_status_id ON event_definition_crf USING btree (status_id);
CREATE INDEX i_event_definition_crf_ordinal ON event_definition_crf USING btree (ordinal);
CREATE INDEX i_event_definition_crf_electronic_signature ON event_definition_crf USING btree (electronic_signature);
-- CREATE INDEX i_crf_version_crf_id ON crf_version USING btree (crf_id);
CREATE INDEX i_crf_version_name ON crf_version USING btree (name);
CREATE INDEX i_crf_version_status_id ON crf_version USING btree (status_id);
CREATE INDEX i_crf_version_oc_oid ON crf_version USING btree (oc_oid);
CREATE INDEX i_study_parameter_value_study_id ON study_parameter_value USING btree (study_id);
CREATE INDEX i_study_parent_study_id ON study USING btree (parent_study_id);
CREATE INDEX i_study_unique_identifier ON study USING btree (unique_identifier);
CREATE INDEX i_study_name ON study USING btree (name);
CREATE INDEX i_study_owner_id ON study USING btree (owner_id);
CREATE INDEX i_study_type_id ON study USING btree (type_id);
CREATE INDEX i_study_status_id ON study USING btree (status_id);
CREATE INDEX i_study_oc_oid ON study USING btree (oc_oid);

