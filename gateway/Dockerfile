FROM java:8
MAINTAINER Beiqing Chen

ADD ./target/gateway-1.0-SNAPSHOT.jar /app/gateway.jar
CMD ["java", "-Xmx200m", "-jar", "/app/gateway.jar"]

EXPOSE 8060
