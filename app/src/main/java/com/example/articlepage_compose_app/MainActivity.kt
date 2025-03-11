package com.example.articlepage_compose_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articlepage_compose_app.ui.theme.ArticlePage_Compose_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArticlePage_Compose_AppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    /*Greeting(
                        name = "Android"
                    )*/
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            alpha = 0.5f
        )
        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
        )
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.\n" +
                    "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun ComposeQuadrant(){
        Column(Modifier.fillMaxWidth()) {
            Row(Modifier.weight(1f)) {
                QuadrantItem(
                    heading = "Text composable",
                    description = "Displays text and follows the recommended Material Design guidelines.",
                    backgroundColor = Color(0xFFEADDFF),
                    modifier = Modifier.weight(1f))
                QuadrantItem(
                    heading = "Image composable",
                    description = "Creates a composable that lays out and draws a given Painter class object.",
                    backgroundColor = Color(0xFFD0BCFF),
                    modifier = Modifier.weight(1f))
            }
            Row(modifier = Modifier.weight(1f)) {
                QuadrantItem(
                    heading = "Row composable",
                    description = "A layout composable that places its children in a horizontal sequence.",
                    backgroundColor = Color(0xFFB69DF8),
                    modifier = Modifier.weight(1f))
                QuadrantItem(
                    heading = "Column composable",
                    description = "A layout composable that places its children in a vertical sequence.",
                    backgroundColor = Color(0xFFF6EDFF),
                    modifier = Modifier.weight(1f))
            }
        }
}

@Composable
fun QuadrantItem(heading: String,description: String, backgroundColor: Color, modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(backgroundColor)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = heading,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)//parameters can be used for parents not for children
            )
            Text(
                text = description,
                textAlign = TextAlign.Justify
            )
        }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticlePage_Compose_AppTheme {
        /*Greeting("Android")*/
        ComposeQuadrant()
        //QuadrantItem(heading = "Column composable", description = "A layout composable that places its children in a vertical sequence.", backgroundColor = Color(0xFFF6EDFF))
    }
}