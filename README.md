# 🏨 Hotel Management System

## 📘 About
A **full-stack Hotel Management System** built using **Spring Boot**, **React.js**, **JWT**, and **AWS S3**.  
This project provides **secure authentication**, **efficient room booking**, and **admin control panels**.  
It follows a **modular backend architecture**, utilizes **DTOs** for data flow optimization, and includes a **responsive frontend** with protected routes and pagination.

---

## 🚀 Features

- 🔐 **JWT Authentication** — Secure login for users and admins.  
- 🏠 **Room Booking** — Real-time room availability and booking management.  
- 🧑‍💼 **Admin Dashboard** — Manage rooms, users, and bookings.  
- ☁️ **AWS S3 Integration** — Store and retrieve room images securely.  
- 📱 **Responsive Frontend** — Built with React.js for seamless UX.  
- ⚙️ **Pagination & Filtering** — Efficient data browsing for large datasets.  
- 🧩 **Modular Architecture** — Clean separation of layers for scalability.

## 🧠 Tech Stack

| **Layer**          | **Technology** |
|--------------------|----------------|
| **Frontend**       | React.js, Axios, React Router DOM |
| **Backend**        | Spring Boot, Spring Security, JPA/Hibernate |
| **Database**       | MySQL / PostgreSQL |
| **Authentication** | JWT |
| **Cloud Storage**  | AWS S3 |
| **Build Tools**    | Maven, npm |
| **Deployment**     | AWS EC2 / Localhost |

---

## 🏗️ Project Structure

```
Hotel-Management-System/
│
├── backend/
│ ├── pom.xml
│ ├── mvnw
│ ├── mvnw.cmd
│ ├── HELP.md
│ ├── README.md
│ └── src/
│ └── main/java/com/Kaala_dev/HSM/
│ ├── controller/ # REST Controllers
│ ├── dto/ # Data Transfer Objects
│ ├── entity/ # Database Entities
│ ├── exception/ # Custom Exceptions
│ ├── repo/ # JPA Repositories
│ ├── security/ # JWT & Security Config
│ ├── service/ # Business Logic Layer
│ ├── utils/ # Helper Functions
│ └── HsmApplication.java
│
├── frontend/
│ ├── package.json
│ ├── package-lock.json
│ ├── README.md
│ ├── public/
│ │ ├── assets/images/ # Image files
│ │ ├── favicon.ico
│ │ ├── index.html
│ │ ├── logo192.png
│ │ ├── logo512.png
│ │ ├── manifest.json
│ │ └── robots.txt
│ │
│ └── src/
│ ├── component/ # UI Components
│ ├── service/ # API & Axios Calls
│ ├── App.js
│ ├── App.css
│ ├── index.js
│ ├── index.css
│ ├── reportWebVitals.js
│ ├── setupTests.js
│ └── logo.svg

```

---

## 📸 Demo

### 🏠 Screenshot 1: Home Page  
![Home Page](readme-source/Screenshot(286).png)

### 📋 Screenshot 2: Bookings Info  
![Bookings Info](readme-source/Screenshot(286).png)

### 📋 Demo Video:   
![Demo Video](screenshots/admin-panel.png)

---

## 🧾 Documentation Includes

- **API Endpoints**  
- **System Design Diagram**  
- **Entity Relationship Diagram (ERD)**  
- **Authentication Flow (JWT)**  
- **Database Schema Overview**  

---

## 🧮 Build & Run Instructions

### 🔹 Backend Setup
```bash
cd backend
mvn clean install
mvn spring-boot:run
```

### 🔹 Frontend Setup

```bash
cd frontend
npm install
npm start
```
---

## ⚙️ Requirements

- Node.js (v16+)
- Java JDK 17+
- Maven
- MySQL / PostgreSQL
- AWS credentials (for S3 integration)

---

---

## **License** 
This project is licensed under the MIT License. See the LICENSE file for details.

---
