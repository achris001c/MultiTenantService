create TABLE tenant (
    id int NOT NULL,
    name character varying(255) NULL,
	CONSTRAINT city_pkey PRIMARY KEY (id)
);

create TABLE user_account (
    id int NOT NULL,
    first_name character varying(255) NULL,
    last_name character varying(255) NULL,
    tenant_id int not null,
	CONSTRAINT user_pkey PRIMARY KEY (id)
);

create sequence user_sequence
    start with 1
    increment by 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

create sequence tenant_sequence
    start with 1
    increment by 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

insert into tenant (id,name) values(tenant_sequence.nextval, 'Tenant1');
insert into tenant (id,name) values(tenant_sequence.nextval, 'Tenant2');

insert into user_account(id, first_name, last_name, tenant_id) values(user_sequence.nextval, 'name1', 'name1', 1);
insert into user_account(id, first_name, last_name, tenant_id) values(user_sequence.nextval, 'name2', 'name2', 2);



