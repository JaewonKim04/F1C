package com.kong.f1c.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kong.navigate.NavScreens
import com.kong.ui.home.HomeScreen
import com.kong.ui.result.RaceResultScreen

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavScreens.HOME.name
    ) {
        composable(route = NavScreens.HOME.name) {
            HomeScreen(navController)
        }

        composable(route = NavScreens.RACE_RESULT.name) {
            RaceResultScreen(navController)
        }
    }
}