package com.kong.ui.core.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val Regular24: TextStyle
    @Composable get() = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = with(LocalDensity.current) { (24 / fontScale).sp },
        fontWeight = FontWeight.Medium
    )

val Bold24: TextStyle
    @Composable get() = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = with(LocalDensity.current) { (24 / fontScale).sp },
        fontWeight = FontWeight.Bold
    )

val Regular18: TextStyle
    @Composable get() = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = with(LocalDensity.current) { (18 / fontScale).sp },
        fontWeight = FontWeight.Medium
    )

val Bold18: TextStyle
    @Composable get() = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = with(LocalDensity.current) { (18 / fontScale).sp },
        fontWeight = FontWeight.Bold
    )

val Regular16: TextStyle
    @Composable get() = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = with(LocalDensity.current) { (16 / fontScale).sp },
        fontWeight = FontWeight.Medium
    )

val Bold16: TextStyle
    @Composable get() = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = with(LocalDensity.current) { (16 / fontScale).sp },
        fontWeight = FontWeight.Bold
    )

val Regular14: TextStyle
    @Composable get() = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = with(LocalDensity.current) { (14 / fontScale).sp },
        fontWeight = FontWeight.Medium
    )

val Bold14: TextStyle
    @Composable get() = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = with(LocalDensity.current) { (14 / fontScale).sp },
        fontWeight = FontWeight.Bold
    )

val Regular12: TextStyle
    @Composable get() = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = with(LocalDensity.current) { (12 / fontScale).sp },
        fontWeight = FontWeight.Medium
    )