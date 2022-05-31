package and5.abrar.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import and5.abrar.jetpackcompose.ui.theme.JetpackComposeTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

class RecyclerViewLayout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val repo = StudentRepository()
                    val alldata = repo.getAllData()
                    LazyColumn(){
                        items(items = alldata){
                            Greeting11(student = it)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting11(student: Student) {
    Column(modifier = Modifier.padding(15.dp)) {
        Card(
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = student.name,
                    color = Color.DarkGray,
                    fontWeight = FontWeight.Normal
                )
                Text(
                    text = student.age,
                    color = Color.DarkGray,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(start = 20.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview11() {
    JetpackComposeTheme {
        Greeting11(student = Student(0,"ana","20"))
    }
}