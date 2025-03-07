package com.kong.feature.result

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.kong.feature.core.component.Spacer
import com.kong.feature.core.component.TopBar
import com.kong.feature.result.components.SessionAnalyzeView
import com.kong.feature.result.components.SessionRankView
import com.kong.feature.result.components.ResultType
import com.kong.feature.result.components.SessionView
import com.kong.feature.result.components.tab.SessionResultTabRow
import com.kong.navigate.NavScreens
import org.orbitmvi.orbit.compose.collectAsState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SessionResultScreen(
    args: NavScreens.SessionResult,
    navController: NavController,
    viewModel: SessionResultViewModel = hiltViewModel()
) {

    LaunchedEffect(Unit) {
        viewModel.start(
            season = args.season,
            round = args.round
        )
    }

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
        LazyColumn(
            modifier = Modifier
                .padding(paddingValues)
        ) {
            item {
                Column {
                    Spacer(dp = 20.dp)
                    SessionView(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        session = state.sessionResult?.session
                    )
                    Spacer(dp = 10.dp)
                }
            }


            stickyHeader {
                SessionResultTabRow(
                    selectedResultType = state.selectedResultType,
                    onClickTab = viewModel::onClickResultTypeTab
                )
            }

            item {
                when (state.selectedResultType) {
                    ResultType.RANK -> {
                        SessionRankView(state.driverResults)
                    }

                    ResultType.ANALYZE -> {
                        SessionAnalyzeView(state)
                    }
                }
            }
        }
    }
}