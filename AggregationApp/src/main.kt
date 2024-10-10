fun main() {
    val solent = University()

    while (true) {
        println()
        println("1. Add a undergradute student")
        println("2. Add a masters student")
        println("3. Search for student by ID")
        println("4. Search for student by name")
        println("5. Quit")
        print("select an option: ")
        val menuInput = readln()

        when (menuInput) {
            "1" -> { // add a student
                print("Enter ID: ")
                val id = readln()
                print("Enter name: ")
                val name = readln()
                print("Enter course: ")
                val course = readln()
                solent.enrolStudent(Undergraduate(id, name, course))
            }
            "2" -> {
                print("Enter ID: ")
                val id = readln()
                print("Enter name: ")
                val name = readln()
                print("Enter course: ")
                val course = readln()
                solent.enrolStudent(Masters(id, name, course))
            }
            "3" -> { // search by id
                print("Enter ID: ")
                val queryId = readln()
                val studentFound = solent.findStudentById(queryId)
                if (studentFound != null) {
                    println(studentFound)
                } else {
                    println("No student found with ID '$queryId'")
                }
            }
            "4" -> { // search by name
                print("Enter name: ")
                val queryName = readln()
                val studentsFound = solent.findStudentsByName(queryName)
                if (studentsFound.size > 0) {
                    for (student in studentsFound) {
                        println(student)
                    }
                } else {
                    println("No students found called '$queryName'")
                }
            }
            "5" -> break
        }
    }
}