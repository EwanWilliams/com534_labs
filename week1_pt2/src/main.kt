fun main() {
    for (i in 1..3) {
        print("ID: ")
        val id = readlnOrNull().toString()
        print("Name: ")
        val name = readlnOrNull().toString()
        print("Course: ")
        val course = readlnOrNull().toString()
        print("Mark: ")
        val mark = readLine()?.toDouble() ?: 0.0
        val new_student = Student(id, name, course, mark)
        println(new_student)
    }
}