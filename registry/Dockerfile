FROM java:8
MAINTAINER Beiqing Chen

ADD ./target/registry-1.0-SNAPSHOT.jar /app/registry.jar
#CMD ["java", "-Xmx200m", "-jar", "/app/registry.jar"]
ENTRYPOINT ["java","-jar","/app/registry.jar"]

EXPOSE 8761
