package com.kong.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.kong.ui.home.component.LastResultView
import org.orbitmvi.orbit.compose.collectAsState

@Composable
fun HomeScreen(viewModel: HomeViewModel = hiltViewModel()) {
    val state by viewModel.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.start()
    }

    Scaffold { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
        ) {
            LastResultView(
                lastRaceResultSummary = state.lastRaceResultSummary
            )
        }
    }
}