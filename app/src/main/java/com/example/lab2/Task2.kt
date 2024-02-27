package com.example.lab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Task2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                       Task_2()
                }
            }
        }
    }
@Composable
fun Task_2(modifier: Modifier = Modifier
) {
    Column(modifier=Modifier.fillMaxSize()) {
        val inputText= remember {
            mutableStateOf("")
        }
        val inputText1= remember {
            mutableStateOf("")
        }
        Row(modifier=Modifier
            .padding(10.dp)
        ) {

            Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription ="" )
            Column(modifier= Modifier
                .offset(10.dp)
                .width(250.dp)

            ) {
                TextField(value = inputText.value, shape = RoundedCornerShape(16.dp), onValueChange ={
                    inputText.value=it
                } )
                TextField(value = inputText1.value, shape = RoundedCornerShape(16.dp), onValueChange ={
                    inputText1.value=it
                } )
            }
        }
    }
}
@Preview(showBackground = true , showSystemUi = true)
@Composable
fun Task2Preview() {

    Task_2()
}
