package com.pignasoft.composemvisample.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun FirstScreen(name: String) {
    Text(text = "Hello $name!")
}