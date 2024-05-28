package com.example.myanimelist.features.dashboard.presentation

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myanimelist.features.dashboard.presentation.components.DashboardHeader

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DashboardScreen() {
    Scaffold(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    ) {
        innerPadding -> Column(modifier= Modifier
            .padding(bottom = innerPadding.calculateBottomPadding())
        ) {
            DashboardHeader()
        }
    }
}

@Preview(name = "DashboardScreen")
@Composable
private fun PreviewDashboardScreen() {
    DashboardScreen()
}