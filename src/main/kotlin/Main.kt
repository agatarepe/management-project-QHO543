fun main() {
    val dataStore = DataStore()

    println("Students: ${dataStore.students.size}")
    println("Administrators: ${dataStore.administrators.size}")
    println("Events: ${dataStore.events.size}")
    println("Reservations: ${dataStore.reservations.size}")
}