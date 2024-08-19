package com.kong.ui.home

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
    LaunchedEffect(Unit) {
        viewModel.start()
    }

    viewModel.collectSideEffect {
        when (it) {
            is HomeSideEffect.StartRaceResult -> {
                navController.navigate(NavScreens.RACE_RESULT.name)
            }
        }
    }

    HomeView(viewModel)
}