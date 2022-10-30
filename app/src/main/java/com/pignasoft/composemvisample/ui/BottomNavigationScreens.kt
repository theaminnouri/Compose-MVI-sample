package com.pignasoft.composemvisample.ui

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector
import com.pignasoft.composemvisample.R

sealed class BottomNavigationScreens(
    val route: String,
    @StringRes val resourceId: Int,
    val icon: ImageVector
) {
    object First :
        BottomNavigationScreens(
            route = "FIRST_SCREEN",
            resourceId = R.string.first_screen,
            icon = Icons.Filled.Star
        )

    object Second :
        BottomNavigationScreens(
            route = "SECOND_SCREEN",
            resourceId = R.string.second_screen,
            icon = Icons.Filled.Star
        )

    object Third :
        BottomNavigationScreens(
            route = "THIRD_SCREEN",
            resourceId = R.string.third_screen,
            icon = Icons.Filled.Star
        )

    object Forth :
        BottomNavigationScreens(
            route = "FOURTH_SCREEN",
            resourceId = R.string.forth_screen,
            icon = Icons.Filled.Star
        )
}