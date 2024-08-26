package com.kong.ui.result

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
import com.kong.navigate.NavScreens
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.component.TopBar
import com.kong.ui.result.components.RaceAnalyzeView
import com.kong.ui.result.components.RaceRankView
import com.kong.ui.result.components.ResultType
import com.kong.ui.result.components.SessionView
import com.kong.ui.result.components.tab.RaceResultTabRow
import org.orbitmvi.orbit.compose.collectAsState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RaceResultScreen(
    navController: NavController,
    viewModel: RaceResultViewModel = hiltViewModel()
) {

    LaunchedEffect(Unit) {
        viewModel.start("testKey")
    }

    val state by viewModel.collectAsState()
    Scaffold(
        topBar = {
            TopBar(
                onClickBack = {
                    navController.popBackStack(
                        route = NavScreens.HOME.name,
                        inclusive = false
                    )
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
                        session = state.session
                    )
                    Spacer(dp = 10.dp)
                }
            }


            stickyHeader {
                RaceResultTabRow(
                    selectedResultType = state.selectedResultType,
                    onClickTab = viewModel::onClickResultTypeTab
                )
            }

            item {
                when (state.selectedResultType) {
                    ResultType.RANK -> {
                        RaceRankView(state.driverResults)
                    }

                    ResultType.ANALYZE -> {
                        RaceAnalyzeView()
                    }
                }
            }
        }
    }
}