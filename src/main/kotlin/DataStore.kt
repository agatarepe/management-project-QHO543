class DataStore(
    val students: MutableList<Student> = mutableListOf(),
    val administrators: MutableList<Administrator> = mutableListOf(),
    val events: MutableList<CommunityEvent> = mutableListOf(),
    val reservations: MutableList<Reservation> = mutableListOf()
) {
    init {
        // Add predefined students
        students.add(Student("S001", "Aisha Khan", "Computing", "aisha.khan@student.ac.uk", "aisha", "Student123"))

        students.add(Student("S002", "Daniel Green", "Business Management", "daniel.green@student.ac.uk", "daniel", "Student123"))

        students.add(Student("S003", "Maya Patel", "Cyber Security", "maya.patel@student.ac.uk", "maya", "Student123"))

        students.add(Student("S004", "Omar Hassan", "Software Engineering", "omar.hassan@student.ac.uk", "omar", "Student123"))

        students.add(Student("S005", "Emily Carter", "Psychology", "emily.carter@student.ac.uk", "emily", "Student123"))

        students.add(Student("S006", "Lucas Martin", "Digital Marketing", "lucas.martin@student.ac.uk", "lucas", "Student123"))

        // Add predefined administrator

        administrators.add(Administrator("admin", "Admin123", "Administrator"))

        // Add predefined community events

        // Add predefined reservations
    }
}