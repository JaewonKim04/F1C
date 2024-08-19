package com.kong.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.kong.navigate.NavScreens
import com.kong.ui.home.component.LastResultView
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state by viewModel.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.start()
    }

    viewModel.collectSideEffect {
        when(it) {
            is HomeSideEffect.StartRaceResult -> {
                navController.navigate(NavScreens.RACE_RESULT.name)
            }
        }
    }

    Scaffold { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
        ) {
            LastResultView(
                lastRaceResultSummary = state.lastRaceResultSummary,
                onClick = viewModel::onClickLastRaceResult
            )
        }
    }
}