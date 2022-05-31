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
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

class ScrollViewLayout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting8("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting8(name: String) {
    Column(modifier = Modifier
        .padding(15.dp)
        .verticalScroll(rememberScrollState())) {
        Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription ="ini gambar" )
        Text(stringResource(R.string.desc), modifier = Modifier.padding(top=20.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview8() {
    JetpackComposeTheme {
        Greeting8("Android")
    }
}