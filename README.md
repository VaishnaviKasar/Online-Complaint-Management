Online Complaint Management System
📌 Project Overview
The Online Complaint Management System is a Spring Boot–based RESTful application that allows users to register complaints, track their status, and enables administrators to manage and resolve complaints efficiently.
This project demonstrates backend development using Java and Spring Boot, REST APIs, and database integration.

🚀 Features
User registration and user management
Register a complaint
View all complaints
View complaint by ID
Filter complaints by status
Update complaint status
Delete a complaint
Complaint status managed using Enum
Clean layered architecture (Controller, Service, Repository)

🛠️ Technologies Used
Java 17
Spring Boot
Spring Data JPA
Hibernate
MySQL
Postman
Maven
Lombok

🧱 Project Structure
com.vaishnavi.complaintmanagement
│
├── controller      → REST API endpoints
├── service         → Business logic
├── repository      → Database interaction
├── model           → Entity classes
└── ComplaintManagementApplication.java

📂 Entity Details
## User
id
name
email
password
role (USER / ADMIN)

## Complaint
id
title
description
status (OPEN, IN_PROGRESS, RESOLVED, CLOSED)
createdAt
user

📡 API Endpoints (Postman Collection)
## User APIs
Method	Endpoint	Description
POST	/api/users/register	Register a new user
GET	/api/users	Get all users
GET	/api/users/{id}	Get user by ID
## Complaint APIs
Method	Endpoint	Description
POST	/api/complaints	Register a new complaint
GET	/api/complaints	Get all complaints
GET	/api/complaints/{id}	Get complaint by ID
GET	/api/complaints/status/{status}	Get complaints by status
PUT	/api/complaints/{id}/status	Update complaint status
DELETE	/api/complaints/{id}	Delete complaint by ID

🧪 API Testing (Postman)
All APIs are tested using Postman
HTTP methods used: GET, POST, PUT, DELETE
JSON request & response format
Enum values used strictly (OPEN, IN_PROGRESS, RESOLVED, CLOSED)

▶️ How to Run the Project
Clone the repository
Open project in IntelliJ IDEA / Eclipse
Configure database details in application.properties
Run: ComplaintManagementApplication.java
Access APIs using Postman:
http://localhost:8080

🎯 Learning Outcomes
Built RESTful APIs using Spring Boot
Implemented CRUD operations using Spring Data JPA
Used Enum for complaint status handling
Practiced API testing using Postman
Gained hands-on backend development experience

👩‍💻 Developed By
Vaishnavi Kasar
Java Full Stack Developer
