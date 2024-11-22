package com.kong.ui.result.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kong.ui.result.SessionResultState
import com.kong.ui.result.components.banner.SessionSummaryBanner

@Composable
fun SessionAnalyzeView(state: SessionResultState) {
    Column(modifier = Modifier.padding(12.dp)) {
        if (state.summaries.isNotEmpty()) {
            SessionSummaryBanner(summaries = state.summaries)
        }
    }
}