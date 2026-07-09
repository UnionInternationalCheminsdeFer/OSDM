---
layout: page
title: Graphical Place Reservation
permalink: /spec/graphical-place-reservation/
---

## Table of contents

- [Introduction](#introduction-)
- [Code List](#code-list-)
  - [Coach Deck layout collection](#coach-deck-layout-collection-)
  - [External Service Icons ](#external-service-icons-)

# Introduction <a name="Introduction">

OSDM offers a standardized API for graphical place reservation. The API consists
of a resource to get the availabilities and a resource to get the logical coach
deck layout.

While the availability is called after a offer request dynamically, the coach
deck layout data should be imported periodically as a master data import.

Fare providers must ensure that coach deck layouts and displayed elements are 
presented to partners as they appear in the provider's own sales channels.

Coach deck layouts must represent an entire coach deck, not just a subset (e.g., 
return all seats, not only those in one compartment).

## Getting Availabilities

There are two flows to get place availabilities. Either you pass in a offer id,
for which you would like to get availabilities or you pass in a existing booking
id.

The availability response is structured as follows: a vehicle consists of
coaches which can have multiple decks. The decks consist of different
compartment types. The type of compartment is defined by service class,
accommodation type and accommodation sub type. For example compartment can be a
second class family compartment. For each deck layouts an id references to the
logical deck layout.

Compartments consists of places. Places can be seats, couchettes or berth. For
each place a status indicates whether it's free, allocated or restricted. The
reservation reference allows to link the place to the correct reservation part.

Optionally it is possible for the reservation system to preselect places or
compartments.

## Getting Deck Layouts

The deck layout response is a logical description of a coach deck. A coach deck
layout is a grid of a given dimension (x, y). All entities describing a coach
deck are placed on this grid. The entities are either graphic elements or
service icons. A graphical element is e.g. a seat, a staircase, or a toilet . A
service icon is e.g. a first class icon indicating a first class service. See
[graphic items](https://osdm.io/spec/catalog-of-code-lists/#GraphicsItems) for a
list of all graphic items.

Both graphical elements as well as service icons are positioned on the grid
according to their defined rectangle which consists of a position (x, y, z) and
a size (width, height). A graphical element can also be rotated using a rotation
angle. This e.g. allows to use only one graphical element of a seat and to
arrange them around a table.

Per convention the grid layout out is in horizontal presentation of a vehicle
driving from right to left. The (0, 0) position is at the top left corner of the
grid.

![Example of a coach deck layout](../../images/graphical-place-reservation/coach-layout.png)

Next is an example with orientation values of graphical elements and seats
shown. Zero degree denotes to the right direction, 90 degree to the bottom
direction, 180 degree to the left direction and 270 degree to the top direction.

Additionally, some of the graphical elements and service icons are denoted: (1)
driver area, (2) silence icon, (3) compartment passage, (4) entry/exit, (5)
luggage area and (6) coach passage.

![Example of a coach deck layout with explanations](../../images/graphical-place-reservation/coach-layout-with-explanations.png)

## Code List <a name="CodeList">

### Coach Deck layout collection <a name="CoachDeckLayoutCollection">

The following collection is used to build and visualize coach deck layouts. The list represents the lowest common denominator of graphic elements that should be understood by all stakeholders. We distinguish between

- Graphical Elements (API Element graphicElements): graphical elements can always be rotated/can have different directions when putting them on the grid.
- Service Icons (API Element serviceIcons): service icons don't need a rotation degree because of the form of the icon. They don't need an orientation when putting it on the grid.

Note: "Icon code" and "Mounting Used" are supported until version 3.6 included. Starting from version 3.7 and 4.0, the human‑readable "Element Code" must be used, and "Mounting Used" is deprecated.

| Icon                                                                                | Description                                                                    | Element Code                  | Orientation (in degrees)| API Element     | Instruction for use                                  |
| ----------------------------------------------------------------------------------- | ------------------------------------------------------------------------------ | ----------------------------- | ----------------------- | --------------- | ---------------------------------------------------- | 
| ![](../../images/catalog-of-code-lists/graphics-icons/image001.png)                 | Seat looking to the right                                                      | `SEAT`                        | 0                       | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image002.png)                 | Seat looking to the left                                                       | `SEAT`                        | 180                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image003.png)                 | Seat looking up                                                                | `SEAT`                        | 270                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image004.png)                 | Seat looking down                                                              | `SEAT`                        | 90                      | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image006.png)                 | Berth looking to the right                                                     | `BERTH`                       | 0                       | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image005.png)                 | Berth looking to the left                                                      | `BERTH`                       | 180                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image007.png)                 | Couchette looking to the right                                                 | `COUCHETTE`                   | 0                       | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image009.jpg)                 | Couchette looking to the left                                                  | `COUCHETTE`                   | 180                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image010.png)                 | Table looking down                                                             | `TABLE`                       | 90                      | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image011.png)                 | Table looking up                                                               | `TABLE`                       | 270                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image012.png)                 | Big table looking down                                                         | `BIG_TABLE`                   | 90                      | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image013.png)                 | Big table looking up                                                           | `BIG_TABLE`                   | 270                     | graphicElements |                                                      |                                                     |
| ![](../../images/catalog-of-code-lists/graphics-icons/image014.png)                 | Wall with angle to left, height covers three places - looking up               | `WALL_LEFT_3`                 | 270                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image015.png)                 | Wall with angle to right, height covers three places - looking up              | `WALL_RIGHT_3`                | 270                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image016.png)                 | Wall with angle to left, height covers three places - looking down             | `WALL_LEFT_3`                 | 90                      | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image017.png)                 | Wall with angle to right, height covers three places - looking down            | `WALL_RIGHT_3`                | 90                      | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image018.png)                 | Small wall with angle to left, height covers two places - looking down         | `WALL_LEFT_2`                 | 270                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image019.png)                 | Small wall with angle to right, height covers two places - looking up          | `WALL_RIGHT_2`                | 270                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image020.png)                 | Small wall with angle to left, height covers two places - looking down         | `WALL_LEFT_2`                 | 90                      | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image021.png)                 | Small wall with angle to right, height covers two places - looking down        | `WALL_RIGHT_2`                | 90                      | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/WALL_LEFT_1-270.png)          | Small wall with angle to left, height covers one place - looking down          | `WALL_LEFT_1`                 | 270                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/WALL_RIGHT_1-270.png)         | Small wall with angle to right, height covers one place - looking up           | `WALL_RIGHT_1`                | 270                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/WALL_LEFT_1-90.png)           | Small wall with angle to left, height covers one place - looking down          | `WALL_LEFT_1`                 | 90                      | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/WALL_RIGHT_1-90.png)          | Small wall with angle to right, height covers one place - looking down         | `WALL_RIGHT_1`                | 90                      | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image022.png)                 | Wall between two compartments, height covers three places - looking up         | `T_WALL_COMPARTMENTS_3`       | 270                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image023.png)                 | Wall between two compartments, height covers three places                      | `T_WALL_COMPARTMENTS_3`       | 90                      | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image024.png)                 | Small wall between 2 compartments, height covers two places - looking up       | `T_WALL_COMPARTMENTS_2`       | 270                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image025.png)                 | Small wall between 2 compartments, height covers two places - looking down     | `T_WALL_COMPARTMENTS_2`       | 90                      | graphicElements |                                                      |                                                    |                                                    |
| ![](../../images/catalog-of-code-lists/graphics-icons/WALL_1.png)                   | Wall, height covers one place                                                  | `WALL_1`                      | 90                      | graphicElements | Wall elements should always be used with 90 degrees. |
| ![](../../images/catalog-of-code-lists/graphics-icons/WALL_2.png)                   | Wall, height covers two places                                                 | `WALL_2`                      | 90                      | graphicElements | Wall elements should always be used with 90 degrees. |
| ![](../../images/catalog-of-code-lists/graphics-icons/WALL_3.png)                   | Wall, height covers three places                                               | `WALL_3`                      | 90                      | graphicElements | Wall elements should always be used with 90 degrees. |
| ![](../../images/catalog-of-code-lists/graphics-icons/WALL_5.png)                   | Wall, height covers five places                                                | `WALL_5`                      | 90                      | graphicElements | Wall elements should always be used with 90 degrees. |
| ![](../../images/catalog-of-code-lists/graphics-icons/image032.png)                 | Arrow indicating upper level                                                   | `ARROW_UPPER_LEVEL_LEFT`      | 90                      | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image033.png)                 | Arrow indicating lower level tbd                                               | `ARROW_LOWER_LEVEL_LEFT`      | 90                      | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image034.png)                 | Arrow indicating upper level tbd                                               | `ARROW_UPPER_LEVEL_RIGHT`     | 90                      | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image035.png)                 | Arrow indicating lower level tbd                                               | `ARROW_LOWER_LEVEL_RIGHT`     | 90                      | graphicElements |                                                      |        |
| ![](../../images/catalog-of-code-lists/graphics-icons/image067.png)                 | Small Window                                                                   | `WINDOW_1`                    | 0                       | graphicElements | Windows should always be used with 0 degrees.        |
| ![](../../images/catalog-of-code-lists/graphics-icons/icon174.png)                  | Medium window                                                                  | `WINDOW_2`                    | 0                       | graphicElements | Windows should always be used with 0 degrees.        |
| ![](../../images/catalog-of-code-lists/graphics-icons/icon175.png)                  | Big window                                                                     | `WINDOW_3`                    | 0                       | graphicElements | Windows should always be used with 0 degrees.        |
| ![](../../images/catalog-of-code-lists/graphics-icons/icon176l.png)                 | Door with left opening (traditional)                                           | `DOOR_OPENING_LEFT`           | 180                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/icon176t.png)                 | Door with left opening (traditional)                                           | `DOOR_OPENING_LEFT`           | 90                      | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/icon176r.png)                 | Door with left opening (traditional)                                           | `DOOR_OPENING_LEFT`           | 0                       | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/icon176b.png)                 | Door with left opening (traditional)                                           | `DOOR_OPENING_LEFT`           | 270                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/icon177l.png)                 | Door with right opening (traditional)                                          | `DOOR_OPENING_RIGHT`          | 180                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/icon177t.png)                 | Door with right opening (traditional)                                          | `DOOR_OPENING_RIGHT`          | 90                      | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/icon177r.png)                 | Door with right opening (traditional)                                          | `DOOR_OPENING_RIGHT`          | 0                       | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/icon177b.png)                 | Door with right opening (traditional)                                          | `DOOR_OPENING_RIGHT`          | 270                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/icon178l.png)                 | Door (sliding)                                                                 | `SLIDING_DOOR`                | 180                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/icon178t.png)                 | Door (sliding)                                                                 | `SLIDING_DOOR`                | 90                      | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/ENTRY_EXIT-90.png)            | Entry/Exit                                                                     | `ENTRY_EXIT`                  | 90                      | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/ENTRY_EXIT-270.png)           | Entry/Exit                                                                     | `ENTRY_EXIT`                  | 270                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/DRIVER_AREA.png)              | Driver Area looking to the left                                                | `DRIVER_AREA`                 | 180                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/DRIVER_AREA_R.png)            | Driver Area looking to the right                                               | `DRIVER_AREA`                 | 0                       | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/DRIVER_AREA_TRAIN.png)        | Driver Area Tram looking to the left                                           | `TRAIN_DRIVER_AREA`           | 180                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/DRIVER_AREA_TRAIN_R.png)      | Driver Area Tram looking to the right                                          | `TRAIN_DRIVER_AREA`           | 0                       | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/DRIVER_AREA_BUS.png)          | Driver Area Bus looking to the left                                            | `BUS_DRIVER_AREA`             | 180                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/DRIVER_AREA_BUS_R.png)        | Driver Area Bus looking to the right                                           | `BUS_DRIVER_AREA`             | 0                       | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/COACT_PASSAGE_L.png)          | Coach passage looking to the left                                              | `COACH_PASSAGE`               | 180                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/COACH_PASSAGE.png)            | Coach passage looking to the right                                             | `COACH_PASSAGE`               | 0                       | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/COACH_WALL_NO_PASSAGE_L.png)  | Coach wall - no passage looking to the left                                    | `COACH_WALL_NO_PASSAGE`       | 180                     | graphicElements |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/COACH_WALL_NO_PASSAGE.png)    | Coach wall - no passage looking to the right                                   | `COACH_WALL_NO_PASSAGE`       | 0                       | graphicElements |                                                      |                                                  |
| ![](../../images/catalog-of-code-lists/graphics-icons/icon004.png)                  | Wheelchair space                                                               | `WHEELCHAIR_SPACE`            | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image037.png)                 | 2nd class area                                                                 | `SECOND_CLASS_AREA`           | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image036.png)                 | 1st class area                                                                 | `FIRST_CLASS_AREA`            | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image041.png)                 | Bar area                                                                       | `BAR_AREA`                    | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image038.png)                 | Mobile phone area                                                              | `MOBILE_PHONE_AREA`           | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image039.png)                 | Mobile phone forbidden area                                                    | `MOBILE_PHONE_FORBIDDEN_AREA` | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image052.png)                 | PRM area                                                                       | `PRM_AREA`                    | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image051.png)                 | Family area                                                                    | `FAMILY_AREA`                 | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image042.png)                 | Restaurant area                                                                | `RESTAURANT_AREA`             | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image043.png)                 | Bicycle area                                                                   | `BICYCLE_AREA`                | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image044.png)                 | Luggage area                                                                   | `LUGGAGE_AREA`                | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image045.png)                 | Luggage locker                                                                 | `LUGGAGE_LOCKER`              | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image046.png)                 | Conference compartment                                                         | `CONFERENCE`                  | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image050.png)                 | Space for prams                                                                | `PRAM_AREA`                   | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image047.png)                 | Wardrobe area                                                                  | `WARDROBE_AREA`               | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image048.png)                 | Dust bin                                                                       | `BIN`                         | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image055.png)                 | Toilet                                                                         | `TOILET_AREA`                 | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image040.png)                 | Silence area                                                                   | `SILENCE_AREA`                | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image049.png)                 | Children play area                                                             | `PLAYGROUND_AREA`             | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image054.png)                 | Non-smoker area                                                                | `NON_SMOKING_AREA`            | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image056.png)                 | Power socket                                                                   | `POWER_SOCKET`                | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image053.png)                 | Priority Seat                                                                  | `PRIORITY_SEAT`               | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image058.jpg)                 | WiFi area                                                                      | `WIFI_AREA`                   | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image060.jpg)                 | PRM toilet                                                                     | `PRM_TOILET`                  | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image062.jpg)                 | Air conditioning                                                               | `AIR_CONDITIONING`            | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image064.jpg)                 | USB port for charging                                                          | `USB_SOCKET`                  | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image066.png)                 | Reclining seat                                                                 | `RECLINABLE_SEAT`             | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image069.jpg)                 | Stairs upwards                                                                 | `STAIR_UPWARDS_AREA`          | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image070.jpg)                 | Stairs downwards                                                               | `STAIR_DOWNWARDS_AREA`        | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image072.jpg)                 | Working compartment                                                            | `WORKING_AREA`                | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image074.jpg)                 | Cabin for passengers with allergies                                            | `ANTI_ALLERGIC_AREA`          | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image076.jpg)                 | Meeting lounge for 7 people (Pendolino)                                        | `MEETING_AREA_7`              | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image078.jpg)                 | Meeting lounge for 12 people                                                   | `MEETING_AREA_12`             | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image080.jpg)                 | Ski area                                                                       | `SKI_AREA`                    | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image082.jpg)                 | Conductor working compartment                                                  | `STAFF_AREA`                  | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image084.jpg)                 | Mobile phone booth                                                             | `PHONE_BOOTH`                 | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image086.jpg)                 | T-loop (audio induction loop)                                                  | `T_LOOP`                      | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image088.jpg)                 | Pets area                                                                      | `PETS_AREA`                   | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image090.jpg)                 | Sleeping cabin with toilet and shower                                          | `SLEEPING_CABIN_TOILET_SHOWER`| -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image092.jpg)                 | Interconnectible sleeping compartments                                         | `CONNECTABLE_COMPARTMENTS`    | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image094.jpg)                 | Shower                                                                         | `SHOWER`                      | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image096.jpg)                 | Baby-care table                                                                | `BABY_CARE_TABLE`             | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/TODDLER_AREA.png)             | Toddler Area                                                                   | `TODDLER_AREA`                | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image098.jpg)                 | Push-button operated wheelchair ramp                                           | `WHEELCHAIR_PUSH_BUTTON`      | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image099.png)                 | Sink/washbasin                                                                 | `SINK`                        | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/image101.jpg)                 | Women's compartment                                                            | `WOMEN_COMPARTMENT`           | -                       | serviceIcon     |                                                      |
| ![](../../images/catalog-of-code-lists/graphics-icons/MULTI_FUNCTION_AREA.png)      | Multi Function Area                                                            | `MULTI_FUNCTION_AREA`         | -                       | serviceIcon     |                                                      |

#### Custom elements <a name="CustomElements">
In addition to the list above, it is of course possible (based on bilateral agreements) to use partner-specific elements with their own codes (that have to be defined bilaterally). 

#### Compartment passage <a name="CompartmentPassage">
The passage between two compartments ("compartment passage") should not be represented by one icon like this one:

![](../../images/catalog-of-code-lists/graphics-icons/COMPARTMENT_PASSAGE.png) 

but by two separate wall icons arranged one above the other with a gap between them (e.g. "WALL_1" and "WALL_2").

### External Service Icons <a name="ExternalServiceIcons">

**Note:** External service icons are decommissioned starting with version 4.0 (included).

| Icons concerning the entire coach                                              | description                                | icon code | Code of Service Icon          |
| ------------------------------------------------------------------------------ | ------------------------------------------ | --------- | ----------------------------- |
| ![](../../images/catalog-of-code-lists/graphics-icons/image102.png)               | 1st class coach                            | 121       | `FIRST_CLASS_ICON`            |
| ![](../../images/catalog-of-code-lists/graphics-icons/image103.png)               | 2nd class coach                            | 122       | `SECOND_CLASS_ICON`           |
| ![](../../images/catalog-of-code-lists/graphics-icons/image104.png)               | mobile phone coach                         | 127       | `MOBILE_PHONE_ICON`           |
| ![](../../images/catalog-of-code-lists/graphics-icons/image105.png)               | mobile phone forbidden in the entire coach | 128       | `MOBILE_PHONE_FORBIDDEN_ICON` |
| ![](../../images/catalog-of-code-lists/graphics-icons/image106.png)               | silence coach                              | 126       | `SILENCE_ICON`                |
| ![](../../images/catalog-of-code-lists/graphics-icons/image107.png)               | bistro                                     | 123       | `BISTRO_ICON`                 |
| ![](../../images/catalog-of-code-lists/graphics-icons/image108.png)               | restaurant car                             | 124       | `RESTAURANT_ICON`             |
| ![](../../images/catalog-of-code-lists/graphics-icons/BICYCLE_ICON.png)           | bicycle coach                              | 125       | `BICYCLE_ICON`                |
| ![](../../images/catalog-of-code-lists/graphics-icons/BICYCLE_LOW_ICON.png)       | bicycle coach (lower hock)                 | -         | `BICYCLE_LOW_ICON`            |
| ![](../../images/catalog-of-code-lists/graphics-icons/BICYCLE_MIDDLE_ICON.png)    | bicycle coach (middle hock)                | -         | `BICYCLE_MIDDLE_ICON`         |
| ![](../../images/catalog-of-code-lists/graphics-icons/BICYCLE_HIGH_ICON.png)      | bicycle coach (upper hock)                 | -         | `BICYCLE_UPPER_ICON`          |
| ![](../../images/catalog-of-code-lists/graphics-icons/image110.png)               | mixed group/individual coach               | 129       | `MIXED_GROUP_ICON`            |
| ![](../../images/catalog-of-code-lists/graphics-icons/image112.jpg)               | WiFi area                                  | 139       | `WIFI_ICON`                   |
| ![](../../images/catalog-of-code-lists/graphics-icons/image114.jpg)               | air condition                              | 140       | `AC_ICON`                     |
| ![](../../images/catalog-of-code-lists/graphics-icons/image116.jpg)               | USB ports for charging                     | 141       | `USB_PORT_ICON`               |
| ![](../../images/catalog-of-code-lists/graphics-icons/image118.jpg)               | business class                             | 142       | `BUSINESS_ICON`               |
| ![](../../images/catalog-of-code-lists/graphics-icons/image119.png)               | panorama coach                             | 143       | `PANORAMA_ICON`               |
| ![](../../images/catalog-of-code-lists/graphics-icons/image121.jpg)               | luggage coach                              | 173       | `LUGGAGE_ICON`                |
| ![](../../images/catalog-of-code-lists/graphics-icons/image123.jpg)               | sleeping car                               | 174       | `SLEEPING_CAR_ICON`           |
| ![](../../images/catalog-of-code-lists/graphics-icons/image125.jpg)               | car-carrier                                | 175       | `CAR_CARRIER_ICON`            |
| ![](../../images/catalog-of-code-lists/graphics-icons/MULTI_FUNCTION_ICON.png)    | multi function                             | -         | `MULTI_FUNCTION_ICON`         |
| ![](../../images/catalog-of-code-lists/graphics-icons/WHEELCHAIR_ICON.png)        | wheelchair                                 | -         | `WHEELCHAIR_ICON`             |
| ![](../../images/catalog-of-code-lists/graphics-icons/PRAM_ICON.png)              | pram                                       | -         | `PRAM_ICON`                   |
| ![](../../images/catalog-of-code-lists/graphics-icons/PLAYGROUND_ICON.png)        | playground                                 | -         | `PLAYGROUND_ICON`             |
| ![](../../images/catalog-of-code-lists/graphics-icons/EASY_ACCESS_ICON.png)       | easy access                                | -         | `EASY_ACCESS_ICON`            |
| ![](../../images/catalog-of-code-lists/graphics-icons/TOILET_ICON.png)            | toilet                                     | -         | `TOILET_ICON`                 |
| ![](../../images/catalog-of-code-lists/graphics-icons/TOILET_WHEELCHAIR_ICON.png) | toilet supporting wheelchairs              | -         | `TOILET_PRM_ICON`             |
| ![](../../images/catalog-of-code-lists/graphics-icons/SKI_ICON.png)               | ski                                        | -         | `SKI_ICON`                    |
