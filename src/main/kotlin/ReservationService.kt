class ReservationService(val dataStore: DataStore) {

    fun countActiveReservations(eventId: String): Int {
        return dataStore.reservations.count {
            it.eventId == eventId && it.status == "Active"
        }
    }
}