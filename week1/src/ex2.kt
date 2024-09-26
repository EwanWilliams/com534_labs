fun main() {
    print("Please enter your name: ")
    val name = readLine()

    print("How many times should it be printed? ")
    val num: Int = readLine()?.toInt() ?: 1

    for (i in 1..num) {
        println(name)
    }
}