DROP DATABASE IF EXISTS practicaw;
CREATE DATABASE practicaw CHARACTER SET utf8mb4;
USE practicaw;

CREATE TABLE IF NOT EXISTS equipo (
  codigo INT AUTO_INCREMENT PRIMARY KEY,
  descripcion VARCHAR(200) NOT NULL,
  precio INT NOT NULL CHECK(precio > 0),
  stock INT 
);

CREATE TABLE IF NOT EXISTS componente (
  codigo INT AUTO_INCREMENT PRIMARY KEY,
  descripcion ENUM('BUENO','BONITO','BARATO') NOT NULL,
  precio INT NOT NULL CHECK(precio > 0),
  stock INT 
);

CREATE TABLE IF NOT EXISTS consta (
  codigo_equipo INT NOT NULL,
  FOREIGN KEY (codigo_equipo) REFERENCES equipo(codigo),
  codigo_componente INT NOT NULL,
  FOREIGN KEY (codigo_componente) REFERENCES componente(codigo),
    cantidad VARCHAR(50) NOT NULL,
  PRIMARY KEY (codigo_equipo,codigo_componente)
);

CREATE TABLE IF NOT EXISTS cliente (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nif INT NOT NULL,
  nombre VARCHAR(50) NOT NULL,
  apellido1 VARCHAR(50) NOT NULL,
  apellido2 VARCHAR(50) NOT NULL,
  telefono int(9) NOT NULL,
  domicilio VARCHAR (100) NOT NULL,
  ciudad VARCHAR (100) NOT NULL,
  provincia VARCHAR (100) NOT NULL
);

CREATE TABLE IF NOT EXISTS seccion (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS empleado (
  id INT AUTO_INCREMENT,
  id_seccion INT,
  FOREIGN KEY (id_seccion) REFERENCES seccion(id),
  nif INT NOT NULL,
  nombre VARCHAR(50) NOT NULL,
  apellido1 VARCHAR(50) NOT NULL,
  apellido2 VARCHAR(50) NOT NULL,
  PRIMARY KEY (id,id_seccion)
);

CREATE TABLE IF NOT EXISTS compraequipos (
  id INT AUTO_INCREMENT,
  id_cliente INT,
  id_empleado INT,  
  codigo_equipo INT NOT NULL,
  FOREIGN KEY (codigo_equipo) REFERENCES equipo(codigo),
  FOREIGN KEY (id_cliente) REFERENCES cliente(id),
  FOREIGN KEY (id_empleado) REFERENCES empleado(id),
  cantidad VARCHAR(50) NOT NULL,
  fecha DATE NOT NULL DEFAULT '1999-01-01',
  PRIMARY KEY (id,codigo_equipo,id_cliente,id_empleado)
);

CREATE TABLE IF NOT EXISTS compracomponentes (
  id INT AUTO_INCREMENT,
  codigo_componente INT,
  id_cliente INT,
  id_empleado INT,  
  FOREIGN KEY (codigo_componente) REFERENCES componente(codigo),
  FOREIGN KEY (id_cliente) REFERENCES cliente(id),
  FOREIGN KEY (id_empleado) REFERENCES empleado(id),
  cantidad VARCHAR(50) NOT NULL,
  fecha DATE NOT NULL DEFAULT '1999-01-01',
  PRIMARY KEY (id,codigo_componente,id_cliente,id_empleado)
);
