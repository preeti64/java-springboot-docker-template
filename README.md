# Project Name

## Overview

A brief description of the project.

## Technologies Used

- Java
- Spring Boot
- JPA/Hibernate
- Maven
- Docker (if applicable)
- ModelMapper (for DTO conversion)

## Getting Started

### Prerequisites

- JDK 11 or higher
- Docker (if applicable)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/preeti64/java-springboot-docker-template.git
   cd java-springboot-docker-template

## Setting up the Database with Docker

To set up the PostgresSQL database using Docker, ensure you have Docker installed on your machine. Additionally, you will need a `docker-compose.yml` file at the root of your project which defines the PostgresSQL service configuration. Then, run the following command in the project root directory:

```shell
docker-compose up -d
```
## Getting Started

### Building the Project
1. **With Maven:**
   ```shell
   mvn clean install

### Running the Application with Maven

After building the project with Maven, you can run the application using the following command:

   ```shell
mvn spring-boot:run
```

### Testing the application
And also, unit tests can be run using the following command:

```shell
mvn test
```
