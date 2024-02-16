FROM ubuntu:latest

# Install necessary dependencies
RUN apt-get update && \
    apt-get install -y openjdk-11-jdk maven

RUN mkdir /app

COPY . /app

WORKDIR /app

RUN mvn package

RUN cd target/

CMD ["java", "-jar", "Calculator-1.0-SNAPSHOT.jar"]
