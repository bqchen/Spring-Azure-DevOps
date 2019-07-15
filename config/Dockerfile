FROM java:8
MAINTAINER Beiqing Chen

ADD ./target/config-1.0-SNAPSHOT.jar /app/config.jar
#CMD ["java", "-Xmx200m", "-jar", "/app/config.jar"]
ENTRYPOINT ["java","-jar","/app/config.jar"]

EXPOSE 8888
