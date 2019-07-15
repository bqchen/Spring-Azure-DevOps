FROM java:8
MAINTAINER Beiqing Chen

ADD ./target/app-service-1.0-SNAPSHOT.jar /app/app-service.jar
CMD ["java", "-Xmx200m", "-jar", "/app/app-service.jar"]

EXPOSE 8070
