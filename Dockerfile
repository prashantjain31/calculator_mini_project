FROM openjdk:11

RUN mkdir /app

COPY ./target/Calculator-1.0-SNAPSHOT.jar /app

WORKDIR /app

CMD ["java", "-cp", "Calculator-1.0-SNAPSHOT.jar", "Main"]
