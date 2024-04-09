package com.example.venusprestige

import android.content.Intent
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.venusprestige.ui.theme.VenusprestigeTheme

class FormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyForm()


        }
    }
}

@Composable
fun MyForm(){

    val mContext = LocalContext.current

    Column(modifier = Modifier
        .fillMaxSize()
        .clickable { mContext.startActivity(Intent(mContext,IntenetActivity::class.java)) }
        .paint(
        painterResource(id = R.drawable.paris),
        contentScale = ContentScale.FillBounds)
    ){
        var  firstname by remember {
            mutableStateOf("")
        }

        var  lastname by remember {
            mutableStateOf("")
        }

        var  email by remember {
            mutableStateOf("")
        }

        var  password by remember {
            mutableStateOf("")
        }

        var  contact by remember {
            mutableStateOf("")
        }




        Box (modifier = Modifier.fillMaxWidth(),
             contentAlignment = Alignment.Center
            ) {
            Image(
                painter = painterResource(id = R.drawable.services),
                contentDescription = "register",
                modifier = Modifier.size(180.dp),
            )
        }
        Text(
            text = "create an account",
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth(),
            fontFamily = FontFamily.Cursive,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold

            )

            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = firstname,
                onValueChange = {firstname =it},
                placeholder = { Text(text = "Firstname")},
                leadingIcon = { Icon(imageVector = Icons.Default.Person,
                    contentDescription ="Person" )},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = lastname,
                onValueChange = {lastname =it},
                placeholder = { Text(text = "Lastname")},
                leadingIcon = { Icon(imageVector = Icons.Default.Person,
                    contentDescription ="Person" )},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = email   ,
                onValueChange = {email =it},
                placeholder = { Text(text = "Email Address")},
                leadingIcon = { Icon(imageVector = Icons.Default.Person,
                    contentDescription ="Person" )},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )

            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = password  ,
                onValueChange = {password =it},
                placeholder = { Text(text = "Password")},
                leadingIcon = { Icon(imageVector = Icons.Default.Person,
                    contentDescription ="Person" )},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )

            Spacer(modifier = Modifier.height(10.dp))


            TextField(
                value = password  ,
                onValueChange = {password =it},
                placeholder = { Text(text = "Password")},
                leadingIcon = { Icon(imageVector = Icons.Default.Person,
                    contentDescription ="Person" )},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()
            )

            Spacer(modifier = Modifier.height(10.dp))
           


            OutlinedTextField(
                value = contact,
                onValueChange = {contact =it},
                placeholder = { Text(text = "Phone Number")},
                leadingIcon = { Icon(imageVector = Icons.Default.Call,
                    contentDescription ="Person" )},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
            )

            Spacer(modifier = Modifier.height(10.dp))




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






    }
    }



@Preview(showBackground = true)
@Composable
fun MyFormPreview(){
    MyForm()
}