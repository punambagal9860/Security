# 🛡️ Spring Security Demo Project


This is a simple Spring Boot web application demonstrating **Spring Security** features including:
> In-memory user authentication with BCrypt encrypted passwords
> Role-based access control
> Basic and form login authentication
> Session management
> Custom error page for access denied
## 📁 Project Structure
src/
├── com.nt.config
│ └── SecurityConfig.java # Spring Security Configuration
├── com.nt.controller
│ └── BanckOperationContriller.java # Web Controller
├── com.nt.encoder
│ └── PaswordEncoder.java # Utility to generate BCrypt passwords
└── resources/
├── templates/
│ ├── home.html
│ ├── show_balence.html
│ ├── show_offer.html
│ ├── loan_approve.html
│ └── show_error.html
└── application.properties

## 👥 Users and Roles

The following in-memory users are configured:

| Username | Password | Role     |
|----------|----------|----------|
| raja     | rani     | CUSTOME  |
| Shakti   | hyd      | MANAGER  |
| nitin    | hyd      | VISITOR  |



## 🔐 Secured URLs and Access Control

| Endpoint      | Access Level                    |
|---------------|----------------------------------|
| `/home`       | Public                          |
| `/offer`      | Authenticated users             |
| `/balence`    | Roles: `CUSTOME`, `MANAGER`     |
| `/approve`    | Role: `MANAGER` only            |
| `/error`      | Shown on access denied          |
#Run the application using your IDE or via terminal:

#Dependencies
1.Spring Boot

2.Spring Security

3.Thymeleaf (for views)

4.Maven

📄 License
This project is licensed under the MIT License.





