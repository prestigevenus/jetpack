package com.example.venusprestige

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.venusprestige.ui.theme.VenusprestigeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo() {
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current

        Text(
            text = "Welcome to Android",
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.Underline
        )


        Text(text = "Ayoooooo")
        Text(
            text = "Types of cars",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(30.dp),


            textAlign = TextAlign.Center,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Text(text = "1.Subaru")
        Text(text = "2.Mercedez Benz")
        Text(text = "3.Audi")
        Text(text = "4.G Wagon")
        Spacer(modifier = Modifier.height(20.dp))


        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),

                )
            {
                Text(text = "see more ")

            }
            Divider()
            Spacer(modifier = Modifier.height(5.dp))



            Text(
                text = "Courses offered at eMobilis",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )


            Spacer(modifier = Modifier.height(5.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.liv),
                    contentDescription = "liv",
                    modifier = Modifier.size
                        (200.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )

            }

            Button(
                onClick = {
                          mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
                },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp)
            )
            {
                Text(text = "continue")

            }






            Text(
                text = "Types of Applications",
                fontSize = 30.sp,
                color = Color.Blue,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                textDecoration = TextDecoration.Underline

            )
            Text(text = "Most of the applications you create in Android will fall into one of the following categories: Foreground Activity An application that's only useful when it's ...")
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Types of Applications",
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Red)
                    .height(30.dp),


                textAlign = TextAlign.Center,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
            Text(text = "1.Native Android applications")
            Text(text = "2.Hybrid Android applications")
            Text(text = "3.Web-based Android applications")
            Text(text = "4.Game Android applications")
            Text(text = "5.Augmented Reality and Virtual Reality Android applications")


        }
    }


}

    @Preview(showBackground = true)
    @Composable
    fun DemoPreview() {
        Demo()
    }
