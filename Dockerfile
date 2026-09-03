# Java 17.
FROM maven:3.9-eclipse-temurin-17
WORKDIR /app
COPY pom.xml .
RUN mvn -q -B dependency:go-offline || true
COPY src ./src
EXPOSE 8080
CMD ["mvn", "-q", "spring-boot:run"]
