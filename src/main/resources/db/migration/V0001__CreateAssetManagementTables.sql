CREATE TABLE timezone_details (
   timezone_id SERIAL PRIMARY KEY,
   timezone_name varchar(100) NOT NULL,
   utc_offset INTEGER NOT NULL,
   is_active boolean,
   created_by   character varying(30) NOT NULL,
   created_on   timestamp NOT NULL,
   last_updated_by   character varying(30) NOT NULL,
   last_updated_on   timestamp NOT NULL
);

CREATE TABLE site_groups (
	site_group_id serial PRIMARY KEY,
	timezone_id BIGINT CONSTRAINT timezone_id_fk REFERENCES timezone_details(timezone_id),
	group_name varchar(100) NOT NULL,
	group_display_name varchar(100),
	group_latitude DOUBLE,
	group_longitude DOUBLE,
	group_display_order INTEGER,
	is_active boolean NOT NULL,
	created_by varchar(30) NOT NULL,
	created_on timestamp NOT NULL,
	last_updated_by varchar(30) NOT NULL,
	last_updated_on timestamp NOT NULL
);

CREATE TABLE group_settings (
   group_setting_id SERIAL PRIMARY KEY,
   site_group_id BIGINT CONSTRAINT settings_site_group_id_fk REFERENCES site_groups(site_group_id),
   group_start_time  timestamp  NOT NULL,
   group_end_time  timestamp NOT NULL,
   group_max_overtime  INTEGER,
   group_max_shift_variation  INTEGER,
   group_plan_run_priority  INTEGER,
   group_plan_run_time   INTEGER,
   created_by   character varying(30) NOT NULL,
   created_on   timestamp NOT NULL,
   last_updated_by   character varying(30) NOT NULL,
   last_updated_on   timestamp NOT NULL
);

CREATE TABLE group_contract_details (
   group_contract_id SERIAL PRIMARY KEY,
   site_group_id BIGINT CONSTRAINT contract_site_group_id_fk REFERENCES site_groups(site_group_id),
   group_contract_type  varchar(30) NOT NULL,
   contract_start_date  timestamp NOT NULL,
   contract_end_date  timestamp NOT NULL,
   is_active  boolean,
   created_by   character varying(30) NOT NULL,
   created_on   timestamp NOT NULL,
   last_updated_by   character varying(30) NOT NULL,
   last_updated_on   timestamp NOT NULL
);

CREATE TABLE site_details (
	site_unique_id SERIAL PRIMARY KEY,
	site_group_id BIGINT CONSTRAINT site_group_id_fk REFERENCES site_groups(site_group_id),
	tenant_id INTEGER NOT NULL,
	site_id varchar(5) NOT NULL,
	timezone_id INTEGER NOT NULL,
	ips_number varchar(50) NOT NULL,
	site_name varchar(100) NOT NULL,
	site_latitude DOUBLE NOT NULL,
	site_longitude DOUBLE NOT NULL,
	group_display_order INTEGER,
	is_active boolean NOT NULL,
	created_by varchar(30) NOT NULL,
	created_on timestamp NOT NULL,
	last_updated_by varchar(30) NOT NULL,
	last_updated_on timestamp NOT NULL
);

CREATE TABLE asset_details (
	asset_id bigserial PRIMARY KEY,
	site_unique_id BIGINT CONSTRAINT site_unique_id_fk REFERENCES site_details(site_unique_id),
	asset_serial_number varchar(50) NOT NULL,
	asset_type_id integer NOT NULL,
	asset_name varchar(200),
	asset_display_name varchar(10),
	is_active boolean NOT NULL,
	created_by varchar(30) NOT NULL,
	created_on timestamp   NOT NULL,
	last_updated_by varchar(30) NOT NULL,
	last_updated_on timestamp   NOT NULL
);

CREATE TABLE asset_type (  
	asset_type_id BIGSERIAL PRIMARY KEY,  
	asset_type_name_default VARCHAR(50),  
	is_active BOOLEAN,  
	created_by VARCHAR(30) NOT NULL,  
	created_on TIMESTAMP,  
	last_updated_by VARCHAR(30) NOT NULL,  
	last_updated_on TIMESTAMP  
);

CREATE TABLE locations_on_asset (
	location_id BIGSERIAL PRIMARY KEY,
	asset_type_id BIGINT CONSTRAINT asset_type_id_fk REFERENCES asset_type(asset_type_id),
	location_name_default VARCHAR(500) NOT NULL,
	is_active BOOLEAN NOT NULL,
	created_by VARCHAR(30) NOT NULL,
	created_on TIMESTAMP,
	last_updated_by VARCHAR(30) NOT NULL,
	last_updated_on TIMESTAMP
);

CREATE TABLE sections_at_location (
	section_id BIGSERIAL PRIMARY KEY,
	location_id BIGINT CONSTRAINT location_id_fk REFERENCES locations_on_asset(location_id),
	section_name_default VARCHAR(500) NOT NULL,
	is_active BOOLEAN NOT NULL DEFAULT true,
	created_by VARCHAR(30) NOT NULL,
	created_on TIMESTAMP,
	last_updated_by VARCHAR(30) NOT NULL,
	last_updated_on TIMESTAMP
);

CREATE TABLE components_at_section (
	component_id BIGSERIAL PRIMARY KEY,
	section_id BIGINT CONSTRAINT section_id_fk REFERENCES sections_at_location(section_id),
	asset_type_name_default VARCHAR(50),
	is_active BOOLEAN NOT NULL DEFAULT true,
	created_by VARCHAR(30) NOT NULL,
	created_on TIMESTAMP,
	last_updated_by VARCHAR(30) NOT NULL,
	last_updated_on TIMESTAMP
);


CREATE TABLE common_codes (
	id BIGSERIAL PRIMARY KEY,
	dropdown_type VARCHAR(50) NOT NULL,
	dropdown_code VARCHAR(50) NOT NULL,
	dropdown_value VARCHAR(50) NOT NULL,
	language_code VARCHAR(50) NOT NULL,
	is_active BOOLEAN NOT NULL DEFAULT true,
	created_by VARCHAR(30) NOT NULL,
	created_on TIMESTAMP,
	last_updated_by VARCHAR(30) NOT NULL,
	last_updated_on TIMESTAMP
);