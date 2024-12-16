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
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.component.TopBar
import com.kong.ui.result.components.SessionAnalyzeView
import com.kong.ui.result.components.SessionRankView
import com.kong.ui.result.components.ResultType
import com.kong.ui.result.components.SessionView
import com.kong.ui.result.components.tab.SessionResultTabRow
import org.orbitmvi.orbit.compose.collectAsState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SessionResultScreen(
    sessionKey: Long,
    navController: NavController,
    viewModel: SessionResultViewModel = hiltViewModel()
) {

    LaunchedEffect(Unit) {
        viewModel.start(sessionKey)
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
                        session = state.sessionResult
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