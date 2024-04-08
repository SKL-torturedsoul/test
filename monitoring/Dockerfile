FROM openjdk:17
ADD monitoring/target/monitoring.jar monitoring.jar
ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/latest/download/opentelemetry-javaagent.jar /opentelemetry-javaagent.jar
ENTRYPOINT ["java","-javaagent:./opentelemetry-javaagent.jar","-Dotel.service.name=monitoring-skl","-Dotel.traces.exporter=logging","-Dotel.metrics.exporter=logging","-Dotel.logs.exporter=logging","-jar","/monitoring.jar"]
#Server PORT
EXPOSE 8080
# Management Port
#EXPOSE 9001