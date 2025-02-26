package com.kong.feature.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
                    NavScreens.SESSION_RESULT.route.replace(
                        oldValue = "{season}",
                        newValue = it.season.toString()
                    ).replace(
                        oldValue = "{round}",
                        newValue = it.round.toString()
                    )
                )
            }

            is HomeSideEffect.StartCalendar -> {
                navController.navigate(NavScreens.CALENDAR.route)
            }
        }
    }

    HomeView(viewModel)
}