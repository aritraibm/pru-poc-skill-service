#cmd : docker build -t skill-service .
FROM eclipse-temurin:8-jdk-alpine
EXPOSE 9091
VOLUME /tmp
COPY target/*.jar skill-service.jar
ENTRYPOINT ["java","-jar","/skill-service.jar"]