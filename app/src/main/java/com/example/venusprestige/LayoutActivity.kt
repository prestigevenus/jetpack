package com.example.venusprestige

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.venusprestige.ui.theme.VenusprestigeTheme
import androidx.compose.ui.unit.sp as sp

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout() {
    Column(modifier = Modifier.fillMaxSize()) {

        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(

            title = { Text(text = "HomeScreen", color = Color.Green) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Magenta),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrow",
                        tint = Color.Green
                    )


                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.Green
                    )


                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                        tint = Color.Green
                    )


                }
            }
        )

        //End of topappbar

        Text(
            text = "Destination",
            fontSize = 30.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Cursive
        )

        //First Row
        Row {
            Image(
                painter = painterResource(id = R.drawable.paris),
                contentDescription = "Paris",
                modifier = Modifier.size(width = 200.dp, height = 150.dp)
            )

            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(text = "PARIS", fontWeight = FontWeight.Bold)
                Text(text = "PARIS is the capital and most populous city of France. With an official estimated population of 2,102,650 residents")

            }
        }
        Spacer(modifier = Modifier.height(10.dp))

        //End of Row

        Row {
            Image(
                painter = painterResource(id = R.drawable.india),
                contentDescription = "Paris",
                modifier = Modifier.size(width = 200.dp, height = 150.dp)
            )

            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(text = "SYDNEY", fontWeight = FontWeight.Bold)
                Text(text = "SYDNEY is the capital city of the state of New South Wales and the most populous city in Australia. ... Greater Sydney consists of 658 suburbs.")

            }
        }
        Spacer(modifier = Modifier.height(10.dp))

        //End of Row

        Row {
            Image(
                painter = painterResource(id = R.drawable.china),
                contentDescription = "Paris",
                modifier = Modifier.size(width = 200.dp, height = 150.dp)
            )

            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(text = "   MAURITIUS", fontWeight = FontWeight.Bold)
                Text(text = "MAURITIUS is consistently ranked as the most peaceful. A Mauritius is known for its biodiverse flora and fauna and its endemism.")

            }
        }

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {
                    mContext.startActivity(Intent(mContext,IntenetActivity::class.java))
                },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),

                )
            {
                Text(text = "countinue ")

            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}