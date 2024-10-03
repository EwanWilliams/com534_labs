abstract class Student(protected val id: String, protected val name: String, protected val course: String) {

    var mark = 0.0
        set(newMark) {
            if (newMark in 0.0..100.0) {
                field = newMark
            }
        }

    abstract fun getGrade() : String

    fun didPass() : Boolean {
        if (mark >= 40.0) {
            return true
        }
        return false
    }

    override fun toString(): String {
        return "ID: $id | Name: $name | Course: $course | Mark: $mark"
    }
}