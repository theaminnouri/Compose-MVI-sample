package com.pignasoft.composemvisample.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = "FIRST_SCREEN"
    ) {
        composable(route = "FIRST_SCREEN") {
            FirstScreen(name = "FIRST")
        }
        composable(route = "SECOND_SCREEN") {
            FirstScreen(name = "SECOND")
        }
        composable(route = "THIRD_SCREEN") {
            FirstScreen(name = "THIRD")
        }
        composable(route = "FOURTH_SCREEN") {
            FirstScreen(name = "FOURTH")
        }
    }
}

