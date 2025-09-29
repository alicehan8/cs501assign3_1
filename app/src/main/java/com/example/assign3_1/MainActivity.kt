package com.example.assign3_1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assign3_1.ui.theme.Assign3_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Assign3_1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    RowColSplitLayout(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun RowColSplitLayout(modifier: Modifier = Modifier){
    Row(modifier = modifier.height(400.dp).fillMaxSize()){
        Box(modifier = Modifier.weight(1f, true).fillMaxHeight().background(Color.Red)){
            Text("25% Width")
        }
        Column(modifier = Modifier.weight(3f, true).fillMaxHeight()){
            Box(modifier = Modifier.weight(2f, true).fillMaxWidth().background(Color.Blue)){
                Text("20% height, 75% width")
            }
            Box(modifier = Modifier.weight(3f, true).fillMaxWidth().background(Color.Green)){
                Text("30% height, 75% width")
            }
            Box(modifier = Modifier.weight(5f, true).fillMaxWidth().background(Color.Black)){
                Text("50% height, 75% width", color=Color.White)
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assign3_1Theme {
        Greeting("Android")
    }
}