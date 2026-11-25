class ReservationService(val dataStore: DataStore) {

    fun countActiveReservations(eventId: String): Int {
        return dataStore.reservations.count {
            it.eventId == eventId && it.status == "Active"
        }
    }

    fun remainingCapacity(eventId: String): Int {
        val event = dataStore.events.find {
            it.eventId == eventId
        } ?: return 0

        return event.maxCapacity - countActiveReservations(eventId)
    }
}