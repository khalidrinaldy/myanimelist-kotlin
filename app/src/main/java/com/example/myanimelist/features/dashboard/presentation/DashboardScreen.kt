package com.example.myanimelist.features.dashboard.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DashboardScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        innerPadding -> Box(modifier= Modifier.padding(innerPadding)) {
            Text(text = "Home Screen")
        }
    }
}

@Preview(name = "DashboardScreen")
@Composable
private fun PreviewDashboardScreen() {
    DashboardScreen()
}