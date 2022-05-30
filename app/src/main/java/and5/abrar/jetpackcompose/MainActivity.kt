 package and5.abrar.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import and5.abrar.jetpackcompose.ui.theme.JetpackComposeTheme
import android.content.Intent
import android.widget.EditText
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

 class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                    Column() {
                        ButtonCustom(title = "button empat", color = Color.Red)
                        ButtonCustom(title = "button lima", color = Color.Green)
                        ButtonCustom(title = "button enam", color = Color.Blue)

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    Column(modifier = Modifier
        .padding(15.dp)
        .border(width = 2.dp, color = Color.Red)
        .height(200.dp)
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Hello $name!",
            color = Color.Black,
            modifier = Modifier.fillMaxWidth())

        Text(text = "teks kedua",
            modifier = Modifier.fillMaxWidth(),
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.padding(15.dp))
        Button(onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 2.dp, Color.Red),
            colors = ButtonDefaults.buttonColors(Color.Gray)
            ) {
            Text(text = "SImpan")
        }
        Row() {
            val mcontext = LocalContext.current
            Button(onClick = {
                mcontext.startActivity(Intent(mcontext,SplashScreen::class.java))
            }) {
                Text(text = "Button2")
                
            }
            Button(onClick = {
                mcontext.startActivity(Intent(mcontext,InputLayout::class.java))
            }) {
                Text(text = "Button3")
            }
            Column() {
                Text(text = "text1")
                Text(text = "text2")
            }
        }
        var text by remember { mutableStateOf("")}
        TextField(value = "EditText", onValueChange = {text = it})

        var text2 by remember { mutableStateOf("")}
        TextField(value = "EditText", onValueChange = {text2 = it})


    }
}
 
 @Composable
 fun ButtonCustom(title:String,color: Color){
 Button(
     onClick = { },
         modifier = Modifier.padding(10.dp),
        colors = ButtonDefaults.buttonColors(color)) {
     Text(text = title)
 }
 }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
        Greeting("Android")
    }
}