FROM openjdk:18.0.1.1-oraclelinux7
EXPOSE 8080
ADD target/arqui-efinal-0.0.1-SNAPSHOT.jar arqui-efinal-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","arqui-efinal-0.0.1-SNAPSHOT.jar"]