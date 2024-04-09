package com.example.venusprestige

import android.content.Intent
import android.graphics.drawable.Icon
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.VectorConverter
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.venusprestige.ui.theme.VenusprestigeTheme

class ExploreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Explore(){
    Column (modifier = Modifier.fillMaxSize()){
        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(

            title = { Text(text = "Cities", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                        tint = Color.Black
                    )


                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "share",
                        tint = Color.Black
                    )


                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.ThumbUp,
                        contentDescription = "THUMB",
                        tint = Color.Black
                    )


                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                        tint = Color.Black
                    )


                }
            }
        )

        //End of topappbar

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Text(text = "Tickets",
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 20.dp)
                )

            Spacer(modifier = Modifier.height(10.dp))

            //Row1

            Row (
                modifier = Modifier.padding(start = 25.dp)
            ){
                //Column1
                Column {
                    Card (
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.paris),
                                contentDescription = "paris" ,
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)
                            Icon(
                                imageVector =Icons.Default.FavoriteBorder ,
                                contentDescription = "favourite",
                                tint = Color.Red,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )




                        }

                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Colosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "From Ksh.30000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {

                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "Call")
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720245837".toUri()
                            mContext.startActivity(callIntent)
                        }
                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "email")
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")

                        }

                    }



                }


                //End of column

                Spacer(modifier = Modifier.width(10.dp))

                //Column1
                Column {
                    Card (
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.paris),
                                contentDescription = "paris" ,
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)
                            Icon(
                                imageVector =Icons.Default.FavoriteBorder ,
                                contentDescription = "favourite",
                                tint = Color.Red,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )




                        }

                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Colosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "From Ksh.30000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {

                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "Call")
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720245837".toUri()
                            mContext.startActivity(callIntent)
                        }
                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "email")
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")

                        }

                    }



                }


                //End of column1

            }

            //End of row1

            Spacer(modifier = Modifier.height(20.dp))

            //Row2

            Row (
                modifier = Modifier.padding(start = 25.dp)
            ){
                //Column1
                Column {
                    Card (
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.paris),
                                contentDescription = "paris" ,
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)
                            Icon(
                                imageVector =Icons.Default.FavoriteBorder ,
                                contentDescription = "favourite",
                                tint = Color.Red,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )




                        }

                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Colosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "From Ksh.30000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {

                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "Call")
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720245837".toUri()
                            mContext.startActivity(callIntent)
                        }
                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "email")
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")

                        }

                    }



                }


                //End of column

                Spacer(modifier = Modifier.width(10.dp))

                //Column2
                Column {
                    Card (
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.paris),
                                contentDescription = "paris" ,
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)
                            Icon(
                                imageVector =Icons.Default.FavoriteBorder ,
                                contentDescription = "favourite",
                                tint = Color.Red,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )




                        }

                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Colosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "From Ksh.30000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {

                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "Call")
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720245837".toUri()
                            mContext.startActivity(callIntent)
                        }
                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "email")
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")

                        }

                    }



                }


                //End of column2

            }

            //End of row2

            Spacer(modifier = Modifier.height(20.dp))

            //Row1

            Row (
                modifier = Modifier.padding(start = 25.dp)
            ){
                //Column1
                Column {
                    Card (
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.paris),
                                contentDescription = "paris" ,
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)
                            Icon(
                                imageVector =Icons.Default.FavoriteBorder ,
                                contentDescription = "favourite",
                                tint = Color.Red,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )




                        }

                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Colosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "From Ksh.30000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {

                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "Call")
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720245837".toUri()
                            mContext.startActivity(callIntent)
                        }
                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "email")
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")

                        }

                    }



                }


                //End of column

                Spacer(modifier = Modifier.width(10.dp))

                //Column1
                Column {
                    Card (
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.paris),
                                contentDescription = "paris" ,
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)
                            Icon(
                                imageVector =Icons.Default.FavoriteBorder ,
                                contentDescription = "favourite",
                                tint = Color.Red,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )




                        }

                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Colosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "From Ksh.30000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {

                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "Call")
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720245837".toUri()
                            mContext.startActivity(callIntent)
                        }
                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "email")
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")

                        }

                    }



                }


                //End of column1

            }

            //End of row1

            Spacer(modifier = Modifier.height(20.dp))
        }


    }
}


@Preview(showBackground = true)
@Composable
fun ExplorePreview(){
    Explore()

}