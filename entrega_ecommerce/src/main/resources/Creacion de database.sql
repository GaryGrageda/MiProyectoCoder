drop database if exists coderhouse;

create database if not exists coderhouse;
use coderhouse;


-- Si las tabla ya las creo nuestro proyecto podemos empezar a cargar algunos datos si queremos para agilizar las consultas a postman
INSERT INTO coderhouse.clientes
(apellido, dni, nombre)
VALUES('Pérez', '42012312', 'Paula');
INSERT INTO coderhouse.clientes
(apellido, dni, nombre)
VALUES('Grageda', '42559749', 'Gary');
INSERT INTO coderhouse.clientes
(apellido, dni, nombre)
VALUES('Silva', '45052044', 'Marta');
INSERT INTO coderhouse.clientes
(apellido, dni, nombre)
VALUES('López', '43922105', 'Pedro');
INSERT INTO coderhouse.clientes
(apellido, dni, nombre)
VALUES('Silva', '49520179', 'Daniel');
INSERT INTO coderhouse.clientes
(apellido, dni, nombre)
VALUES('Torres', '49952931', 'Lucía');
INSERT INTO coderhouse.clientes
(apellido, dni, nombre)
VALUES('Rojas', '45242853', 'Daniel');
INSERT INTO coderhouse.clientes
(apellido, dni, nombre)
VALUES('Gómez', '47729540', 'Marta');
INSERT INTO coderhouse.clientes
(apellido, dni, nombre)
VALUES('Hernández', '42527651', 'María');
INSERT INTO coderhouse.clientes
(apellido, dni, nombre)
VALUES('Gómez', '40423156', 'Clara');
INSERT INTO coderhouse.clientes
(apellido, dni, nombre)
VALUES('Rojas', '41999037', 'María');
INSERT INTO coderhouse.clientes
(apellido, dni, nombre)
VALUES('Ramírez', '40349558', 'Lucía');
INSERT INTO coderhouse.clientes
(apellido, dni, nombre)
VALUES('García', '48859870', 'Laura');
INSERT INTO coderhouse.clientes
(apellido, dni, nombre)
VALUES('Hernández', '48161745', 'María');
INSERT INTO coderhouse.clientes
(apellido, dni, nombre)
VALUES('Ramírez', '41206552', 'Daniel');


INSERT INTO coderhouse.productos
(codigo, descripcion, precio, stock)
VALUES('C111', 'Cartuchera', 8400.99, 13);
INSERT INTO coderhouse.productos
(codigo, descripcion, precio, stock)
VALUES('C222', 'Cilindro', 9500.99, 23);
INSERT INTO coderhouse.productos
(codigo, descripcion, precio, stock)
VALUES('M111', 'Mochila', 25400.99, 25);
INSERT INTO coderhouse.productos
(codigo, descripcion, precio, stock)
VALUES('B111', 'Bolso Chico', 14800.99, 9);
INSERT INTO coderhouse.productos
(codigo, descripcion, precio, stock)
VALUES('B222', 'Bolso Grande', 19100.99, 50);
INSERT INTO coderhouse.productos
(codigo, descripcion, precio, stock)
VALUES('C111', 'Cartuchera', 8400.99, 9);
INSERT INTO coderhouse.productos
(codigo, descripcion, precio, stock)
VALUES('C222', 'Cilindro', 9500.99, 6);
INSERT INTO coderhouse.productos
(codigo, descripcion, precio, stock)
VALUES('M111', 'Mochila', 25400.99, 48);
INSERT INTO coderhouse.productos
(codigo, descripcion, precio, stock)
VALUES('B111', 'Bolso Chico', 14800.99, 22);
INSERT INTO coderhouse.productos
(codigo, descripcion, precio, stock)
VALUES('B222', 'Bolso Grande', 19100.99, 32);

-- Una vez que las tablas tienen registros hacemos select para ver como quedo
SELECT * from coderhouse.clientes;
SELECT * from coderhouse.productos;
SELECT * from coderhouse.ventas;