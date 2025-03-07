package com.kong.f1c.navhost

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import kotlin.reflect.KType

inline fun <reified T : Any> NavGraphBuilder.f1cComposable(
    screenAnimStyle: ScreenAnimStyle = ScreenAnimStyle.SLIDE,
    typeMap: Map<KType, @JvmSuppressWildcards NavType<*>> = emptyMap(),
    noinline content: @Composable AnimatedContentScope.(NavBackStackEntry) -> Unit
) {
    composable<T>(
        enterTransition = {
            when (screenAnimStyle) {
                ScreenAnimStyle.SLIDE -> slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Start,
                    animationSpec = tween(200)
                )

                ScreenAnimStyle.FADE -> fadeIn()
            }
        },
        exitTransition = {
            when (screenAnimStyle) {
                ScreenAnimStyle.FADE -> fadeOut()
                ScreenAnimStyle.SLIDE ->
                    slideOutOfContainer(
                        towards = AnimatedContentTransitionScope.SlideDirection.End,
                        animationSpec = tween(200)
                    )
            }
        },
        typeMap = typeMap,
        content = content
    )
}