package com.kong.f1c.navhost

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.kong.feature.calendar.CalendarScreen
import com.kong.feature.home.HomeScreen
import com.kong.feature.result.SessionResultScreen
import com.kong.navigate.NavScreens

@Composable
fun F1cNavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavScreens.Home,
    ) {
        f1cComposable<NavScreens.Home>(
            screenAnimStyle = ScreenAnimStyle.FADE
        ) {
            HomeScreen(navController)
        }

        f1cComposable<NavScreens.SessionResult> {
            val args = it.toRoute<NavScreens.SessionResult>()
            SessionResultScreen(
                args = args,
                navController = navController
            )
        }

        f1cComposable<NavScreens.Calendar> {
            CalendarScreen(navController = navController)
        }
    }
}