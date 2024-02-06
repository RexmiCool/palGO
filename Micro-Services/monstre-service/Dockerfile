FROM eclipse-temurin:21-jdk-alpine
VOLUME /tmp
WORKDIR /app
COPY ./target/monstre-service-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","monstre-service-0.0.1-SNAPSHOT.jar"]