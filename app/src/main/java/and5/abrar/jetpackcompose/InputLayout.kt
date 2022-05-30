package and5.abrar.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import and5.abrar.jetpackcompose.ui.theme.JetpackComposeTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.*

class InputLayout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting3("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String) {
    var angka1 by remember { mutableStateOf("")}
    var angka2 by remember { mutableStateOf("")}
    var hasil by remember { mutableStateOf("")}
    Column() {
        TextField(value = angka1 , onValueChange ={angka1 = it} )
        TextField(value = angka2 , onValueChange ={angka2 = it} )
        Button(onClick = { 
            hasil = (angka1.toInt() + angka2.toInt()).toString()
        }) {
            Text(text = "Proses Tambah")
        }    
        Text(text = hasil)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    JetpackComposeTheme {
        Greeting3("Android")
    }
}