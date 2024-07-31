package com.kongkong.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.kongkong.ui.home.component.LastResultView
import org.orbitmvi.orbit.compose.collectAsState

@Composable
fun HomeScreen(viewModel: HomeViewModel = hiltViewModel()) {
    val state by viewModel.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.start()
    }

    Column {
        LastResultView(
            lastRaceResultSummary = state.lastRaceResultSummary
        )
    }
}