package com.example.mypresentationcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import com.example.mypresentationcard.ui.theme.MyPresentationCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyPresentationCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PresentationCard()
                }
            }
        }
    }
}

@Composable
fun TopRow() {
    val image = painterResource(R.drawable.logouser3)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            modifier = Modifier.size(128.dp),
            contentDescription = "Android logo"
        )
        Text(
            text = stringResource(R.string.user_name),
            modifier = Modifier.padding(top = 5.dp, bottom = 1.dp),
            fontSize = 32.sp,
            color = Color(0xFFFFFFFF),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Software Developer",
            modifier = Modifier.padding(bottom = 8.dp),
            color = Color(0xFFFFFFFF),
            fontSize = 28.sp,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun MiddleRow() {
    Text(
        text = "Android Developer Extraordinaire",
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        fontSize = 18.sp,
        color = Color(0xFFFFFFFF),
        textAlign = TextAlign.Center
    )
}

@Composable
fun ContactDetails() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier.padding(bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = "Phone",
                tint = Color(0xFFFFFFFF),
                modifier = Modifier
                    .padding(end = 8.dp)
                    .size(34.dp)
            )
            Text(
                text = "+57 300 000 00 00",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color(0xFFFFFFFF),
            )
        }
        Row(
            modifier = Modifier.padding(bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Rounded.Share,
                contentDescription = "Share",
                tint = Color(0xFFFFFFFF),
                modifier = Modifier
                    .padding(end = 8.dp)
                    .size(34.dp)
            )
            Text(
                text = "web-page.com",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color(0xFFFFFFFF),
            )
        }
        Row(
            modifier = Modifier.padding(bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(Icons.Rounded.Email,
                contentDescription = "Email",
                tint = Color(0xFFFFFFFF),
                modifier = Modifier
                    .padding(end = 8.dp)
                    .size(34.dp)
            )
            Text(
                text = "john.due@mail.com",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color(0xFFFFFFFF),
            )
        }
    }
}

@Composable
fun PresentationCard(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.background)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            alpha = 0.8F
        )
        Column(
            modifier = Modifier
                .background(Color(0x9E3F5567))
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            TopRow()
            MiddleRow()
            ContactDetails()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PresentationCardPreview() {
    MyPresentationCardTheme {
        PresentationCard()
    }
}