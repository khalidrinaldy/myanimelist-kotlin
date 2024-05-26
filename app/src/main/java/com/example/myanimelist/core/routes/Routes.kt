package com.example.myanimelist.core.routes

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myanimelist.features.dashboard.presentation.DashboardScreen

class Routes() {
    companion object {
        var navController: NavHostController
            get() {
                TODO()
            }
            set(value) {}

        @Composable
        fun setRoutes() {
            NavHost(navController = navController, startDestination = HomeViewRoute) {
                composable<HomeViewRoute> {
                    DashboardScreen()
                }
            }
        }
    }
}