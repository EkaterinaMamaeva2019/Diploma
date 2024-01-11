FROM openjdk:17-oracle
VOLUME /tmp
EXPOSE 8090
ADD target/Diploma-0.0.1-SNAPSHOT.jar Diploma.jar
ENTRYPOINT ["java", "-jar", "/Diploma.jar"]