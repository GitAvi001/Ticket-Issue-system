# Musical Event Ticket Booking System
A comprehensive microservices-based ticket booking platform backend built with Spring Boot for managing musical events, 
inventory, and order processing.

## 🏗️ Architecture Overview

![Musical event - diagram drawio](https://github.com/user-attachments/assets/8bb08b49-b04d-4479-a6e1-a14668e9a598)


This system follows a microservices architecture pattern with the following core components:

1. API Gateway: Central entry point for all client requests.
2. Order Service: Handles ticket order processing and management.
3. Booking Service: Manages event bookings.
4. Inventory Service: Tracks ticket availability.
5. Authentication: Secured with Keycloak for OAuth2 authentication.
6. Database: MySQL for persistent data storage.

🎯 Core Functionalities

1. Event Management: Create and manage musical events
2. Ticket Booking: Real-time seat selection and booking
3. Inventory Tracking: Dynamic ticket availability management
4. Order Processing: Complete order lifecycle management
5. User Authentication: Secure user registration and login

🛠️ Technologies

1. Backend framework: Spring Boot 3.5.0
2. Language: Java 21
3. Build Tool: Maven
4. Database: MySQL 8.3
5. Authentication: Keycloak 21+
6. Message Queue: Apache Kafka
7. Database migration: Flyway
8. Containerization: Docker
9. API Documentation: OpenAPI specification 3.1.1

💻 Steps

1. Clone repository: git clone https://github.com/GitAvi001/Ticket-Issue-system.git
2. Navigate to the project directory: cd Ticket-Issue-system
3. Change to inventory service directory: cd inventory-service
4. Start docker compose: docker compose up -d
5. Run the application: Apply a new configuration or simply click the run button
6. Change to order service directory: cd ../order-service
7. Run the order service: Apply a new configuration or simply click the run button
8. Change to booking service directory: cd ../booking-service
9. Run the booking service: Apply a new configuration or simply click the run button
10. Change to api gateway directory: cd ../api-gateway
11. Run the api-gateway service: Apply a new configuration or simply click the run button

📚 API Documentation
1. Access the API documentation for inventory service: http://localhost:8080/swagger-ui/index.html
2. Access the API documentation for order service: http://localhost:8090/swagger-ui/index.html





