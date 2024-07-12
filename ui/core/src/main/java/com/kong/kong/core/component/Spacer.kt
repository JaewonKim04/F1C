package com.kong.kong.core.component

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height

@Composable
fun RowScope.Spacer(dp: Dp) {
    Spacer(modifier = Modifier.width(dp))
}

@Composable
fun ColumnScope.Spacer(dp: Dp) {
    Spacer(modifier = Modifier.height(dp))
}