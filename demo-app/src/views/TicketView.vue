<template>
  <main class="h-full">
    <HeaderBar />
    <TicketPreview />
  </main>
</template>

<script lang="ts">
import HeaderBar from '@/components/molecules/HeaderBar.vue'
import TicketPreview from '@/components/molecules/TicketPreview.vue'
import { useBookingStore } from '@/stores/booking';
import { osdmClientKey } from '@/types/symbols';
import { inject } from 'vue';

export default {
  components: {
    HeaderBar,
    TicketPreview,
  },
  setup() {
    const OSDM = inject(osdmClientKey)
    return { OSDM }
  },
  mounted() {
    if (this.$route.query.bookingId) {
      this.OSDM?.booking.getBooking(this.$route.query.bookingId.toString()).then((result) => {
        if (result.data && result.data.booking) {
          useBookingStore().setBooking(result.data.booking)
          this.checkAndFetchFulfillments()
        }
      })
    } else {
      this.$router.push({ name: 'details', query: this.$route.query })
    }
  },
  methods: {
    checkAndFetchFulfillments() {
      const booking = useBookingStore().booking;
      if (booking?.fulfillments?.some((f) => f.status == 'ON_HOLD')) {
        this.OSDM?.booking.getBooking(booking.id).then((result) => {
          if (result.data && result.data.booking) {
            useBookingStore().setBooking(result.data.booking)
            this.checkAndFetchFulfillments()
          }
        })
      }
    }
  }
}
</script>
