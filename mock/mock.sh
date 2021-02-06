#!/usr/bin/env bash

# Start the docker container

docker run -d --rm -p 1080:1080 mockserver/mockserver

curl -v -X PUT "http://localhost:1080/mockserver/openapi" -d '{
    "specUrlOrPayload": "file:/home/schlpbch/code/OSDM/specification/v1.1.0-rc/OSDM-online-api-v1.1.0-rc.yml" 
}'
