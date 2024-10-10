class University {
    private var students = mutableListOf<Student>()

    fun enrolStudent(newStudent: Student) {
        students.add(newStudent)
    }

    fun findStudentById(queryId: String) : Student? {
        for (student in students) {
            if (student.id == queryId) {
                return student
            }
        }
        return null
    }

    fun findStudentsByName(queryName: String) : MutableList<Student> {
        val studentsWithName = mutableListOf<Student>()
        for (student in students) {
            if (student.name == queryName) {
                studentsWithName.add(student)
            }
        }
        return studentsWithName
    }

}