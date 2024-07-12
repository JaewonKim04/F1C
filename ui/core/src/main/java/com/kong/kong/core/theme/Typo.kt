package com.kong.kong.core.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val Regular24: TextStyle
    @Composable get() = TextStyle(
        fontSize = with(LocalDensity.current) { (30 / fontScale).sp }
    )

val Bold24: TextStyle
    @Composable get() = TextStyle(
        fontSize = with(LocalDensity.current) { (30 / fontScale).sp },
        fontWeight = FontWeight.Bold
    )

val Regular18: TextStyle
    @Composable get() = TextStyle(
        fontSize = with(LocalDensity.current) { (18 / fontScale).sp }
    )

val Bold18: TextStyle
    @Composable get() = TextStyle(
        fontSize = with(LocalDensity.current) { (18 / fontScale).sp },
        fontWeight = FontWeight.Bold
    )

val Regular14: TextStyle
    @Composable get() = TextStyle(
        fontSize = with(LocalDensity.current) { (14 / fontScale).sp }
    )

val Bold14: TextStyle
    @Composable get() = TextStyle(
        fontSize = with(LocalDensity.current) { (14 / fontScale).sp },
        fontWeight = FontWeight.Bold
    )