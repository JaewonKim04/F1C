package com.kong.ui.core.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.kong.ui.core.theme.lightGray
import com.valentinilk.shimmer.shimmer

@Composable
fun TitleLoadingView() {
    Box(
        modifier = Modifier
            .shimmer()
            .background(lightGray)
            .size(width = 150.dp, height = 40.dp)
    )
}

@Composable
fun ContentLoadingView(height: Dp = 20.dp) {
    Box(
        modifier = Modifier
            .shimmer()
            .background(lightGray)
            .size(width = 100.dp, height = 20.dp)
    )
}

@Composable
fun DescriptionLoadingView() {
    Box(
        modifier = Modifier
            .shimmer()
            .background(lightGray)
            .size(width = 80.dp, height = 10.dp)
    )
}

