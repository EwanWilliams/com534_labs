fun main() {
    val artists = arrayOf("Movements", "Hot Mulligan", "Counterparts", "Tiny Moving Parts")
    var guess: String? = ""

    while (guess !in artists) {
        print("Guess one of my favourite artists: ")
        guess = readLine()
    }

    println("You got it!")
}