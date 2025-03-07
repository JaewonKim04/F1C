package com.kong.feature.home

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.kong.navigate.NavScreens
import org.orbitmvi.orbit.compose.collectSideEffect

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    viewModel.collectSideEffect {
        when (it) {
            is HomeSideEffect.StartSessionResult -> {
                navController.navigate(
                    NavScreens.SessionResult(
                        season = it.season,
                        round = it.round
                    )
                )
            }

            is HomeSideEffect.StartCalendar -> {
                navController.navigate(NavScreens.Calendar)
            }
        }
    }

    HomeView(viewModel)
}