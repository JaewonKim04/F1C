package com.kong.ui.result.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.kong.result.model.DriverResult
import com.kong.ui.result.components.item.DriverResultItem

@Composable
fun RaceRankView(driverResults: List<DriverResult>) {
    Column {
        driverResults.forEachIndexed { index, driverResult ->
            DriverResultItem(
                index = index,
                driverResult = driverResult
            )
        }
    }
}