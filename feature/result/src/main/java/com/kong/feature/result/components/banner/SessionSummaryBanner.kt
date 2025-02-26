package com.kong.feature.result.components.banner

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kong.feature.core.component.Spacer
import com.kong.feature.core.theme.Bold14
import com.kong.feature.core.theme.Regular14
import com.kong.feature.core.theme.black
import com.kong.feature.core.theme.gray
import com.kong.feature.core.theme.qualifyingBackground

@Composable
fun SessionSummaryBanner(
    summaries: List<String>
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = qualifyingBackground,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(10.dp)
    ) {
        Text(
            text = "🤖 AI 경기요약",
            style = Bold14,
            color = gray
        )
        Spacer(dp = 5.dp)
        summaries.forEach {
            Text(
                text = "- $it",
                style = Regular14,
                color = black
            )
            Spacer(dp = 3.dp)
        }
    }
}