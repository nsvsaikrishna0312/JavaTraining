FROM openjdk:17.0.2-jdk

WORKDIR /app

COPY target/pms.jar app.jar

EXPOSE 8082

CMD ["java","-jar","app.jar"]

