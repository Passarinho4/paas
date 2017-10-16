FROM java:alpine
EXPOSE 8080
COPY build/libs/paas-1.0-SNAPSHOT.jar /
ENTRYPOINT java -jar /paas-1.0-SNAPSHOT.jar