package com.example.miniprojet.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miniprojet.NavItem
import com.example.miniprojet.slide.HomePage
import com.example.miniprojet.slide.NotificationPage
import com.example.miniprojet.slide.ProfilPage
import com.example.miniprojet.slide.SettingsPage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldBar(){
    val navItemList = listOf(
        NavItem("Home", Icons.Filled.Home),
        NavItem("Notification", Icons.Filled.Notifications),
        NavItem("Settings", Icons.Filled.Settings),
        NavItem("Profil", Icons.Default.Person)
    )
    var expanded by remember { mutableStateOf(false) }
    var selectedIndex by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Top app bar")
                }
            )
        },
        bottomBar = {
            NavigationBar {
                navItemList.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick = {selectedIndex = index},
                        icon = {
                            Icon(imageVector = navItem.icon, contentDescription = "Icon")
                        },
                        label = {
                            Text(
                                text = navItem.label
                            )
                        }
                    )
                }
            }
            /*BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary,
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "Bottom app bar",
                )
            }*/
        },

        // floatinActionButton pour add
        /*floatingActionButton = {
            FloatingActionButton(onClick = {expanded}){
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }*/
    ){ innerPadding ->
        ContentScreen(
            modifier = Modifier.padding(innerPadding),
            selectedIndex
        )
        /*Column(
            modifier = Modifier.padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text = "mmmmmmmmmmmmmmmmm".trimIndent(),
            )
        }*/
    }
}
// cree la fun contentScreen
@Composable
fun ContentScreen(
    modifier: Modifier = Modifier, selectIndex : Int
){
    when(selectIndex){
        0-> HomePage()
        1-> NotificationPage()
        2-> SettingsPage()
        3-> ProfilPage()
    }
}



@Preview(showBackground = true)
@Composable
fun ScaffoldBarPreview(){
    ScaffoldBar()
}