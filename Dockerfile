#cmd : docker build -t skill-service .
FROM openjdk:8
EXPOSE 9091
ADD target/skill-service.jar skill-service.jar
ENTRYPOINT ["java","-jar","/skill-service.jar"]