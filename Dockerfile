FROM maven:3.9.4-eclipse-temurin-17-alpine AS MAVEN_TOOL_CHAIN
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package

FROM eclipse-temurin:17-jdk-alpine
COPY --from=MAVEN_TOOL_CHAIN /tmp/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]