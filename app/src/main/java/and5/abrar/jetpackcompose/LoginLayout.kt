package and5.abrar.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import and5.abrar.jetpackcompose.ui.theme.JetpackComposeTheme
import android.content.Intent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

class LoginLayout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting4("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting4(name: String) {
    val mcontext = LocalContext.current
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(modifier = Modifier
        .padding(15.dp)
        .border(width = 2.dp, color = Color.Red)
        .height(200.dp)
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        TextField(value = username , onValueChange ={username = it},label = {Text("username")} )
        TextField(value = password , onValueChange ={password = it},label = {Text("password")} )
        Button(onClick = {
        if (username == "abrar" && password == "abrar"){
            mcontext.startActivity(Intent(mcontext,HitungLayout::class.java))
        }
        },
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 2.dp, Color.Red),
            colors = ButtonDefaults.buttonColors(Color.Gray)
        ) {
            Text(text = "Login")
        }
        Text(text = "Username : $username")
        Text(text = "Password : $password")

    }
}

@Preview(showBackground = true,showSystemUi = true)
@Composable
fun DefaultPreview4() {
    JetpackComposeTheme {
        Greeting4("Android")
    }
}