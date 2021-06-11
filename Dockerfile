FROM openjdk:8u212-jre-alpine3.9
RUN apk add curl jq

WORKDIR /usr/share/mydocker

ADD target/selenium-docker.jar selenium-docker.jar
ADD target/selenium-docker-tests.jar selenium-docker-tests.jar 
ADD testng.xml testng.xml 
ADD target/libs libs
ADD healthcheck.sh healthcheck.sh
RUN dos2unix healthcheck.sh

ENTRYPOINT sh healthcheck.sh

#ENTRYPOINT java -cp selenium-docker.jar:selenium-docker-tests.jar:libs/* -DBROWSER=$BROWSER -DSE_EVENT_BUS_HOST=$SE_EVENT_BUS_HOST org.testng.TestNG $MODULE