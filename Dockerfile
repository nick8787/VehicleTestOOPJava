FROM openjdk:21

WORKDIR /app

COPY target/VehicleTest.jar /app

CMD ["java", "-jar", "VehicleTest.jar"]
