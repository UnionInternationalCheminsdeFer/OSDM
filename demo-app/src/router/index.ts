import { createRouter, createWebHistory, type RouteLocationNormalizedGeneric } from 'vue-router'
import SearchView from '@/views/SearchView.vue'
import TripsView from '@/views/TripsView.vue'
import OffersView from '@/views/OffersView.vue'
import DetailsView from '@/views/DetailsView.vue'
import TicketView from '@/views/TicketView.vue'
import { usePassengerStore } from '@/stores/passengers'
import { DateReferenceType, TripListError, useTripsStore, type SearchCriteriaLocation } from '@/stores/trips'
import BookingView from '@/views/BookingView.vue'
import { inject } from 'vue'
import { osdmClientKey } from '@/types/symbols'
import { BookingError, useBookingStore } from '@/stores/booking'
import { OfferListError, useOfferStore } from '@/stores/offers'
import { convertDateToOsdmDateTime, convertPlaceToRef } from '@/helpers/conversions'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'search',
      component: SearchView,
    },
    {
      path: '/trips',
      name: 'trips',
      component: TripsView,
    },
    {
      path: '/offers',
      name: 'offers',
      component: OffersView,
    },
    {
      path: '/details',
      name: 'details',
      component: DetailsView,
    },
    {
      path: '/booking',
      name: 'booking',
      component: BookingView,
    },
    {
      path: '/ticket',
      name: 'ticket',
      component: TicketView,
    },
  ],
})


const handleTripCollection = async (to: RouteLocationNormalizedGeneric) => {
  if (to.query.o && to.query.d && to.query.t&& to.query.v && to.query.tr) {
    const OSDM = inject(osdmClientKey)

    const origin = JSON.parse(decodeURIComponent(atob(to.query.o.toString())));
    const destination = JSON.parse(decodeURIComponent(atob(to.query.d.toString())));
    const vias = JSON.parse(decodeURIComponent(atob(to.query.v.toString())));
    const date = new Date(to.query.t.toString())
    const dateReferenceType = !!JSON.parse(to.query.tr.toString()) ? DateReferenceType.DEPARTURE : DateReferenceType.ARRIVAL

    const viasRef = vias.map((v: SearchCriteriaLocation) => ({viaPlace: convertPlaceToRef(v)}));
    const viasRequest = viasRef.length > 0 ? viasRef : undefined;
    const tripSearchCriteriaEmbeds: ['TRIPS'] = ['TRIPS'];

    const request = {
      origin: convertPlaceToRef(origin),
      destination: convertPlaceToRef(destination),
      vias: viasRequest,
      departureTime: dateReferenceType == DateReferenceType.DEPARTURE ? convertDateToOsdmDateTime(date) : undefined,
      arrivalTime: dateReferenceType == DateReferenceType.ARRIVAL ? convertDateToOsdmDateTime(date) : undefined,
      embed: tripSearchCriteriaEmbeds,
    }

    useTripsStore().setLoading(true)
    const response = await OSDM?.trip.searchTrips(request);

    if (response?.data?.trips) {
      useTripsStore().setTrips(response.data.trips)
      return
    } else if (response?.data) {
      useTripsStore().setError(
        new TripListError(
          'No results',
          'No trips could be found for your search request',
          'binoculars-large',
        ),
      )
      return
    }
    useTripsStore().setError(
      new TripListError(
        'An error occurred',
        'The Server returned an error',
        'sign-exclamation-point-medium',
      ),
    )
  } else {
    // ToDo: Error handling + routing
    // e.g. GoTo Search
  }
}

const handleOfferSearch = async (to: RouteLocationNormalizedGeneric) => {
  if (to.query.trip) {
    const OSDM = inject(osdmClientKey)
    const trip = JSON.parse(decodeURIComponent(atob(to.query.trip.toString())))
    const passengers = usePassengerStore().passengers

    const request = {
      anonymousPassengerSpecifications: passengers,
      tripSpecifications: [
        {
          externalRef: trip.externalRef,
          legs: trip.legs,
          isPartOfInternationalTrip: null,
        },
      ],
    };

    useOfferStore().setLoading(true)
    const response = await OSDM?.offer.searchOffers(request)
    if (response?.data?.offers) {
      useOfferStore().setOffers(response.data.offers)
      return
    } else if (response?.data) {
      useOfferStore().setError(
        new OfferListError(
          'No results',
          'No trips could be found for your search request',
          'binoculars-large',
        ),
      )
      return
    }
    useOfferStore().setError(
      new OfferListError(
        'An error occurred',
        'The Server returned an error',
        'sign-exclamation-point-medium',
      ),
    )
  } else {
    // ToDo: Error handling + routing
    // e.g. GoTo Search
  }
}

const handleBooking = async (to: RouteLocationNormalizedGeneric) => {
  if (to.query.offerId && to.query.ancilleryIds) {
    const OSDM = inject(osdmClientKey)
    const passengers = usePassengerStore().passengers
    const ancillaryIds = JSON.parse(to.query.ancilleryIds.toString());
    const bookingRequest = {
      offers: [
        {
          offerId: to.query.offerId.toString(),
          afterSaleByRetailerOnly: null,
          passengerRefs: passengers.map((p) => p.externalRef),
          optionalAncillarySelections: ancillaryIds.map((aID: string) => ({
            ancillaryId: aID,
            passengerRefs: passengers.map((p) => p.externalRef),
          })),
        },
      ],
      passengerSpecifications: passengers,
      purchaser: {
        detail: passengers[0].detail ?? {firstName: '', lastName: ''},
      }
    };

    useBookingStore().setLoading(true)

    const response = await OSDM?.booking.placeBooking(bookingRequest)

    if (response?.data?.booking) {
      useBookingStore().setBooking(response.data.booking)
      return
    } else if (response?.data) {
      useBookingStore().setError(
        new BookingError(
          'No results',
          'No booking could be created for the specified offer',
          'sign-exclamation-point-medium',
        ),
      )
      return
    }
    useBookingStore().setError(
      new BookingError(
        'An error occurred',
        'The Server returned an error',
        'sign-exclamation-point-medium',
      ),
    )
  } else {
    // ToDo: Error handling + routing
    // e.g. GoTo Search
  }
}

router.beforeResolve(async (to) => {
  // Load data from query paramters
  if (to.query.o && to.query.d && to.query.t && to.query.v && to.query.tr) {
    useTripsStore().setSearchCriteria({
      origin: JSON.parse(decodeURIComponent(atob(to.query.o.toString()))),
      destination: JSON.parse(decodeURIComponent(atob(to.query.d.toString()))),
      vias: JSON.parse(decodeURIComponent(atob(to.query.v.toString()))),
      date: new Date(to.query.t.toString()),
      dateReferenceType: !!JSON.parse(to.query.tr.toString()) ? DateReferenceType.DEPARTURE : DateReferenceType.ARRIVAL,
    })
  }
  if (to.query.trip) {
    const trip = JSON.parse(decodeURIComponent(atob(to.query.trip.toString())))
    useTripsStore().selectTrip(trip)
  }

  // Handle action before next step
  if (to.name == 'trips') {
    await handleTripCollection(to)
  } else if (to.name == 'offers') {
    await handleOfferSearch(to)
  } else if (to.name == 'booking') {
    await handleBooking(to)
  } else if (to.name == 'ticket') {
    if (to.query.bookingId) {
      const OSDM = inject(osdmClientKey)
      await OSDM?.booking.fulfillBooking(
        to.query.bookingId.toString()
      )
    } else {
      // ToDo: Error handling + routing
      // e.g. GoTo Search
    }
  }
})

export default router
