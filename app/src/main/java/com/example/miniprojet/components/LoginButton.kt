package com.example.miniprojet.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miniprojet.R

@Composable
fun LoginButton(
    text:String,
    modifier: Modifier = Modifier,
){
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red,
        ),
        onClick = {/*TODO*/}){
        Text(
            text = "Login" // qui renvoi au nom du bouton (Login)
        )
    }
}
// ici on fera le outlinedButton qui est un bouton sans contours
// pour le Forget password

@Composable
fun LoginOutlinedButton(
    text:String,
    modifier: Modifier = Modifier,
){
    Button(
        modifier = Modifier,
        colors = ButtonDefaults.buttonColors(
            // pour que le container de fond soit
            // transparent lorsqu'on click
            containerColor = Color.Transparent,
            // le contentColor doit être black ou encbore la couleur du texte
            contentColor = Color.Black,
        ),
        onClick = {/*TODO*/}){
        Text(
            text = text,
            fontWeight = FontWeight.SemiBold,
        )

    }
}
//  cette partie est dediée pour les réseaux sociaux
// qui seront disposé en forme de Row
@Composable
fun LoginThirdPartyRow(
    modifier: Modifier = Modifier,
){
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
    ){
        IconButton(onClick = {/*TODO*/}){
            Icon(imageVector = ImageVector.vectorResource(R.drawable.facebook_brands_solid),
                contentDescription = stringResource(R.string.desc_login_with_facebook),
                tint = Color.Unspecified
            )
        }

        IconButton(onClick = {/*TODO*/}){
            Icon(imageVector = ImageVector.vectorResource(R.drawable.google_brands_solid),
                contentDescription = stringResource(R.string.desc_login_with_google),
                tint = Color.Unspecified
            )
        }

        IconButton(onClick = {/*TODO*/}){
            Icon(imageVector = ImageVector.vectorResource(R.drawable.apple_brands_solid),
                contentDescription = stringResource(R.string.desc_login_with_apple),
                tint = Color.Unspecified
            )
        }
    }
}

// création du buttonBack pour naviguer vers la page précédente

@Composable
fun LoginButtonBack(){
    IconButton(
        modifier = Modifier
            .clip(CircleShape)
            .size(40.dp),
        colors = IconButtonDefaults.iconButtonColors(
            containerColor = Color(0xFFDE7E82),
            contentColor = Color.White,
        ),
        onClick = {/*TODO*/}){
        Icon(imageVector = Icons.Filled.ArrowBackIosNew,
            contentDescription = stringResource(R.string.desc_button_back)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LoginButtonBackPreview(){
    LoginButtonBack()
}

@Preview(showBackground = true)
@Composable
fun LoginThirdPartyRowPreview(){
    LoginThirdPartyRow(
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun LoginOutlinedButtonPreview(){
    LoginOutlinedButton("Forget Password?")
}

@Preview(showBackground = true)
@Composable
fun LoginButtonPreview(){
    LoginButton("Login")
}