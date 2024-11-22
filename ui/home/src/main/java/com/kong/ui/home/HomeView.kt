package com.kong.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kong.common.fake.FakeSession
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.theme.backgroundGray
import com.kong.ui.home.component.LastResultView
import com.kong.ui.home.component.NextRaceView
import com.kong.ui.home.component.loading.HomeLoadingView
import org.orbitmvi.orbit.compose.collectAsState

@Composable
fun HomeView(viewModel: HomeViewModel) {
    val state by viewModel.collectAsState()

    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(backgroundGray)
                .padding(paddingValues)
                .padding(horizontal = 16.dp)
        ) {
            Spacer(dp = 30.dp)
            if (state.isLoading) {
                HomeLoadingView()
            } else {
                NextRaceView(
                    session = FakeSession.getFakeSession(),
                    onClickSession = {},
                    onClickCalendar = {}
                )
                Spacer(dp = 30.dp)

                LastResultView(
                    lastSessionResultSummary = state.lastSessionResultSummary,
                    onClick = viewModel::onClickLastRaceResult
                )
            }
        }
    }
}