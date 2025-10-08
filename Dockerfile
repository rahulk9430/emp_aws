
FROM openjdk:17-jdk

COPY target/emp-demo.jar app.jar

EXPOSE 9090

ENTRYPOINT ["java","-jar","/app.jar"]


