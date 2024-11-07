fun main() {
    var exampleList = mutableListOf<String>()
    for (i in 1..5) {
        println("Please enter a string: ")
        exampleList.add(readln())
    }

    var notBlank = listOf<String>()
    notBlank = exampleList.filter {it != ""}

    notBlank.forEach { println(it)}
}