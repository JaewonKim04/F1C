package com.kong.feature.result.components.tab

import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kong.feature.core.theme.Bold16
import com.kong.feature.core.theme.Regular16
import com.kong.feature.core.theme.black
import com.kong.feature.core.theme.lightGray
import com.kong.feature.core.theme.primary
import com.kong.feature.result.components.ResultType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

@Composable
fun SessionResultTabRow(
    selectedResultType: ResultType,
    onClickTab: (ResultType) -> Unit
) {
    TabRow(
        selectedTabIndex = selectedResultType.index,
        indicator = { tabPositions ->
            TabRowDefaults.PrimaryIndicator(
                width = 60.dp,
                modifier = Modifier.tabIndicatorOffset(tabPositions[selectedResultType.index]),
                color = primary
            )
        },
        divider = {
            HorizontalDivider(thickness = 1.dp)
        }
    ) {
        ResultType.entries.forEach {
            val selected = selectedResultType == it
            Tab(
                selected = selected,
                onClick = { onClickTab(it) },
                interactionSource = DisabledInteractionSource()
            ) {
                val textStyle = if (selected) Bold16 else Regular16
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
}

private class DisabledInteractionSource : MutableInteractionSource {
    override val interactions: Flow<Interaction> = emptyFlow()
    override suspend fun emit(interaction: Interaction) {}
    override fun tryEmit(interaction: Interaction) = true
}