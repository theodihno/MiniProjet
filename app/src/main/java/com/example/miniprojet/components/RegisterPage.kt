package com.example.miniprojet.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RegisterPage(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 20.dp),
        //horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Arrangement.Top
    ){
        // titre de l'en-tête de la page
        Text(
            text = "Create",
            fontSize = 36.sp,
            fontWeight = FontWeight.SemiBold
        )

        Text(
            text = "Account",
            fontSize = 36.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(20.dp))

        /*Image(
            painter = painterResource(R.drawable.register_image),
            contentDescription = stringResource(R.string.desc_logo_register),
            contentScale = ContentScale.Fit,
        )*/
        // le sous-titre suivant le titre
        Text(
            text = "Enter your personnal informations",
            fontSize = 12.sp,
        )

        Spacer(modifier = Modifier.height(30.dp))
        RegisterTextField(
            modifier = Modifier.fillMaxWidth(),
            label = "Username",
            placeholder = "Inser Your UserName",
        )

        Spacer(modifier = Modifier.height(30.dp))
        RegisterTextField(
            modifier = Modifier.fillMaxWidth(),
            label = "Email ID",
            placeholder = "Insert Your Email",
        )

        Spacer(modifier = Modifier.height(30.dp))
        RegisterTextField(
            modifier = Modifier.fillMaxWidth(),
            label = "Password",
            placeholder = "Insert Your Password",
            isPassword = true,
        )
        Spacer(modifier = Modifier.height(30.dp))
        RegisterTextField(
            modifier = Modifier.fillMaxWidth(),
            label = "Confirm Password",
            placeholder = "Confirm Your Password",
            isPassword = true,
        )
        Spacer(modifier = Modifier.height(40.dp))

        RegisterButton(
            modifier = Modifier.fillMaxWidth(),
            text = "Register",
        )

    }
}



@Preview(showBackground = true)
@Composable
fun RegisterPagePreview(){
    RegisterPage()
}