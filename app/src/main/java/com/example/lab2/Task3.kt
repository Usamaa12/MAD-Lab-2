package com.example.lab2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab2.ui.theme.Lab2Theme

class Task3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2(R.drawable.i, "Iron Man", "Age: 43")
                    Greeting2(R.drawable.h, "Hulk ", "Age: 38")
                    Greeting2(R.drawable.d, "Dead pool", "Age: 25")
                    Greeting2(R.drawable.w, "Wolverine", "Age: 48")
                    Greeting2(R.drawable.wi, "Black widow", "Age: 30")
                    Greeting2(R.drawable.t, "Thor", "Age: 35")
                }
            }
        }
    }
}

@Composable
fun Greeting2( imgId: Int, name: String, age:String) {
    Row(Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = imgId),
            contentDescription = "",
            Modifier.size(40.dp)
        )
        Column (){
            Text(text = name, fontWeight = FontWeight.Bold)
            Text(text = age, fontWeight = FontWeight.Light, fontSize = 12.sp)
        }
        
    }
}
    @Preview(showBackground = true, showSystemUi = true, )
    @Composable
    fun GreetingPreview2() {
        Column {
            Greeting2(R.drawable.i, "Iron Man", "Age: 43")
            Greeting2(R.drawable.h, "Hulk ", "Age: 38")
            Greeting2(R.drawable.d, "Dead pool", "Age: 25")
            Greeting2(R.drawable.w, "Wolverine", "Age: 48")
            Greeting2(R.drawable.wi, "Black widow", "Age: 30")
            Greeting2(R.drawable.t, "Thor", "Age: 35")
        }

    }
