fun main() {
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
}