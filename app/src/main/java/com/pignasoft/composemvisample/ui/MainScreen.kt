package com.pignasoft.composemvisample.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val bottomNavigationItems = listOf(
        BottomNavigationScreens.First,
        BottomNavigationScreens.Second,
        BottomNavigationScreens.Third,
        BottomNavigationScreens.Forth,
    )

    Scaffold(bottomBar = {
        BottomNavigationBar(
            navController = navController,
            items = bottomNavigationItems,
        )
    }) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            color = MaterialTheme.colorScheme.background
        ) {
            AppNavHost(navController = navController)
        }
    }
}

@Composable
fun BottomNavigationBar(navController: NavController, items: List<BottomNavigationScreens>) {
    NavigationBar() {
        items.forEach { item ->
            val label = stringResource(id = item.resourceId)
            NavigationBarItem(
                selected = false,
                onClick = { navController.navigate(route = item.route) },
                label = { Text(text = label) },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = label,
                    )
                }
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavigationBarPreview() {
    val bottomNavigationItems = listOf(
        BottomNavigationScreens.First,
        BottomNavigationScreens.Second,
        BottomNavigationScreens.Third,
        BottomNavigationScreens.Forth,
    )
    val navController = rememberNavController()
    BottomNavigationBar(navController = navController, items = bottomNavigationItems)
}


