# Java 11 (Spring Boot 2.3 predates Java 17 support).
FROM maven:3.9-eclipse-temurin-11
WORKDIR /app
COPY pom.xml .
RUN mvn -q -B dependency:go-offline || true
COPY src ./src
EXPOSE 8080
CMD ["mvn", "-q", "spring-boot:run"]
