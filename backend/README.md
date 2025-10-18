# Getting Started with Spring Boot Backend

This project is a **Spring Boot backend** for the **Hotel Management System**.

---

## Prerequisites

Make sure you have the following installed:

- **Java 17+ (JDK)**
- **Maven** (for building and running the project)
- **MySQL** (or any configured database)

---

## Running the Application

### Using Maven

In the project directory, run:

```bash
mvn spring-boot:run

### Using the JAR
```

Build the JAR:

```bash
mvn clean package
```

Run the JAR:

```bash
java -jar target/HSM-0.0.1-SNAPSHOT.jar
```

## Database Configuration

The application uses MySQL. Update your application.properties:

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/HSM_db
spring.datasource.username=root
spring.datasource.password=YOUR-PASSWORD
spring.jpa.hibernate.ddl-auto=update
```
** ⚠️ Note: Never commit real passwords or API keys. Use placeholders or environment variables. **

## Available Scripts / Commands

| Command                                   | Description                                 |
|-------------------------------------------|---------------------------------------------|
| `mvn spring-boot:run`                     | Starts the application in development mode |
| `mvn clean package`                        | Builds the project into a JAR for production |
| `java -jar target/HSM-0.0.1-SNAPSHOT.jar` | Runs the built JAR                          |
| `mvn test`                                 | Runs all unit tests                          |


## Environment Variables (Secrets)

For **AWS keys** or other secrets, use environment variables instead of committing them:

```properties
aws.s3.access.key=${AWS_ACCESS_KEY_ID}
aws.s3.secret.key=${AWS_SECRET_ACCESS_KEY}
```

## Learn More

- [Spring Boot Official Documentation](https://spring.io/projects/spring-boot)  
- [Spring Boot Guides](https://spring.io/guides)  
- [Building RESTful APIs with Spring Boot](https://spring.io/guides/gs/rest-service/)

