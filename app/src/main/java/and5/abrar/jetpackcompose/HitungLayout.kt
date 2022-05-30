package and5.abrar.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import and5.abrar.jetpackcompose.ui.theme.JetpackComposeTheme
import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext

class HitungLayout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting5("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting5(name: String) {
    val mcontext = LocalContext.current
    var panjang by remember { mutableStateOf("") }
    var lebar by remember { mutableStateOf("") }
    var tinggi by remember { mutableStateOf("") }
    var hasil by remember { mutableStateOf("") }
    Column() {
        TextField(value = panjang , onValueChange ={panjang = it},label = {Text("panjang")} )
        TextField(value = lebar , onValueChange ={lebar = it},label = {Text("lebar")} )
        TextField(value = tinggi , onValueChange ={tinggi = it}, label = {Text("tinggi")})
        Button(onClick = {
            hasil = (panjang.toInt() * lebar.toInt() * tinggi.toInt()).toString()
        }) {
            Text(text = "Proses Tambah")
        }
        Text(text = "Hasil : $hasil")
        Button(onClick = {
            mcontext.startActivity(Intent(mcontext,PaymentLayout::class.java))
        }) {
            Text(text = "Pindah ke payment")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview5() {
    JetpackComposeTheme {
        Greeting5("Android")
    }
}