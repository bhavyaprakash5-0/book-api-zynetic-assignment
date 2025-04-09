# Zynetic Bookstore API

A RESTful Bookstore API built using **Java Spring Boot**, created as part of an assignment from **Zynetic**. This backend service handles user authentication and will support full CRUD operations for books.

## Features Implemented So Far

-  Spring Boot project setup using IntelliJ
-  In-memory database (H2) configured for development
-  User signup with email & hashed password (BCrypt)
-  JWT-based login with token generation
-  Basic Spring Security configuration
-  Protected routes setup (in progress)

## Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/zynetic-bookstore-api.git
cd zynetic-bookstore-api
```

### 2. Run the Application

Use IntelliJ or run via Maven:

```bash
./mvnw spring-boot:run
```

The app will start on:  
`http://localhost:8080`

---

## Assumptions & Notes

- Using an in-memory H2 database for testing and development.
- Passwords are stored securely using BCrypt.
- JWT is used for stateless authentication.
- Token will be required for book endpoints (currently being implemented).
- Data resets on every restart (due to in-memory DB).

