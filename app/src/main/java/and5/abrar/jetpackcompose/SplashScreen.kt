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
import android.os.Handler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import org.intellij.lang.annotations.JdkConstants

class SplashScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting2("Android")
                }
            }
        }
        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
        },3000)
    }
}

@Composable
fun Greeting2(name: String) {
    Column(modifier = Modifier
        .fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally ) {
        Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "icon" )
        Text(text = "Hello $name!",
        color = Color.Gray,
        modifier = Modifier.fillMaxWidth())

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview2() {
    JetpackComposeTheme {
        Greeting2("Android")
    }
}