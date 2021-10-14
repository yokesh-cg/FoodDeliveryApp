FROM openjdk:11
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
EXPOSE 8080
CMD ["java", "-jar", "/fooddeliveryapp-0.0.1-SNAPSHOT.jar"]