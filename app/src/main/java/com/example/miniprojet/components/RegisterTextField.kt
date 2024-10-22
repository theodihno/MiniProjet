package com.example.miniprojet.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miniprojet.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterTextField(
    label:String, // on ajoute la possibilité de pouvoir modifier le label
    placeholder: String,
    modifier: Modifier = Modifier,
    isPassword: Boolean = false,
){
    var textFieldValue by remember { mutableStateOf("") }
    var isHided by remember { mutableStateOf(true) }
    //var passwordVisible by remember { mutableStateOf("false") }

    Column(
        modifier = Modifier,
    ) {
        Text(
            text = label,
            fontWeight = FontWeight.SemiBold,
        )
        Spacer(modifier.height(16.dp))


        TextField(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(30.dp),
            value = textFieldValue,
            onValueChange = {
                textFieldValue = it
            },
            placeholder = {
                Text(
                    text = placeholder
                )
            },
            trailingIcon = {
                // on utilise cette condition que si le textField est un password
                if (isPassword) {
                    IconButton(onClick = {
                        isHided = !isHided
                    }) {
                        Icon(
                            imageVector = if (isHided) Icons.Filled.VisibilityOff else Icons.Filled.Visibility,
                            contentDescription = if (isHided) {
                                //affiche le password
                                stringResource(id = R.string.desc_password_icon)
                            } else {
                                // cache le password
                                stringResource(id = R.string.desc_password_hide)
                            }
                        )
                    }
                }
            },
            // pour que le password puisse etre masqué et rendu visible après avoir mis le password
            // on doit ajouter le isHided dans la condition
            visualTransformation = if (isPassword && isHided) PasswordVisualTransformation() else VisualTransformation.None,
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFFEEEEEE),
                //placeholderColor = Color(0xFFD2D2D2),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
            )
        )
    }

}

@Preview(showBackground = true)
@Composable
fun RegisterTextFieldPreview(){
    RegisterTextField(
        isPassword = true,
        label = "Email ID",
        placeholder = "insérer le password"
        //isPassword = true
    )
}