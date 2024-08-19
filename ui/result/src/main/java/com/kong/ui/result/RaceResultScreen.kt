package com.kong.ui.result

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.kong.ui.core.component.TopBar
import com.kong.ui.result.components.SessionView
import org.orbitmvi.orbit.compose.collectAsState

@Composable
fun RaceResultScreen(
    navController: NavController,
    viewModel: RaceResultViewModel = hiltViewModel()
) {
    val state by viewModel.collectAsState()
    Scaffold(
        topBar = {
            TopBar(
                onClickBack = {
                    navController.popBackStack()
                }
            )
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            SessionView(session = state.session)
        }
    }
}