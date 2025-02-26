package com.kong.feature.result.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kong.feature.core.component.Spacer
import com.kong.feature.core.theme.Bold16
import com.kong.feature.core.theme.black
import com.kong.feature.result.SessionResultState
import com.kong.feature.result.components.banner.SessionSummaryBanner
import com.kong.feature.result.components.item.FastestDriverItem

@Composable
fun SessionAnalyzeView(state: SessionResultState) {
    Column(modifier = Modifier.padding(12.dp)) {
        if (state.summaries.isNotEmpty()) {
            SessionSummaryBanner(summaries = state.summaries)
            Spacer(dp = 8.dp)
        }

        Text(
            text = "패스티스트 랩 Top 3",
            style = Bold16,
            color = black
        )

        state.fastestLapDriverResults.forEachIndexed { index, result ->
            FastestDriverItem(
                isFastestDriver = index == 0,
                driverResult = result
            )
        }
    }
}