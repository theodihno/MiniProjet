package com.example.miniprojet

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miniprojet.ui.theme.MiniProjetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiniProjetTheme {
                LoginPage()
            }
        }
    }
}

@Composable
fun LoginPage(){
    Column {
        LoginTextField(
            modifier = Modifier.fillMaxWidth(),
            label = "Email ID",
            placeholder = "Enter Your Email Id"
        )

        Spacer(modifier = Modifier.height(16.dp))

        LoginTextField(
            modifier = Modifier.fillMaxWidth(),
            label = "Password",
            placeholder = "Enter Your Password",
            isPassword = true
        )
        Spacer(modifier = Modifier.height(20.dp))
        LoginButton(
            modifier = Modifier.fillMaxWidth(),
            text = "Login"
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiniProjetTheme {
       LoginPage()
    }
}