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

class PaymentLayout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting6("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting6(name: String) {
    var total by remember { mutableStateOf("") }
    var bayar by remember { mutableStateOf("") }
    var hasil by remember { mutableStateOf("") }
    Column() {
        TextField(value = total , onValueChange ={total = it}, label = {Text("total")})
        TextField(value = bayar , onValueChange ={bayar = it}, label = {Text("bayar")})
        Button(onClick = {
            hasil = (total.toInt() - bayar.toInt()).toString()
        }) {
            Text(text = "Proses Tambah")
        }
        Text(text = "sisa : $hasil")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview6() {
    JetpackComposeTheme {
        Greeting6("Android")
    }
}