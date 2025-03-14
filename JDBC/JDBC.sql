drop database if exists MyPrimerJDBC;
CREATE DATABASE MyPrimerJDBC;

USE MyPrimerJDBC;

create table persona(
	id int primary key,
    nombre varchar (20),
    apellido varchar (20),
    edad varchar(5)
);

insert into persona(id, nombre, apellido, edad) values
(1, 'María', 'Lizarazo', '25');

select * from persona;