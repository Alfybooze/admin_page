#Admin Dashboard
```markdown
# 🛠️ Admin Page - Spring Boot Project

This is a simple admin dashboard built with **Spring Boot** that allows administrators to view all registered users and uses pagination to help imrprove system performance and reduce the work load. It was created as a test project to demonstrate my growing backend development skills.

## 🚀 Features

- View all registered users in a clean admin interface
- Backend powered by Spring Boot
- PostgreSQL database integration
- Simple and beginner-friendly code structure

## 📚 Technologies Used

- Java
- Spring Boot
- Maven (or Gradle)
- PostgreSQL
- Thymeleaf (optional, for frontend templating)

## 🗄️ Database Setup (PostgreSQL)

To run this project locally with PostgreSQL:

### Step 1: Create a Database

Create a new PostgreSQL database named `admin_db` (or any name you prefer).

### Step 2: Update `application.properties`

In your `src/main/resources/application.properties`, configure the database connection:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/admin_db
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### Step 3: Run the App

Make sure PostgreSQL is running, then start your Spring Boot app.

## 📦 Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/Alfybooze/admin_page.git
   ```
2. Navigate to the project directory:
   ```bash
   cd admin_page
   ```
3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Open your browser and go to:
   ```
   http://localhost:8080/admin
   ```

## 🧪 Purpose

This project was built as a learning exercise to:
- Practice building RESTful endpoints
- Understand Spring Boot fundamentals
- Work with user data and admin roles

## 🙌 Author

**Alfred** — aspiring backend developer from Nigeria 🇳🇬  
GitHub: [Alfybooze](https://github.com/Alfybooze)

---

Feel free to fork, clone, or suggest improvements. Every bit of feedback helps me grow!
```

Want me to add example API endpoints or a sample user entity to help others get started faster?
