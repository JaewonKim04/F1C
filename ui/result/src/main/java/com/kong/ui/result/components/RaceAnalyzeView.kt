package com.kong.ui.result.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kong.ui.result.RaceResultState
import com.kong.ui.result.components.banner.RaceSummaryBanner

@Composable
fun RaceAnalyzeView(state: RaceResultState) {
    Column(modifier = Modifier.padding(12.dp)) {
        if (state.summaries.isNotEmpty()) {
            RaceSummaryBanner(summaries = state.summaries)
        }
    }
}