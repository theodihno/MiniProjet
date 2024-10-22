package com.example.miniprojet.components

import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginClickableText(
    text: AnnotatedString,
    modifier: Modifier = Modifier,
){
    ClickableText(
        modifier = Modifier,
        text = text,
        onClick = {})
}

@Preview(showBackground = true)
@Composable
fun LoginClickableTextPreview(){
    val annotatedString = buildAnnotatedString {
        append("Don't have an account ? ")

        withStyle(style = SpanStyle(color = Color.Blue)){
            append("Create")
        }
    }
    LoginClickableText(
        text = annotatedString,
    )
}
