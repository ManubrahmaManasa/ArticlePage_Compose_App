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
import androidx.compose.ui.res.stringResource
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
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(){
        Column(Modifier.fillMaxWidth()) {
            Row(Modifier.weight(1f)) {
                QuadrantItem(
                    heading = stringResource(R.string.text_composable),
                    description = stringResource(R.string.description_1),
                    backgroundColor = Color(0xFFEADDFF),
                    modifier = Modifier.weight(1f))
                QuadrantItem(
                    heading = stringResource(R.string.image_composable),
                    description = stringResource(R.string.description_2),
                    backgroundColor = Color(0xFFD0BCFF),
                    modifier = Modifier.weight(1f))
            }
            Row(modifier = Modifier.weight(1f)) {
                QuadrantItem(
                    heading = stringResource(R.string.row_composable),
                    description = stringResource(R.string.description_3),
                    backgroundColor = Color(0xFFB69DF8),
                    modifier = Modifier.weight(1f))
                QuadrantItem(
                    heading = stringResource(R.string.column_composable),
                    description = stringResource(R.string.description_4),
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
        ComposeQuadrant()
    }
}