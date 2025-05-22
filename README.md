
# Stock Microservices Project

This is a Spring Boot Microservices application that consists of multiple independent services:

## 🧩 Microservices Included

- 🔗 service-registry-stock-spring – Eureka Server for service discovery
- 🚪 Stock-apigate-way – Spring Cloud Gateway for routing requests
- 📈 stock-price-apii – REST API to fetch stock price data
- 🧮 stock-cal-api – REST API to calculate stock-related information

## ⚙️ Tech Stack

- Java + Spring Boot
- Spring Cloud (Eureka, Gateway)
- Maven
- PostgreSQL
- Eclipse IDE
- Git + GitHub

## ▶️ How to Run

1. Start the Eureka Server (`service-registry-stock-spring`)
2. Start the dependent microservices (`stock-price-apii`, `stock-cal-api`)
3. Start the API Gateway (`Stock-apigate-way`)
4. Access via browser or Postman (e.g. http://localhost:8080/...)

## 📁 Folder Structure

```bash
microservice_1/
├── service-registry-stock-spring
├── Stock-apigate-way
├── stock-price-apii
└── stock-cal-api
```

## 📌 Author

Created by [Himansu Ranjan](https://github.com/himansuranjan1)
