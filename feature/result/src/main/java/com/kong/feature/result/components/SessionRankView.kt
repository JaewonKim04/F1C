package com.kong.feature.result.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kong.domain.result.model.DriverResult
import com.kong.feature.core.component.Spacer
import com.kong.feature.result.components.item.DriverResultItem

@Composable
fun SessionRankView(driverResults: List<DriverResult>) {
    Column(modifier = Modifier.padding(horizontal = 12.dp)) {
        driverResults.forEachIndexed { index, driverResult ->
            Spacer(dp = 6.dp)
            DriverResultItem(
                index = index,
                driverResult = driverResult
            )
        }
    }
}