# multi-stage builds are an alternative #
# FROM openjdk:17-jdk as builder
# run tests, create the jar
#
# FROM some-slim-java-container
# COPY --from builder something.jar app.jar

# alpine images are generally smaller
FROM amazoncorretto:17-alpine

ARG JAR

COPY ${JAR} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
