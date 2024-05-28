package com.example.myanimelist.core.routes

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myanimelist.features.dashboard.presentation.DashboardScreen

@SuppressLint("StaticFieldLeak")
object Routes {
    var navController: NavHostController? = null

    @Composable
    fun SetRoutes() {
        NavHost(navController = navController!!, startDestination = HomeViewRoute) {
            composable<HomeViewRoute> {
                DashboardScreen()
            }
        }
    }
}