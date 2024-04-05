FROM openjdk:17
ADD monitoring/target/monitoring.jar monitoring.jar
ENTRYPOINT ["java","-jar","/monitoring.jar"]
#Server PORT
EXPOSE 9000
# Management Port
EXPOSE 9001