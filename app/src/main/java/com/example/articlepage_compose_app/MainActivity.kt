package com.example.articlepage_compose_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
                    Greeting(
                        name = stringResource(R.string.jetpack_compose_tutorial),
                        firstDescription = stringResource(R.string.first_description),
                        secondDescription = stringResource(R.string.second_description)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String,firstDescription: String,secondDescription: String) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(
        verticalArrangement = Arrangement.spacedBy(18.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            alpha = 0.5f
        )
        Text(
            text = name,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = firstDescription,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = secondDescription,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticlePage_Compose_AppTheme {
        Greeting(
            name = stringResource(R.string.jetpack_compose_tutorial),
            firstDescription = stringResource(R.string.first_description),
            secondDescription = stringResource(R.string.second_description)
        )
    }
}