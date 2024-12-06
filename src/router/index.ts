import { createRouter, createWebHistory } from 'vue-router'
import SearchView from '@/views/SearchView.vue'
import TripsView from '@/views/TripsView.vue'
import OffersView from '@/views/OffersView.vue'
import DetailsView from '@/views/DetailsView.vue'
import TicketView from '@/views/TicketView.vue'
import { usePassengerStore } from '@/stores/passengers'
import { DateReferenceType, useTripsStore } from '@/stores/trips'
import BookingView from '@/views/BookingView.vue'
import { inject } from 'vue'
import { osdmClientKey } from '@/types/symbols'

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
      await OSDM?.trip.searchTrips({
        origin: JSON.parse(decodeURIComponent(atob(to.query.o.toString()))),
        destination: JSON.parse(decodeURIComponent(atob(to.query.d.toString()))),
        vias: JSON.parse(decodeURIComponent(atob(to.query.v.toString()))),
        date: new Date(to.query.t.toString()),
        dateReferenceType: !!JSON.parse(to.query.tr.toString()) ? DateReferenceType.DEPARTURE : DateReferenceType.ARRIVAL,
      })
    } else {
      // GoTo Search
    }
  } else if (to.name == 'offers') {
    if (to.query.trip) {
      const trip = JSON.parse(atob(to.query.trip.toString()))
      const passengers = usePassengerStore().passengers
      await OSDM?.offer.searchOffers(trip, passengers)
    } else {
      // GoTo Search
    }
  } else if (to.name == 'booking') {
    if (to.query.offerId && to.query.ancilleryIds) {
      const passengers = usePassengerStore().passengers
      await OSDM?.booking.placeBooking(
        to.query.offerId.toString(),
        JSON.parse(to.query.ancilleryIds.toString()),
        passengers,
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
