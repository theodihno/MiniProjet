package com.example.miniprojet.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginDivider(
    // pour nous donner la possibilité de changer la valeur
    // du texte qui se trouve dans le divider
    // on va déclarer

    informationText: String = "",
    modifier: Modifier = Modifier,
){
    val showInformationText by remember { derivedStateOf { informationText.isNotEmpty() } }
    Row (
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically,
    ){ // le Row qui permet d'aligner les élément côte à côte
        Divider(
            // pour chaque divider prenne chacun son
            // espace on va effectuer des changements à partir du modifier
            modifier = Modifier
                .weight(1f),
            color = Color(0xFFD2D2D2),
        )
        if (showInformationText) {
            Text(
                modifier = Modifier,
                textAlign = TextAlign.Center,
                text = informationText,
            )
        }
        Divider(
            modifier = Modifier
                .weight(1f),
            color = Color(0xFFD2D2D2),
        )
    }

}

@Preview(showBackground = true)
@Composable
fun LoginDividerPreview(){
    LoginDivider(
        modifier = Modifier.fillMaxWidth(),
        //informationText = "or Login with",
    )
}