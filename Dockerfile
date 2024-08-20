FROM maven:3.8.4-openjdk-17

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and the source code into the container
COPY pom.xml /app/
COPY src /app/src

# Download the project dependencies
RUN mvn dependency:go-offline

# Build the project
RUN mvn package

# Specify the command to run the application
CMD ["mvn", "spring-boot:run"]