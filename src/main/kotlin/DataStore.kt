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
        events.add(CommunityEvent("E001", "Python Coding Workshop", "Academic", "Helen Moore", "14 Oct 2026", "14:00", "Computing Lab B12", 6, "Upcoming"))

        events.add(CommunityEvent("E002", "Five-a-Side Football", "Sports", "Alex Turner", "16 Oct 2026", "17:00", "Sports Hall", 4, "Upcoming"))

        events.add(CommunityEvent("E003", "Careers in Technology", "Careers", "Rachel Adams", "20 Oct 2026", "13:00", "Lecture Hall 2", 6, "Upcoming"))

        events.add(CommunityEvent("E004", "Student Wellbeing Workshop", "Wellbeing", "Sarah Lewis", "05 Oct 2026", "11:00", "Room C05", 5, "Completed"))

        events.add(CommunityEvent("E005", "Community Volunteering Day", "Volunteering", "James Wilson", "02 Oct 2026", "09:00", "Community Hub", 6, "Completed"))

        events.add(CommunityEvent("E006", "International Students Social", "Social", "Maria Costa", "18 Oct 2026", "18:00", "Student Union", 5, "Cancelled"))

        // Add predefined reservations
        reservations.add(Reservation("R001", "S001", "E001", "Active"))
        reservations.add(Reservation("R002", "S002", "E001", "Active"))
        reservations.add(Reservation("R003", "S003", "E001", "User Cancelled"))
        reservations.add(Reservation("R004", "S001", "E002", "Active"))
        reservations.add(Reservation("R005", "S002", "E002", "Active"))
        reservations.add(Reservation("R006", "S004", "E002", "Active"))
        reservations.add(Reservation("R007", "S005", "E002", "Active"))
        reservations.add(Reservation("R008", "S006", "E003", "Active"))
        reservations.add(Reservation("R009", "S001", "E004", "Completed"))
        reservations.add(Reservation("R010", "S003", "E004", "Completed"))
        reservations.add(Reservation("R011", "S004", "E005", "Completed"))
        reservations.add(Reservation("R012", "S005", "E005", "User Cancelled"))
        reservations.add(Reservation("R013", "S002", "E006", "Event Cancelled"))
        reservations.add(Reservation("R014", "S006", "E006", "Event Cancelled"))
    }
}