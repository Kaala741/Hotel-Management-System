Getting Started with Spring Boot Backend

This project is a Spring Boot backend for the Hotel Management System.

Prerequisites

Make sure you have installed the following:

Java 17+ (JDK)

Maven (for building and running the project)

MySQL (or any configured database)

Running the Application

In the project directory, you can run:

Using Maven
mvn spring-boot:run


Starts the backend server in development mode.

By default, it runs on http://localhost:4040
.

Any changes to source code will require restarting the server.

Using the JAR

Build the JAR:

mvn clean package


Run the JAR:

java -jar target/HSM-0.0.1-SNAPSHOT.jar

Database Configuration

The application uses MySQL. Update your application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/HSM_db
spring.datasource.username=root
spring.datasource.password=YOUR-PASSWORD
spring.jpa.hibernate.ddl-auto=update


Note: Never commit real passwords or API keys. Use placeholders or environment variables.

Available Scripts / Commands
Command	Description
mvn spring-boot:run	Starts the application in development mode
mvn clean package	Builds the project into a JAR for production
java -jar target/HSM-0.0.1-SNAPSHOT.jar	Runs the built JAR
mvn test	Runs all unit tests
Deployment

Build the JAR using mvn clean package.

Deploy the JAR on your server.

Make sure your MySQL database is running and accessible.

Optional: You can also use Docker for deployment.

Learn More

Spring Boot Official Documentation

Spring Boot Guides

Building RESTful APIs with Spring Boot

Environment Variables (Secrets)

For AWS keys or other secrets, use environment variables instead of committing them:

aws.s3.access.key=${AWS_ACCESS_KEY_ID}
aws.s3.secret.key=${AWS_SECRET_ACCESS_KEY}


Set them in your system or server:

Windows PowerShell:

$env:AWS_ACCESS_KEY_ID="your_access_key"
$env:AWS_SECRET_ACCESS_KEY="your_secret_key"                                                                                 This prevents sensitive credentials from being exposed in your Git repository.

Learn More

Spring Boot Official Documentation

Spring Boot Guides

Building RESTful APIs with Spring Boot                                       rewrite everyhting in readme file style                     
