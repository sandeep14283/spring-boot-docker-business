FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-docker-business.jar spring-boot-docker-business.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker-business.jar"]