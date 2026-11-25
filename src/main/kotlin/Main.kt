fun main() {
    val dataStore = DataStore()

    println("Students: ${dataStore.students.size}")
    println("Administrators: ${dataStore.administrators.size}")
    println("Events: ${dataStore.events.size}")
    println("Reservations: ${dataStore.reservations.size}")

    val reservationService = ReservationService(dataStore)

    println("Active reservations:")
    println("E001: ${reservationService.countActiveReservations("E001")}")
    println("E002: ${reservationService.countActiveReservations("E002")}")
    println("E003: ${reservationService.countActiveReservations("E003")}")

    println("Remaining capacity:")
    println("E001: ${reservationService.remainingCapacity("E001")}")
    println("E002: ${reservationService.remainingCapacity("E002")}")
    println("E003: ${reservationService.remainingCapacity("E003")}")
}