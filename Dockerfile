FROM amazoncorretto:23-alpine-jdk

EXPOSE 8080

COPY target/HW_REST-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]