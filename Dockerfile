FROM openjdk:8
EXPOSE 8900
ADD target/test1.jar test1.jar
ENTRYPOINT ["java", "-jar", "/test1.jar"]