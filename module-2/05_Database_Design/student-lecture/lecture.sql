create database ProjectExplorer;

BEGIN TRANSACTION;
DROP TABLE IF EXISTS project CASCADE;
DROP TABLE IF EXISTS department CASCADE;
DROP TABLE IF EXISTS employee CASCADE;

CREATE TABLE project
(
        project_id serial,
        project_name varchar(200),
        start_date varchar(10) not null,
        
        CONSTRAINT pk_project_id PRIMARY KEY (project_id)
);

CREATE TABLE department
(
        department_id serial,
        department_name varchar(100),
        
        CONSTRAINT pk_department_id PRIMARY KEY (department_id)
);

CREATE TABLE employee
(
	employee_id serial,
	job_title varchar(100) not null,
	first_name varchar(64) not null,
	last_name varchar(64) not null,
	gender varchar(10) not null,
	date_of_birth varchar(10) not null,
	department_id int not null,
	project_id int not null,

	CONSTRAINT pk_employee_id PRIMARY KEY (employee_id),
	CONSTRAINT fk_employee_department_id FOREIGN KEY (department_id) REFERENCES department (department_id),
	CONSTRAINT fk_employee_project_id FOREIGN KEY (project_id) REFERENCES project (project_id)
);

CREATE TABLE project_employee
(
	project_id int not null,
	employee_id int not null,

	constraint pk_project_employee primary key (project_id, employee_id),
	constraint fk_project_employee_project_id foreign key (project_id) references project (project_id),
	constraint fk_project_employee_employee_id foreign key (employee_id) references employee (employee_id)
);

COMMIT;
