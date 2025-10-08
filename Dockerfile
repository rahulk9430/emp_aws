
FROM openjdk:17-jdk

COPY target/emp-demo.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]


