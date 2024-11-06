package com.example.miniprojet.slide

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun HomePage(
    modifier: Modifier = Modifier,
){
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color(0xFF1976D2)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Home Page",
            fontSize = 40.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black
        )
    }

}


@Preview(showBackground = true)
@Composable
fun HomePagePreview(){
    HomePage()
}