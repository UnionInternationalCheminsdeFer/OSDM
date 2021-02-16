#!/usr/bin/env bash

# Poor Man's PostMan

#curl http://localhost:8080/__admin/mappings

echo -e "\n# Booking a trip from Zürich to Davos"

echo -e "\nGeting offers\n"

curl -d "@./__files/requests/trip-offer-request-Zürich-Davos.json" \
    -X POST \
    -H "application/json" \
    http://localhost:8080/trip-offers-collection

echo -e "\n\nBooking offers\n" 

curl -X POST \
    -H "application/json" \
    http://localhost:8080/bookings

echo -e "\n\nCreating fulfillments\n"

curl -X POST \
    -H "application/json" \
    http://localhost:8080/bookings/booking_001/fulfillments   

echo -e "\n\ndone.\n"