package com.kong.ui.core.theme

import androidx.compose.ui.graphics.Color

val white = Color(0xFFFFFFFF)
val black = Color(0xFF000000)

val backgroundGray = Color(0xFFF0F1F5)
val lightGray = Color(0xFF989898)
val gray = Color(0xFF606060)
val darkGray = Color(0xFF232323)

val primary = Color(0xFFFF1801)

val qualifyingBackground = Color(0xFFE2BEFF)
val raceBackground = Color(0xFFFF9D93)

val fastestLapColor = Color(0xFF8D00FF)

fun getColorFromHexCode(hexCode: String): Color =
    try {
        Color(android.graphics.Color.parseColor(hexCode))
    } catch (e: Exception) {
        black
    }