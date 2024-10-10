class Masters (id: String, name: String, course: String) : Student(id, name, course) {

    override fun getGrade(): String {
        val grade = when (mark) {
            in 70.0..100.0 -> "Distinction"
            in 60.0..70.0 -> "Merit"
            in 40.0..60.0 -> "Pass"
            in 0.0..40.0 -> "Fail"
            else -> "ERROR grade not in range"
        }
        return grade
    }

}