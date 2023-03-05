USE practicaw;

ALTER TABLE cliente MODIFY nombre VARCHAR(80) NOT NULL; 
ALTER TABLE cliente RENAME TO comprador;
ALTER TABLE cliente DROP provincia;