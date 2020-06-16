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
     

COMMIT;

INSERT INTO department (department_id, department_name)
VALUES (1, 'Department of Magic'), (2, 'Department of Gardening'), (3, 'Department of Cooking');


INSERT INTO project (project_id, project_name, start_date)
VALUES (11, 'Spells for Good Skin', '6/01/2020'), (12, 'Spells for Genius-Level Intellect', '10/25/2015'), 
(13, 'Cultivating Avocados', '4/14/2020'), (14, 'Vegan Cheese That Does Not Suck', '6/24/2016');


INSERT INTO employee (employee_id, job_title, first_name, last_name, gender,
						date_of_birth, department_id, project_id)
VALUES (20, 'Director of Magic', 'Lizzy', 'Hartley', 'female', '11/06/1996',
		1, 11), (21, 'Junior Spell Developer', 'Angelo', 'Culvert', 'male',
		'9/06/1995', 1, 11), (22, 'Assistant Director of Magic', 'Morgan',
		'Haycraft', 'female', '8/19/1996', 1, 12), (23, 'Junior Spell Developer',
		'Clair', 'Kronk', 'female', '9/07/1994', 1, 12), (24, 'Director of 
		Gardening', 'Madg', 'Weighner', 'nonbinary', '3/22/1995', 2, 13), 
		(25, 'Senior Gardener', 'Malik', 'Brown', 'male', '10/16/1995', 2, 13),
		(26, 'Head Chef', 'Nathan', 'Stroud', 'male', '7/30/1996', 3, 14), (27, 
		'Junior Recipe Developer', 'Sara', 'Peele', 'female', '10/08/1995', 3, 14); 
		

