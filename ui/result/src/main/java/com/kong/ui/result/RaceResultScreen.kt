package com.kong.ui.result

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
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
import com.kong.ui.core.theme.Bold18
import com.kong.ui.core.theme.Regular18
import com.kong.ui.core.theme.black
import com.kong.ui.core.theme.lightGray
import com.kong.ui.result.components.RaceAnalyzeView
import com.kong.ui.result.components.RaceRankView
import com.kong.ui.result.components.ResultType
import com.kong.ui.result.components.SessionView
import org.orbitmvi.orbit.compose.collectAsState

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
        Column(
            modifier = Modifier
                .padding(paddingValues)
        ) {
            Spacer(dp = 20.dp)
            SessionView(
                modifier = Modifier.padding(horizontal = 16.dp),
                session = state.session
            )

            Spacer(dp = 10.dp)
            TabRow(selectedTabIndex = state.selectedResultType.index) {
                ResultType.entries.forEach {
                    val selected = state.selectedResultType == it
                    Tab(
                        selected = selected,
                        onClick = { viewModel.onClickResultTypeTab(it) }
                    ) {
                        val textStyle = if (selected) Bold18 else Regular18
                        val textColor = if (selected) black else lightGray
                        Text(
                            modifier = Modifier.padding(vertical = 15.dp),
                            text = it.title,
                            style = textStyle,
                            color = textColor
                        )
                    }
                }
            }

            when (state.selectedResultType) {
                ResultType.RANK -> {
                    RaceRankView()
                }

                ResultType.ANALYZE -> {
                    RaceAnalyzeView()
                }
            }
        }
    }
}