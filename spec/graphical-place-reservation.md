# Graphical Place Reservation

OSDM offers a standardized API for graphical place reservation. The API consists
of a resource to get the availabilities and a resource to get the logical coach
deck layout.

While the availability is called after a offer request dynamically, the coach
deck layout data should be imported periodically as a master data import.

## Availability Response Structure

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

## Deck Layout Response Structure

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

Per convention the grid is layout out in vertical presentation of a vehicle
driving from left to right. The (0, 0) position is at the top left corner of the
grid.

![Example of a coach deck layout](../images/graphical-place-reservation/coach-deck-layout.png)
