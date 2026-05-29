# 📒 Notes Application

A secure Notes web application built with Spring Boot, Thymeleaf, and Spring Security.

## 🛠️ Tech Stack
- Java 21
- Spring Boot 3.5.14
- Spring Security
- Spring MVC
- Thymeleaf
- Maven

## ✨ Features
- Secure login system with authentication
- Add new notes with title and content
- Edit existing notes
- Delete notes
- Logout mechanism

## 🚀 How to Run
1. Clone the repo
   git clone https://github.com/mohsabbah7/notes-app.git
2. Navigate to the project folder
   cd notes-app
3. Run the application
   ./mvnw spring-boot:run
4. Open your browser and go to
   http://localhost:8080/notes

## 👤 Default User
| Username | Password | Role |
|----------|----------|------|
| user | password | USER |
| admin | password | USER |

## 📁 Project Structure
- model - Note data class
- controller - NoteController handles HTTP requests
- service - Business logic for notes and authentication
- config - Spring Security configuration
- templates - Thymeleaf HTML pages (login, notes, edit)
