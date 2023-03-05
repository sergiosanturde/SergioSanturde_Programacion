
USE ejerPubs;

CREATE TABLE IF NOT EXISTS localidad (
  cod_localidad INT auto_increment KEY,
  nombre VARCHAR(25));
  
CREATE TABLE IF NOT EXISTS pub (
cod_pub INT NOT NULL PRIMARY KEY,
nombre VARCHAR(120) NOT NULL,
licencia_fiscal VARCHAR(100) NOT NULL,
domicilio VARCHAR(100),
fecha_apertura DATE NOT NULL,
horario ENUM('HOR1','HOR2','HOR3') NOT NULL,
cod_loc INT NOT NULL,
FOREIGN KEY (cod_loc) REFERENCES localidad (cod_localidad)
);


CREATE TABLE IF NOT EXISTS titular (
dni_titular INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
nombre VARCHAR(100) NOT NULL,
domicilio VARCHAR (100) ,
cod_pub INT NOT NULL,
FOREIGN KEY (cod_pub) REFERENCES pub(cod_pub));


CREATE TABLE IF NOT EXISTS empleado (
dni_empleado VARCHAR (100) PRIMARY KEY NOT NULL,
nombre VARCHAR(100) NOT NULL,
domicilio VARCHAR (100));


CREATE TABLE IF NOT EXISTS existencias (
  cod_articulo INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(25),
  cantidad INT NOT NULL,
  precio decimal(7,2) ,CHECK ( precio > 0) ,
  cod_pub INT,
  FOREIGN KEY (cod_pub) REFERENCES pub(cod_pub));


CREATE TABLE IF NOT EXISTS pub_empleado (
	cod_pub INT AUTO_INCREMENT,
	FOREIGN KEY (cod_pub) REFERENCES pub(cod_pub),
	dni_empleado VARCHAR(20),
	FOREIGN KEY (dni_empleado) REFERENCES empleado(dni_empleado),
    funcion ENUM('CAMAMERO','SEGURIDAD','LIMPIEZA'),
PRIMARY KEY (cod_pub, dni_empleado, funcion)
);