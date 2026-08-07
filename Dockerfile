FROM openjdk:25
COPY target/OrderService03-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]