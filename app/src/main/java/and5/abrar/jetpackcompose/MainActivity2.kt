package and5.abrar.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import and5.abrar.jetpackcompose.ui.theme.JetpackComposeTheme
import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting10("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting10(name: String) {
    val mContext = LocalContext.current
    Column(modifier = Modifier.padding(15.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {
            mContext.startActivity(Intent(mContext,ColumnRowBoxLayout::class.java))
        }) {
            Text(text = "row column box")
        }
        Button(onClick = {
            mContext.startActivity(Intent(mContext,CardViewLayout::class.java))
        }) {
            Text(text = "cardview layout")
        }
        Button(onClick = {
            mContext.startActivity(Intent(mContext,ScrollViewLayout::class.java))
        }) {
            Text(text = "Scrikkview")
        }
        Button(onClick = {
            mContext.startActivity(Intent(mContext,RecyclerViewLayout::class.java))
        }) {
            Text(text = "recylerview")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview10() {
    JetpackComposeTheme {
        Greeting10("Android")
    }
}