import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import kotlinx.coroutines.newSingleThreadContext

@Composable
@Preview
fun App() {
    val uni = University()
    val displayStudents = remember { mutableStateOf(listOf<Student>()) }

    MaterialTheme {
        Column {
            AddStudent(onStudentAdded = {
                uni.addStudent(it)
                displayStudents.value = uni.studentList.toList()
            })
            SearchByCourse(onCourseSearch = { course ->
                val studentsOnCourse = uni.studentList.filter { student -> student.course == course }
                displayStudents.value = studentsOnCourse
            })
            StudentList(displayStudents.value)
        }
    }
}

@Composable
fun AddStudent(onStudentAdded: (Student) -> Unit) {
    val newID = remember { mutableStateOf<String>("") }
    val newName = remember { mutableStateOf<String>("") }
    val newCourse = remember { mutableStateOf<String>("") }

    Column {
        TextField(newID.value,
            onValueChange = { newID.value = it },
            singleLine = true,
            label = { Text("Enter student ID:") }
        )
        TextField(newName.value,
            onValueChange = { newName.value = it },
            singleLine = true,
            label = { Text("Enter student name:") }
        )
        TextField(newCourse.value,
            onValueChange = { newCourse.value = it },
            singleLine = true,
            label = { Text("Enter student course:") }
        )
        Button(onClick = {
            onStudentAdded(Student(newID.value, newName.value, newCourse.value))
            newID.value = ""
            newName.value = ""
            newCourse.value = ""
        }) { Text("Add student") }
    }
}

@Composable
fun StudentList(students: List<Student>) {
    Column {
        students.forEach {
            Text(it.toString())
        }
    }
}

@Composable
fun SearchByCourse(onCourseSearch: (String) -> Unit) {
    val searchQuery = remember { mutableStateOf<String>("") }

    Column {
        TextField(searchQuery.value,
            onValueChange = { searchQuery.value = it },
            singleLine = true,
            label = { Text("Enter course:") }
        )
        Button(onClick = {
            onCourseSearch(searchQuery.value)
            searchQuery.value = ""
        } ) { Text("Search") }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
