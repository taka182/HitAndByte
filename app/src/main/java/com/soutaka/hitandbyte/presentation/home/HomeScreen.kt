package com.soutaka.hitandbyte.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column() {
        Button(onClick = { navController.navigate("game") }) {
            Text(text = "Play Game")
        }
        Button(onClick = { navController.navigate("record") }) {
            Text(text = "対戦記録")
        }
    }
}
