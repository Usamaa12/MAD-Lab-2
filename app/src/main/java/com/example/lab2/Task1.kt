package com.example.lab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    Greeting()
                }
            }
        }



@Composable
fun Greeting( modifier: Modifier = Modifier
) {
    Column(modifier= Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)

    {
        val buttonColor = remember { mutableStateOf(Color.Red) }


        Button(onClick = { buttonColor.value = Color.Green},
            modifier=Modifier
                .padding(16.dp),
            colors=ButtonDefaults.buttonColors(containerColor = buttonColor.value)
        ) {

            Text(text = "Click me Usama")

        }
    }


}
@Preview(showBackground = true , showSystemUi = true)
@Composable
fun GreetingPreview() {
        Greeting()
}