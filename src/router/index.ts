import { createRouter, createWebHistory } from 'vue-router'
import SearchView from '@/views/SearchView.vue'
import TripsView from '@/views/TripsView.vue'
import OffersView from '@/views/OffersView.vue'
import DetailsView from '@/views/DetailsView.vue'
import TicketView from '@/views/TicketView.vue'

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
      path: '/ticket',
      name: 'ticket',
      component: TicketView,
    },
  ],
})

export default router
