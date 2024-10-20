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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        // le titre Login en en-tête
        Text(
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            text = "Login",
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Login to continue the app",
            fontSize = 12.sp,
        )
        Spacer(modifier = Modifier.height(30.dp))
        LoginTextField(
            modifier = Modifier.fillMaxWidth(),
            label = "Email ID",
            placeholder = "Enter Your Email Id"
        )

        Spacer(modifier = Modifier.height(25.dp))

        // LoginTextField
        LoginTextField(
            modifier = Modifier.fillMaxWidth(),
            label = "Password",
            placeholder = "Enter Your Password",
            isPassword = true
        )

        //LoginOutlinedButton
        LoginOutlinedButton(
            modifier = Modifier.align(End),
            text = "Forget Password?",
        )
        Spacer(modifier = Modifier.height(25.dp))

        // LoginButton
        LoginButton(
            modifier = Modifier.fillMaxWidth(),
            text = "Login"
        )
        Spacer(modifier = Modifier.height(30.dp))
        // LoginDivider
        LoginDivider(
            modifier = Modifier.fillMaxWidth(),
            informationText = "Or Login with"
        )
        Spacer(modifier = Modifier.height(30.dp))

        // loginThirdPartyRow
        LoginThirdPartyRow(
            modifier = Modifier.fillMaxWidth(),
        )

        Spacer(modifier = Modifier.height(30.dp))

        // LoginClikableText
        LoginClickableText(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = buildCreateAccountAnnotatedString(),
        )

    }

}

@Composable
fun buildCreateAccountAnnotatedString()  = buildAnnotatedString {
    append("Don't have an account ? ")

    withStyle(style = SpanStyle(color = Color.Blue)){
        append("Create")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiniProjetTheme {
       LoginPage()
    }
}