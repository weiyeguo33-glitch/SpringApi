# SpringBootRest API

Este proyecto es una API REST desarrollada con **Spring Boot** y **MySQL**.  
Permite gestionar **Productos** y **Creadores** con operaciones CRUD y relaciones entre ellos.

---

## Tecnologías

- Java 17+
- Spring Boot (Web, Data JPA)
- MySQL
- Lombok
- Maven

## Configurar

Crear base de datos llamada apirest_db, al ejecutar la aplicacion se crean las tablas directamente.

## Datos de prueba

Una vez creada la base de datos y ejecutada la aplicacion introducir datos de prueba en tu mysql
INSERT INTO creador (nombre) VALUES ('Nintendo'), ('Sony'), ('Microsoft'), ('Valve');

INSERT INTO producto (nombre, precio, id_creador) VALUES
('Nintendo Switch', 299.99, 1),
('PlayStation 5', 499.99, 2),
('Xbox Series X', 499.99, 3),
('Steam Deck', 399.99, 4),
('Mario Kart 8 Deluxe', 59.99, 1),
('The Last of Us Part II', 69.99, 2),
('Halo Infinite', 59.99, 3),
('Half-Life Alyx', 59.99, 4);

## Probar la api en Postman, en Insomnia o como guste
GET http://localhost:8080/api/***

Endpoints principales
Creadores
GET /api/creadores → listar todos
GET /api/creadores/{id} → obtener por id
POST /api/creadores → crear
PUT /api/creadores/{id} → actualizar
DELETE /api/creadores/{id} → eliminar
Productos
GET /api/productos → listar todos
GET /api/productos/{id} → obtener por id
POST /api/productos → crear
PUT /api/productos/{id} → actualizar
DELETE /api/productos/{id} → eliminar
GET /api/productos/creador/{creadorId} → productos por creador
GET /api/productos/rango?min=X&max=Y → productos por rango de precio
