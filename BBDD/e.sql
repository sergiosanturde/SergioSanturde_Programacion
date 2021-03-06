DROP DATABASE IF EXISTS ventas;
CREATE DATABASE ventas CHARACTER SET latin1; /*CHARACTER SET utf8mb4;*/
USE ventas;
/*SELECT @@character_set_database*/
/*ALTER TABLE cliente MODIFY nombre VARCHAR(100) NOT NULL; */
/*SHOW TABLES*/
/* ALTER TABLE cliente CHANGE primer_apellido apellido1 VARCHAR(100) NOT NULL; */
/*ALTER TABLE cliente ADD apellido2 VARCHAR(100) NOT NULL AFTER apellido1;*/
/*ALTER TABLE cliente DROP categoria;*/
/*ALTER TABLE comercial alter comision DEFAULT (10)*/

CREATE TABLE cliente (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(25),
  primer_apellido VARCHAR(15) NOT NULL,
  ciudad VARCHAR(100),
  categoria INT UNSIGNED
);

CREATE TABLE comercial (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  apellido1 VARCHAR(100) NOT NULL,
  apellido2 VARCHAR(100),
  ciudad VARCHAR(100),
  comision FLOAT
);