package com.example.firstappnick

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstappnick.ui.theme.FirstAppNickTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Loginpage()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Loginpage(){
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    val context= LocalContext.current



    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    )
    {
        Image(
            painter = painterResource(id = R.drawable.familyguy),
            contentDescription ="Funny",
            modifier = Modifier.size(200.dp)
        )
        OutlinedTextField(
            value =email ,
            onValueChange = {
                email=it
            },
            placeholder = { Text(text = "Email")},
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        )
        OutlinedTextField(
            value =password ,
            onValueChange = {
                email=it
            },
            placeholder = { Text(text = "Password")},
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            context.startActivity(Intent(context,MainActivity::class.java))

        },
            modifier = Modifier .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = CircleShape
            ) {
            Text(text = "Log in")
        }

    }


}

@Preview(showBackground = true)
@Composable
fun Login(){
    Loginpage()

}