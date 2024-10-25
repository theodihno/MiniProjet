package com.example.miniprojet.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miniprojet.R

@Composable
fun ResetPage(){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 20.dp),
    ){
        LoginButtonBack()
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Reset",
            fontSize = 36.sp,
            fontWeight = FontWeight.SemiBold,
        )

        Text(
            text = "Password",
            fontSize = 36.sp,
            fontWeight = FontWeight.SemiBold,
        )
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            painter = painterResource(R.drawable.register_image),
            contentDescription = stringResource(R.string.desc_logo_register),
            contentScale = ContentScale.Fit,
            alignment = Alignment. Center,
        )
        Spacer(modifier = Modifier.height(30.dp))

        ResetTextField(
            modifier = Modifier.fillMaxWidth(),
            label = "New Password",
            placeholder = "Enter New Password",
            isPassword = true,
        )
        Spacer(modifier = Modifier.height(12.dp))

        ResetTextField(
            modifier = Modifier.fillMaxWidth(),
            label = "Confirm Password",
            placeholder = "Confirm New Password",
            isPassword = true,
        )
        Spacer(modifier = Modifier.height(30.dp))

        ResetButton(
            modifier = Modifier.fillMaxWidth(),
            text = "Done",
        )

    }
}



@Preview(showBackground = true)
@Composable
fun ResetPagePreview(){
    ResetPage()
}