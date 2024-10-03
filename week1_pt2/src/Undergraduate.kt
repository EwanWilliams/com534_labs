class Undergraduate (id: String, name: String, course: String) : Student(id, name, course) {

    override fun getGrade(): String {
        val grade = when (mark) {
            in 70.0..100.0 -> "First"
            in 60.0..70.0 -> "2/1"
            in 50.0..60.0 -> "2/2"
            in 40.0..50.0 -> "Third"
            in 0.0..40.0 -> "Fail"
            else -> "ERROR grade not in range"
        }
        return grade
    }
}