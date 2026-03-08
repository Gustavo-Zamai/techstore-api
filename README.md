# TechStore API

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.x-brightgreen)
![Build](https://img.shields.io/badge/build-Maven-blue)
![License](https://img.shields.io/badge/license-MIT-lightgrey)

TechStore API is a **RESTful backend service** built with **Java and Spring Boot** that provides endpoints for managing products, categories, and suppliers.

This API was created to support the TechStore Desktop System, exposing its data through RESTful service

The API can be used by **desktop, web, or mobile applications**.

---

# 🚀 Tech Stack

| Technology      | Description               |
| --------------- | ------------------------- |
| Java            | Core programming language |
| Spring Boot     | Backend framework         |
| Spring Web      | REST API development      |
| Spring Data JPA | Database abstraction      |
| Hibernate       | ORM for persistence       |
| Maven           | Dependency management     |
| MySQL           | Relational database       |

---

## 🔗 Relationship with the Desktop Application

This API was developed as a backend service for the **TechStore Desktop Application**.

The original system was built as a **Java desktop application**, and this API was created to expose the business data through REST endpoints. This allows the system to evolve into a more scalable architecture where different clients (desktop, web, or mobile) can interact with the same backend.

The API reuses the core data model from the desktop application, adapting it to a RESTful architecture using **Spring Boot** and **Spring Data JPA**.

---

# 🏗️ Architecture

The project follows a layered architecture commonly used in **Spring Boot applications**.

```
Controller → Service → Repository → Database
```

### Layers

**Controller**

Handles HTTP requests and responses.

**Service**

Contains the business logic.

**Repository**

Handles database access using Spring Data JPA.

**Model**

Represents the entities mapped to database tables.

---

# 📁 Project Structure

```
src
 └─ main
     ├─ java
     │   └─ com.techstore.api
     │       ├─ controller
     │       │   └─ ProductController.java
     │       │
     │       ├─ service
     │       │   └─ ProductService.java
     │       │
     │       ├─ repository
     │       │   └─ ProductRepository.java
     │       │
     │       ├─ model
     │       │   └─ Product.java
     │       │
     │       └─ TechstoreApiApplication.java
     │
     └─ resources
         └─ application.properties
```

---

# ⚙️ Running the Application

## 1️⃣ Clone the repository

```
git clone https://github.com/your-username/techstore-api.git
```

## 2️⃣ Navigate to the project

```
cd techstore-api
```

## 3️⃣ Run the application

Using Maven:

```
mvn spring-boot:run
```

Or run the main class:

```
TechstoreApiApplication.java
```

---

# 🌐 API Base URL

```
http://localhost:8080
```

---

# 📡 API Endpoints

## Products

### Get all products

```
GET /products
```

### Get product by ID

```
GET /products/{id}
```

### Create a new product

```
POST /products
```

Example request body:

```json
{
  "name": "Notebook",
  "description": "Laptop computer",
  "price": 2500,
  "amount": 5
}
```

### Update a product

```
PUT /products/{id}
```

### Delete a product

```
DELETE /products/{id}
```

---

# 🗄️ Database Configuration

Edit `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/techstore
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# 📚 Future Improvements

* Authentication with Spring Security
* API documentation using Swagger / OpenAPI
* Pagination and filtering
* Docker containerization
* Automated tests (JUnit)

---

# 📄 License

This project is licensed under the **MIT License**.

---

# 👨‍💻 Author

Developed by **Gustavo Simão Zamai** as part of a study project focused on **Java backend development, Spring Boot, and REST APIs**.
