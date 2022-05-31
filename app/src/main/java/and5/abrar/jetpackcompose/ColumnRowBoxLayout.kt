package and5.abrar.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import and5.abrar.jetpackcompose.ui.theme.JetpackComposeTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ColumnRowBoxLayout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting7("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting7(name: String) {
    Column(modifier = Modifier.padding(15.dp)) {
        Row(modifier = Modifier
            .border(width = 2.dp, color = Color.Red)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Text(text = "text row 1")
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button Row 1")
            }
        }
        Spacer(modifier = Modifier.padding(15.dp))
        Column(modifier = Modifier
            .border(width = 2.dp, color = Color.Green)
            .fillMaxWidth()
            .fillMaxHeight(0.3f),
        horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Text Column 1", fontSize = 25.sp, fontWeight = FontWeight.Bold)
            Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Cyan)) {
                Text(text = "Button column 1")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button column 2")
            }
        }
        Spacer(modifier = Modifier.padding(15.dp))
        Box(modifier = Modifier.background(Color.Red)
            .fillMaxWidth()
            .fillMaxHeight(0.2f)){
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button box 1")
            }
            Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Green),
            modifier = Modifier.padding(start = 100.dp)) {
                Text(text = "Button box 2")
            }
        }

    }
}

@Preview(showBackground = true,showSystemUi = true)
@Composable
fun DefaultPreview7() {
    JetpackComposeTheme {
        Greeting7("Android")
    }
}