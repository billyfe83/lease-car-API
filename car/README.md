# Lease-a-Car API

This is a simple Spring Boot REST API project for managing customers and cars for a leasing system.

---

## Technologies Used

- Java 21
- Spring Boot
- REST API
- Maven
- IntelliJ IDEA

---

## Project Structure
 - controller
  - - CarController.java
  - - CustomerController.java
- model
  - - Car.java
  - - Customer.java

---

## Features

### Customer Management
- Add customer
- View customers
- Delete customer

### Car Management
- Add car
- View cars

---

## API Endpoints

### Customer APIs

- GET `/customers` → Get all customers
- POST `/customers` → Add a new customer
- DELETE `/customers/{id}` → Delete a customer

### Car APIs

- GET `/cars` → Get all cars
- POST `/cars` → Add a new car

---

## How to Run the Project

1. Open project in IntelliJ IDEA
2. Make sure Java 21 is installed
3. Run `CarApplication.java`
4. Server will start on:port:8080

---
## How to Test APIs

  Use Postman
