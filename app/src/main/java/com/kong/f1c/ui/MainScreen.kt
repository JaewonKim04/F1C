package com.kong.f1c.ui

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.kong.navigate.NavScreens
import com.kong.ui.calendar.CalendarScreen
import com.kong.ui.home.HomeScreen
import com.kong.ui.result.SessionResultScreen

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavScreens.HOME.route,
        enterTransition = { fadeIn(tween(200)) },
        exitTransition = { fadeOut(tween(200)) }
    ) {
        composable(route = NavScreens.HOME.route) {
            HomeScreen(navController)
        }

        composable(
            route = NavScreens.SESSION_RESULT.route,
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Start,
                    animationSpec = tween(200)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.End,
                    animationSpec = tween(200)
                )
            },
            arguments = listOf(
                navArgument("season") { type = NavType.IntType },
                navArgument("round") {type = NavType.IntType}
            )
        ) { backStackEntry ->
            SessionResultScreen(
                season = backStackEntry.arguments?.getInt("season") ?: 0,
                round = backStackEntry.arguments?.getInt("round") ?: 0,
                navController = navController
            )
        }

        composable(
            route = NavScreens.CALENDAR.route,
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Start,
                    animationSpec = tween(200)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.End,
                    animationSpec = tween(200)
                )
            },
        ) { _ ->
            CalendarScreen(
                navController = navController
            )
        }
    }
}