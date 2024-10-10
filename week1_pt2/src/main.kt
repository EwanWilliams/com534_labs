fun main() {
    /* week 1 stuff?
    for (i in 1..3) {
        print("ID: ")
        val id = readlnOrNull().toString()
        print("Name: ")
        val name = readlnOrNull().toString()
        print("Course: ")
        val course = readlnOrNull().toString()
        print("Mark: ")
        val mark = readlnOrNull()?.toDouble()
        val new_student = Student(id, name, course, mark)
        println(new_student)
    }
    */
    /* week 2 shit
    var test_undergrad = Undergraduate("001", "Ewan Williams", "Software Engineering")
    println(test_undergrad)
    print("Enter student mark: ")
    test_undergrad.mark = readln().toDouble()
    println(test_undergrad.getGrade())
    println(test_undergrad.didPass())
    var test_masters = Masters("002", "Dan Scott", "Audio Engineering")
    println(test_masters)
    print("Enter student mark: ")
    test_masters.mark = readln().toDouble()
    println(test_masters.getGrade())
    println(test_masters.didPass())
    */

    //week 3 shit pt1
    var students = mutableListOf<Student>()
    for (i in 1..3) {
        val id = i.toString()
        print("Name: ")
        val name = readlnOrNull().toString()
        print("Course: ")
        val course = readlnOrNull().toString()
        students.add(Undergraduate(id, name, course))
    }

    for (student in students) {
        println(student)
    }
}