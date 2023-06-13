package com.soutaka.hitandbyte

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.soutaka.hitandbyte.presentation.game.GameScreen
import com.soutaka.hitandbyte.presentation.home.HomeScreen
import com.soutaka.hitandbyte.presentation.record.RecordScreen

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController)
        }
        composable("game") {
            GameScreen()
        }

        composable("record") {
            RecordScreen()
        }
    }
}
