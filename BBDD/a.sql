DROP DATABASE IF EXISTS google;
CREATE DATABASE google CHARACTER SET utf8mb4;
USE google;

CREATE TABLE resultado (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  descripcion VARCHAR(200) NOT NULL,
  url VARCHAR(512) NOT NULL
);
INSERT INTO resultado VALUES (1, 'Resultado 1', 'Descripción 1', 'http://....');
INSERT INTO resultado VALUES (2, 'Resultado 2', 'Descripción 2', 'http://....');
INSERT INTO resultado VALUES (3, 'Resultado 3', 'Descripción 3', 'http://....');
INSERT INTO resultado VALUES (4, 'Resultado 4', 'Descripción 4', 'http://....');
INSERT INTO resultado VALUES (5, 'Resultado 5', 'Descripción 5', 'http://....');
INSERT INTO resultado VALUES (6, 'Resultado 6', 'Descripción 6', 'http://....');
INSERT INTO resultado VALUES (7, 'Resultado 7', 'Descripción 7', 'http://....');
INSERT INTO resultado VALUES (8, 'Resultado 8', 'Descripción 8', 'http://....');
INSERT INTO resultado VALUES (9, 'Resultado 9', 'Descripción 9', 'http://....');
INSERT INTO resultado VALUES (10, 'Resultado 10', 'Descripción 10', 'http://....');
INSERT INTO resultado VALUES (11, 'Resultado 11', 'Descripción 11', 'http://....');
INSERT INTO resultado VALUES (12, 'Resultado 12', 'Descripción 12', 'http://....');
INSERT INTO resultado VALUES (13, 'Resultado 13', 'Descripción 13', 'http://....');
INSERT INTO resultado VALUES (14, 'Resultado 14', 'Descripción 14', 'http://....');
INSERT INTO resultado VALUES (15, 'Resultado 15', 'Descripción 15', 'http://....');


CREATE TABLE persona (
id int auto_increment not null primary key,
nombre varchar(50),
apellido varchar(100) not null,
edad int not null);

/*# Creamos el campo id persona en la tabla resultado
alter table resultado add id_persona int;

#Creamos la constraint clave foranea en la tabla resultado. Una persona puede obtener varios resultados 1:N

alter table resultado add constraint clave_foranea foreign key (id_persona) 
references persona(id) on delete set null on update set null;

# Si la tabla ya contiene información como es este caso nos va a dar un error al crear la fk. Debemos decirle que el borrado y la actualización sean null.
alter table resultado add constraint clave_foranea foreign key (id_persona) 
references persona(id) on delete set null on update set null;

#Inserto dos personas
INSERT INTO persona (nombre,apellido,edad) VALUES ( 'Juan', 'Ruiz', 23);
INSERT INTO persona (nombre,apellido,edad) VALUES ( 'María', 'Sanz', 34);

#Inserto un resultado vinculado a una persona
INSERT INTO resultado (nombre,descripcion,url,id_persona)VALUES ('Resultado final', 'Descripción final', 'http://....',1);

# Información de los 5 primeros resultados
SELECT * from resultado limit 0,5;

#Consulta resultados intermedios
SELECT * from resultado limit 5,5;

# Consulta últimos resultados
SELECT * from resultado limit 11,5;