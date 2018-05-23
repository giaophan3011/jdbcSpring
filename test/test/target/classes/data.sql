create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);
INSERT INTO person (id, name, location, birth_date) VALUES(1, 'Giao', 'Helsinki', sysdate());
INSERT INTO person (id, name, location, birth_date) VALUES(2,'Thu','Vantaa', sysdate());
INSERT INTO person (id, name, location, birth_date) VALUES(3,'Timi', 'Espoo', sysdate());
