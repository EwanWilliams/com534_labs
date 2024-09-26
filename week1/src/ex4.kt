fun main() {
    print("Enter percentage: ")
    val percentage  = readLine()?.toInt() ?:-1

    val grade = when (percentage) {
        in 0..29 -> "F"
        in 30..39 -> "E"
        in 40..49 -> "D"
        in 50..59 -> "C"
        in 60..69 -> "B"
        in 70..100 -> "A"
        else -> "Error - invalid percentage"
    }
    println(grade)
}