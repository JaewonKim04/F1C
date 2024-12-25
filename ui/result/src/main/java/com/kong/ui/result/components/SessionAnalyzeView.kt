package com.kong.ui.result.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kong.ui.core.component.Spacer
import com.kong.ui.core.theme.Bold16
import com.kong.ui.core.theme.black
import com.kong.ui.result.SessionResultState
import com.kong.ui.result.components.banner.SessionSummaryBanner
import com.kong.ui.result.components.item.FastestDriverItem

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