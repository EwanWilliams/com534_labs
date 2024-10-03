fun main (args: Array<String>) {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    val flathead = Cat("Flathead", 7, 10)
    val cupra = Cat("Cupra", 2, 9)

    for (i in 1..3) {
        if (binnie.eat(4)) {
            println(binnie)
        }
        else {
            println("Error, too heavy.")
        }
    }

    for (i in 1..3) {
        if (cupra.walk(2)) {
            println(cupra)
        }
        else {
            println("Error, too hungry.")
        }
    }

}