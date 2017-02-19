insert into timezone_details values(1, '(UTC -5:00)  Eastern Time (US & Canada), Bogota, Lima', 25, 'true', 'SYSTEM', current_timestamp, 'SYSTEM', current_timestamp);
insert into timezone_details values(2, '(UTC +4:00)  Abu Dhabi, Muscat, Yerevan, Baku, Tbilisi', 25, 'true', 'SYSTEM', current_timestamp, 'SYSTEM', current_timestamp);
insert into timezone_details values(3, '(UTC +12:00) Auckland, Wellington, Fiji, Kamchatka', 25, 'true', 'SYSTEM', current_timestamp, 'SYSTEM', current_timestamp);

insert into site_groups(site_group_id, timezone_id, group_name, group_display_name, group_latitude, group_longitude, group_display_order, is_active, created_by, created_on, last_updated_by, last_updated_on) values (1, 1, 'Alta Wind', 'Alta Wind', 10, 20, 1, 'true', 'SYSTEM', current_timestamp, 'SYSTEM', current_timestamp);
insert into site_groups(site_group_id, timezone_id, group_name, group_display_name, group_latitude, group_longitude, group_display_order, is_active, created_by, created_on, last_updated_by, last_updated_on) values (2, 1, 'Alta Wind', 'Alta Wind', 11, 21, 1, 'true', 'SYSTEM', current_timestamp, 'SYSTEM', current_timestamp);

insert into group_settings values(1, 1, current_timestamp, current_timestamp, 10, 20, 30, 40, 'SYSTEM', current_timestamp, 'SYSTEM', current_timestamp);
insert into group_settings values(2, 2, current_timestamp, current_timestamp, 10, 20, 30, 40, 'SYSTEM', current_timestamp, 'SYSTEM', current_timestamp);

insert into group_contract_details values(1, 1, 'Contract Type', current_timestamp, current_timestamp, 'true', 'SYSTEM', current_timestamp, 'SYSTEM', current_timestamp);
insert into group_contract_details values(2, 2, 'Contract Type', current_timestamp, current_timestamp, 'true', 'SYSTEM', current_timestamp, 'SYSTEM', current_timestamp);

insert into site_details(site_group_id,tenant_id, site_id,timezone_id,ips_number,site_name,site_latitude,site_longitude,group_display_order, is_active, created_by, created_on, last_updated_by, last_updated_on) values (1,1,8480,1,123,'Alta wind X',35.0999,-118.2378,1,'true','SYSTEM',current_timestamp,'SYSTEM',current_timestamp);
insert into site_details(site_group_id,tenant_id, site_id,timezone_id,ips_number,site_name,site_latitude,site_longitude,group_display_order, is_active, created_by, created_on, last_updated_by, last_updated_on) values (1,1,8446,1,123,'Alta wind XI',35.0999,-118.2378,1,'true','SYSTEM',current_timestamp,'SYSTEM',current_timestamp);
insert into site_details(site_group_id,tenant_id, site_id,timezone_id,ips_number,site_name,site_latitude,site_longitude,group_display_order, is_active, created_by, created_on, last_updated_by, last_updated_on) values (1,1,8480,1,123,'Alta wind X',35.0999,-118.2378,1,'true','SYSTEM',current_timestamp,'SYSTEM',current_timestamp);
insert into site_details(site_group_id,tenant_id, site_id,timezone_id,ips_number,site_name,site_latitude,site_longitude,group_display_order, is_active, created_by, created_on, last_updated_by, last_updated_on) values (1,1,8446,1,123,'Alta wind XI',35.0999,-118.2378,1,'true','SYSTEM',current_timestamp,'SYSTEM',current_timestamp);

insert into asset_details(site_unique_id,asset_serial_number,asset_type_id,asset_name,asset_display_name,is_active,created_by,created_on,last_updated_by,last_updated_on) values (1,'28131361',1,'Alta Wind X 197','197',true,'SYSTEM',current_timestamp,'SYSTEM',current_timestamp);
insert into asset_details(site_unique_id,asset_serial_number,asset_type_id,asset_name,asset_display_name,is_active,created_by,created_on,last_updated_by,last_updated_on) values (1,'28131331',1,'Alta Wind X 167','167',true,'SYSTEM',current_timestamp,'SYSTEM',current_timestamp);
insert into asset_details(site_unique_id,asset_serial_number,asset_type_id,asset_name,asset_display_name,is_active,created_by,created_on,last_updated_by,last_updated_on) values (1,'28131330',1,'Alta Wind X 166','166',true,'SYSTEM',current_timestamp,'SYSTEM',current_timestamp);

insert into common_codes(dropdown_type,dropdown_code,dropdown_value,language_code,is_active,created_by,created_on,last_updated_by,last_updated_on) values ('TASK_PRIORITY','1','HIGH','EN',true,'SYSTEM',current_timestamp,'SYSTEM',current_timestamp);
insert into common_codes(dropdown_type,dropdown_code,dropdown_value,language_code,is_active,created_by,created_on,last_updated_by,last_updated_on) values ('TASK_PRIORITY','2','MEDIUM','EN',true,'SYSTEM',current_timestamp,'SYSTEM',current_timestamp);
insert into common_codes(dropdown_type,dropdown_code,dropdown_value,language_code,is_active,created_by,created_on,last_updated_by,last_updated_on) values ('TASK_PRIORITY','3','LOW','EN',true,'SYSTEM',current_timestamp,'SYSTEM',current_timestamp);
insert into common_codes(dropdown_type,dropdown_code,dropdown_value,language_code,is_active,created_by,created_on,last_updated_by,last_updated_on) values ('TASK_PRIORITY','1','HIGH-FR*','FR',true,'SYSTEM',current_timestamp,'SYSTEM',current_timestamp);
insert into common_codes(dropdown_type,dropdown_code,dropdown_value,language_code,is_active,created_by,created_on,last_updated_by,last_updated_on) values ('TASK_PRIORITY','2','MEDIUM-FR*','FR',true,'SYSTEM',current_timestamp,'SYSTEM',current_timestamp);
insert into common_codes(dropdown_type,dropdown_code,dropdown_value,language_code,is_active,created_by,created_on,last_updated_by,last_updated_on) values ('TASK_PRIORITY','3','LOW-FR*','FR',true,'SYSTEM',current_timestamp,'SYSTEM',current_timestamp);
insert into common_codes(dropdown_type,dropdown_code,dropdown_value,language_code,is_active,created_by,created_on,last_updated_by,last_updated_on) values ('TASK_PRIORITY','1','HIGH-DE*','DE',true,'SYSTEM',current_timestamp,'SYSTEM',current_timestamp);
insert into common_codes(dropdown_type,dropdown_code,dropdown_value,language_code,is_active,created_by,created_on,last_updated_by,last_updated_on) values ('TASK_PRIORITY','2','MEDIUM-DE*','DE',true,'SYSTEM',current_timestamp,'SYSTEM',current_timestamp);
insert into common_codes(dropdown_type,dropdown_code,dropdown_value,language_code,is_active,created_by,created_on,last_updated_by,last_updated_on) values ('TASK_PRIORITY','3','LOW-DE*','DE',true,'SYSTEM',current_timestamp,'SYSTEM',current_timestamp);
insert into common_codes(dropdown_type,dropdown_code,dropdown_value,language_code,is_active,created_by,created_on,last_updated_by,last_updated_on) values ('RECURRENCE_TYPE','1','MONTHLY','EN',true,'SYSTEM',current_timestamp,'SYSTEM',current_timestamp);
insert into common_codes(dropdown_type,dropdown_code,dropdown_value,language_code,is_active,created_by,created_on,last_updated_by,last_updated_on) values ('RECURRENCE_TYPE','2','ANNUAL','EN',true,'SYSTEM',current_timestamp,'SYSTEM',current_timestamp);
insert into common_codes(dropdown_type,dropdown_code,dropdown_value,language_code,is_active,created_by,created_on,last_updated_by,last_updated_on) values ('RECURRENCE_TYPE','3','SEMI ANNUAL','EN',true,'SYSTEM',current_timestamp,'SYSTEM',current_timestamp);


insert into asset_type values(1, 'Wind Turbine', true, 'SYSTEM', now(), 'SYSTEM', now());
insert into asset_type values(2, 'WN Turbine', true, 'SYSTEM', now(), 'SYSTEM', now());
insert into asset_type values(3, 'WMN Turbine', true, 'SYSTEM', now(), 'SYSTEM', now());

insert into locations_on_asset values(1, 1, 'Blade', true, 'SYSTEM', now(), 'SYSTEM', now());
insert into locations_on_asset values(2, 1, 'DTA', true, 'SYSTEM', now(), 'SYSTEM', now());
insert into locations_on_asset values(3, 1, 'Documentation', true, 'SYSTEM', now(), 'SYSTEM', now());
insert into locations_on_asset values(4, 1, 'External Components', true, 'SYSTEM', now(), 'SYSTEM', now());
insert into locations_on_asset values(5, 1, 'Hub', true, 'SYSTEM', now(), 'SYSTEM', now());
insert into locations_on_asset values(6, 1, 'Nacelle', true, 'SYSTEM', now(), 'SYSTEM', now());
insert into locations_on_asset values(7, 1, 'Software', true, 'SYSTEM', now(), 'SYSTEM', now());
insert into locations_on_asset values(8, 1, 'Tower', true, 'SYSTEM', now(), 'SYSTEM', now());

insert into sections_at_location values(1, 2, 'All', true, 'SYSTEM', now(), 'SYSTEM', now());
insert into sections_at_location values(2, 2, 'Axis1', true, 'SYSTEM', now(), 'SYSTEM', now());
insert into sections_at_location values(3, 2, 'Axis2', true, 'SYSTEM', now(), 'SYSTEM', now());
insert into sections_at_location values(4, 2, 'Axis3', true, 'SYSTEM', now(), 'SYSTEM', now());
insert into sections_at_location values(5, 2, 'Axis5', true, 'SYSTEM', now(), 'SYSTEM', now());

insert into components_at_section values(1, 1, 'ACE', true, 'SYSTEM', now(), 'SYSTEM', now());
insert into components_at_section values(2, 1, 'AGE', true, 'SYSTEM', now(), 'SYSTEM', now());
insert into components_at_section values(3, 1, 'ADE', true, 'SYSTEM', now(), 'SYSTEM', now());
insert into components_at_section values(4, 1, 'ADMINCE', true, 'SYSTEM', now(), 'SYSTEM', now());
