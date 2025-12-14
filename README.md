# sweet-shop-spring-boot
Sweet Shop Backend API built with Java and Spring Boot. Includes user authentication, product management, orders, and PostgreSQL integration. Designed as a RESTful backend for an online sweet shop.

# 🍬 Sweet Shop Management System (Spring Boot)

A backend application built using **Java Spring Boot** to manage a sweet shop.  
The system supports **user authentication, role-based access control, inventory management, and purchasing workflows**, following REST API best practices.

---

## 🚀 Tech Stack

- Java 21  
- Spring Boot 3  
- Spring Security (JWT Authentication)  
- Spring Data JPA (Hibernate)  
- PostgreSQL  
- Docker & Docker Compose  
- Gradle  

---

## ✨ Features

### 🔐 Authentication & Authorization
- User registration and login
- JWT-based authentication
- Role-based access:
  - USER
  - ADMIN

### 🍭 Sweet Management
- Add new sweets
- View all sweets
- Search sweets by name, category, or price range
- Update sweet details
- Delete sweets (Admin only)

### 📦 Inventory Management
- Purchase sweets (reduces stock)
- Restock sweets (Admin only)
- Prevents purchase when stock is insufficient

---

## 📁 Project Structure

sweet-shop-spring-boot
├── src
│ ├── main
│ │ ├── java/com/sweetshop
│ │ │ ├── auth
│ │ │ ├── sweets
│ │ │ ├── user
│ │ │ └── config
│ │ └── resources
│ │ └── application.yml
├── docker-compose.yml
├── build.gradle
└── README.md


---

## ⚙️ Configuration



spring:
datasource:
url: jdbc:postgresql://localhost:5432/sweetshop
username: sweet
password: sweet123


---

## 🐳 Run with Docker



docker compose up -d
./gradlew bootRun


Application runs at:


http://localhost:8080


---

## ▶️ Run Locally

Ensure PostgreSQL is running and credentials match `application.yml`.



./gradlew bootRun


---

## 🔐 API Endpoints

### Authentication
- POST `/api/auth/register`
- POST `/api/auth/login`

### Sweets
- POST `/api/sweets`
- GET `/api/sweets`
- GET `/api/sweets/search`
- PUT `/api/sweets/{id}`
- DELETE `/api/sweets/{id}` (Admin)

### Inventory
- POST `/api/sweets/{id}/purchase`
- POST `/api/sweets/{id}/restock` (Admin)

---

## 🔒 Security

- JWT authentication via Authorization header


Authorization: Bearer <token>


---

## 📌 Future Improvements

- Swagger / OpenAPI documentation
- Pagination & sorting
- Frontend UI
- Refresh tokens


