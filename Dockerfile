FROM openjdk:19-jdk-alpine
WORKDIR /app
#EXPOSE 8081
COPY build/libs/bike-rental-back-0.0.1-SNAPSHOT.jar bike-rental-back-0.0.1.jar
COPY build/resources/main/application.properties ./config/
CMD java -Dspring.config.location=/app/config/application.properties -jar bike-rental-back-0.0.1.jar