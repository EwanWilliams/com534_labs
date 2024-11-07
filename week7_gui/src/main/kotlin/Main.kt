import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.rememberTrayState

@Composable
fun App() {
    // HelloWorld()
    // TwoTexts()
    //TwoTextsStyled()
    Column {
        Row {
            GreetingBox()
            Counter()
        }
        FeetToMeters()
    }

}

@Composable
fun HelloWorld() {
    Text("Hello World fron the Custom Composable!")
}

@Composable
fun TwoTexts() {
    Column {
        Text("Hello World!")
        Text("Welcome to Compose Multiplatform Development")
    }
}

@Composable
fun TwoTextsStyled() {
    Column {
        Text("Hello World!", color = Color.Red, fontStyle=FontStyle.Italic, fontFamily=FontFamily.Serif)
        Text("Welcome to Compose Multiplatform Development", fontWeight=FontWeight.Bold)
    }
}

@Composable
fun GreetingBox() {
    val nameState = remember { mutableStateOf("") }
    Column {
        TextField(value = nameState.value, onValueChange= {
            nameState.value = it
        })
        Text("Hello ${nameState.value}!")
    }
}

@Composable
fun Counter() {
    val countState = remember { mutableStateOf(0) }
    Button(
        onClick = { countState.value += 1 }
    ) { Text(countState.value.toString()) }
}

@Composable
fun FeetToMeters() {
    val feetState = remember { mutableStateOf("") }
    var feetNum : Double?
    var conversion = 0.0
    val outputString = remember { mutableStateOf("") }
    Column {
        TextField(value = feetState.value,
            onValueChange = { feetState.value = it },
            label = { Text("Enter measurement in feet:") }
        )
        Button(
            onClick = {
                feetNum = feetState.value.toDoubleOrNull() // ?: 0.0
                if (feetNum == null) {
                    outputString.value = "Please enter a valid input."
                }
                else {
                    conversion = feetNum!! * 0.305
                    outputString.value = "$feetNum ft is equal to $conversion metres."
                }
            }
        ) { Text("Convert") }
        Text(outputString.value)
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
