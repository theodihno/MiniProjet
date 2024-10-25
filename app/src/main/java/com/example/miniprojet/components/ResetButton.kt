package com.example.miniprojet.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ResetButton(
    text: String,
    modifier: Modifier = Modifier,
){
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        colors = ButtonDefaults. buttonColors(
            containerColor = Color.Red,
        ),
        onClick = {/*TODO*/}){
        Text(
            text = "Done",
        )
    }

}

@Preview(showBackground = true)
@Composable
fun ResetButtonPreview(){
    ResetButton(
        text = "Done",
    )
}