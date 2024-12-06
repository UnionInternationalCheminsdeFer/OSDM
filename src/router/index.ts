import { createRouter, createWebHistory } from 'vue-router'
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

router.beforeResolve(async (to) => {
  const OSDM = inject(osdmClientKey)
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
    const trip = JSON.parse(atob(to.query.trip.toString()))
    useTripsStore().selectTrip(trip)
  }

  if (to.name == 'trips') {
    if (to.query.o && to.query.d && to.query.t&& to.query.v && to.query.tr) {

      const toStopRef = (scl: SearchCriteriaLocation) => (
        {
          objectType: scl.objectType,
          stopPlaceRef: scl.id,
          name: scl.name,
        }
      );

      const origin = JSON.parse(decodeURIComponent(atob(to.query.o.toString())));
      const destination = JSON.parse(decodeURIComponent(atob(to.query.d.toString())));
      const vias = JSON.parse(decodeURIComponent(atob(to.query.v.toString())));
      const date = new Date(to.query.t.toString())
      const dateReferenceType = !!JSON.parse(to.query.tr.toString()) ? DateReferenceType.DEPARTURE : DateReferenceType.ARRIVAL

      const viasRef = vias.map((v) => ({viaPlace: toStopRef(v)}));
      const viasRequest = viasRef.length > 0 ? viasRef : undefined;

      const request = {
        origin: toStopRef(origin),
        destination: toStopRef(destination),
        vias: viasRequest,
        departureTime: dateReferenceType == DateReferenceType.DEPARTURE ? date.toISOString().split('Z')[0] : undefined,
        arrivalTime: dateReferenceType == DateReferenceType.ARRIVAL ? date.toISOString().split('Z')[0] : undefined,
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
      // GoTo Search
    }
  } else if (to.name == 'offers') {
    if (to.query.trip) {
      const trip = JSON.parse(atob(to.query.trip.toString()))
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
      // GoTo Search
    }
  } else if (to.name == 'booking') {
    if (to.query.offerId && to.query.ancilleryIds) {
      const passengers = usePassengerStore().passengers
      const ancillaryIds = JSON.parse(to.query.ancilleryIds.toString());
      const bookingRequest = {
        offers: [
          {
            offerId: to.query.offerId.toString(),
            afterSaleByRetailerOnly: null,
            passengerRefs: passengers.map((p) => p.externalRef),
            optionalAncillarySelections: ancillaryIds.map((aID) => ({
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
      // GoTo Search
    }
  } else if (to.name == 'ticket') {
    if (to.query.bookingId) {
      await OSDM?.booking.fulfillBooking(
        to.query.bookingId.toString()
      )
    } else {
      // GoTo Search
    }
  }
})

export default router
