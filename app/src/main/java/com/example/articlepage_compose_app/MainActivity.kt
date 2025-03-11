package com.example.articlepage_compose_app

import android.graphics.drawable.Drawable
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
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
                    TaskManager(
                        image = painterResource(R.drawable.ic_task_completed),
                        firstText = stringResource(R.string.all_tasks_completed),
                        secondText = stringResource(R.string.nice_work)
                    )
                }
            }
        }
    }
}


@Composable
fun TaskManager(image: Painter,firstText: String,secondText: String){
    Column(
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = firstText,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(0.dp, 24.dp, 0.dp, 8.dp)
                .align(alignment = Alignment.CenterHorizontally)

        )
        Text(
            text = secondText,
            fontSize = 16.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticlePage_Compose_AppTheme {
        TaskManager(
            image = painterResource(R.drawable.ic_task_completed),
            firstText = stringResource(R.string.all_tasks_completed),
            secondText = stringResource(R.string.nice_work)
        )
    }
}