# First stage: complete build environment
FROM maven:3.8.3-openjdk-17 AS builder
# add pom.xml and source code
ADD ./pom.xml pom.xml
ADD ./src src/
RUN mvn clean package -DskipTests

FROM bellsoft/liberica-openjdk-alpine:17.0.7
# copy jar from the first stage
COPY --from=builder target/bon-voyage-0.0.1-SNAPSHOT.jar bon-voyage-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "bon-voyage-0.0.1-SNAPSHOT.jar"]