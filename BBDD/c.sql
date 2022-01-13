CREATE DATABASE IF NOT EXISTS ejercicioTienda;
USE ejercicioTienda;

CREATE TABLE IF NOT EXISTS cliente (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(30) NOT NULL,
apellido VARCHAR(50) NOT NULL,
saldo DECIMAL (7,2) );

CREATE TABLE IF NOT EXISTS pedido (
id INT AUTO_INCREMENT PRIMARY KEY,
descripcion VARCHAR(120) NOT NULL);

CREATE TABLE IF NOT EXISTS realiza (
fecha DATE ,
id_cliente INT ,
id_pedido INT ,
PRIMARY KEY (fecha, id_cliente, id_pedido),
FOREIGN KEY (id_cliente) REFERENCES cliente(id),
FOREIGN KEY (id_pedido) REFERENCES pedido(id)
);