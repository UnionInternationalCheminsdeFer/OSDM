import { createRouter, createWebHistory } from 'vue-router'
import SearchView from '@/views/SearchView.vue'
import TripsView from '@/views/TripsView.vue'
import OffersView from '@/views/OffersView.vue'
import DetailsView from '@/views/DetailsView.vue'
import TicketView from '@/views/TicketView.vue'
import { searchTrips } from '@/api/trips'
import { searchOffers } from '@/api/offers'
import { usePassengerStore } from '@/stores/passengers'
import { useTripsStore } from '@/stores/trips'
import BookingView from '@/views/BookingView.vue'
import { placeBooking } from '@/api/booking'

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
  if (to.name == 'trips') {
    if (to.query.o && to.query.d && to.query.t) {
      await searchTrips({
        origin: JSON.parse(atob(to.query.o.toString())),
        destination: JSON.parse(atob(to.query.d.toString())),
        date: new Date(to.query.t.toString()),
      })
    } else {
      // GoTo Search
    }
  } else if (to.name == 'offers') {
    if (to.query.trip) {
      const trip = JSON.parse(atob(to.query.trip.toString()))
      useTripsStore().selectTrip(trip)
      const passengers = usePassengerStore().passengers
      await searchOffers(trip, passengers)
    } else {
      // GoTo Search
    }
  } else if (to.name == 'ticket') {
    if (to.query.offerId && to.query.ancilleryIds) {
      const passengers = usePassengerStore().passengers
      await placeBooking(
        to.query.offerId.toString(),
        JSON.parse(to.query.ancilleryIds.toString()),
        passengers,
      )
    } else {
      // GoTo Search
    }
  }
})

export default router
