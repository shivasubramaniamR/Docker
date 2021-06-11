#!/usr/bin/env bash
# Environment Variables
# HUB_HOST
# BROWSER
# MODULE

echo "Checking if hub is ready - $SE_EVENT_BUS_HOST"

while [ "$( curl -s http://$SE_EVENT_BUS_HOST:4444/status | jq -r .value.ready )" != "true" ]
do
	sleep 1
done

# start the java command
java -cp selenium-docker.jar:selenium-docker-tests.jar:libs/* \
    -DSE_EVENT_BUS_HOST=$SE_EVENT_BUS_HOST \
    -DBROWSER=$BROWSER \
    org.testng.TestNG $MODULE