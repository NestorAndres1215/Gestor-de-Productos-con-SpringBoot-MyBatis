# 🚀 Gestor de Productos con Spring Boot y MyBatis

## 📋 Descripción

**GestorDeProductosConSpringBootYMyBatis** es una aplicación backend moderna para la gestión de productos, categorías y proveedores en una tienda. Fue desarrollada con tecnologías actuales y buenas prácticas de desarrollo, ofreciendo una API RESTful para realizar operaciones CRUD de forma eficiente y organizada.

### 🔧 Tecnologías principales

- 🌱 **Spring Boot 3+**  
- 🧩 **MyBatis 3+** *(con anotaciones, sin XML)*  
- 🐬 **MySQL**  
- ☕ **Java 17+**

---

## 🧠 ¿Qué es MyBatis?

> **MyBatis** es un framework de persistencia para Java que facilita el acceso a bases de datos mediante sentencias SQL personalizadas. Mapea automáticamente los resultados a objetos Java, permitiendo mayor control sobre las consultas.  
> En este proyecto, se utiliza **MyBatis con anotaciones (@Select, @Insert, etc.)**, eliminando la necesidad de archivos XML.

---

## ✨ Características

- ✅ Gestión de productos, categorías y proveedores  
- 🔄 API REST con operaciones CRUD completas  
- 🗂️ Integración de MyBatis con SQL en anotaciones  
- ⚙️ Configuración rápida y limpia con Spring Boot  
- 📦 Proyecto Maven para una fácil gestión de dependencias  
- 🛡️ Preparado para futuras mejoras en seguridad y escalabilidad  

---

## 📦 Tecnologías utilizadas

| Tecnología       | Icono   |
|------------------|---------|
| Java 17+         | ☕      |
| Spring Boot 3+   | 🌱      |
| MyBatis 3+       | 🧩      |
| MySQL            | 🐬      |
| Maven            | 📦      |
| Git              | 🔧      |

---

## 🚀 Instalación y ejecución

### 🧰 Requisitos previos

- ☕ Java 17 o superior  
- 📦 Maven instalado  
- 🐬 MySQL en ejecución y una base de datos creada


## 📄 Script de Base de Datos

A continuación se presenta el script SQL para crear las tablas `producto`, `categoria` y `proveedor`, así como datos de ejemplo:

```sql
-- Crear base de datos
CREATE DATABASE IF NOT EXISTS tienda;
USE tienda;

-- Tabla de categorías
CREATE TABLE categoria (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL
);

-- Tabla de proveedores
CREATE TABLE proveedor (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    contacto VARCHAR(100)
);

-- Tabla de productos
CREATE TABLE producto (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10, 2) NOT NULL,
    stock INT DEFAULT 0,
    categoria_id INT,
    proveedor_id INT,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    actualizado_en TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (categoria_id) REFERENCES categoria(id),
    FOREIGN KEY (proveedor_id) REFERENCES proveedor(id)
);

-- Insertar categorías
INSERT INTO categoria (nombre) VALUES
('Electrónica'), ('Ropa'), ('Hogar');

-- Insertar proveedores
INSERT INTO proveedor (nombre, contacto) VALUES
('Distribuidora Tech', 'contacto@tech.com'),
('Ropa S.A.', 'ventas@ropa.com');

-- Insertar productos
INSERT INTO producto (nombre, descripcion, precio, stock, categoria_id, proveedor_id) VALUES
('Laptop Lenovo', 'Laptop 16GB RAM', 2500.00, 15, 1, 1),
('Camisa Azul', 'Camisa de algodón talla M', 45.99, 40, 2, 2),
('Licuadora Oster', 'Licuadora 3 velocidades', 99.90, 25, 3, 1);



