FROM adoptopenjdk/openjdk11:alpine

WORKDIR /app

COPY target/payment-service-0.0.1-SNAPSHOT.jar .

EXPOSE 3002

CMD ["java", "-jar", "/app/payment-service-0.0.1-SNAPSHOT.jar"]