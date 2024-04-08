FROM openjdk:17
ADD monitoring/target/monitoring.jar monitoring.jar
ENTRYPOINT ["java","-javaagent:./monitoring/opentelemetry-javaagent.jar","-Dotel.traces.exporter=logging","-Dotel.metrics.exporter=logging","-Dotel.logs.exporter=logging","-jar","/monitoring.jar"]
#Server PORT
EXPOSE 9000
# Management Port
EXPOSE 9001