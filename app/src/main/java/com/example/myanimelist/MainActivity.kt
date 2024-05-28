package com.example.myanimelist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.myanimelist.core.routes.Routes
import com.example.myanimelist.ui.theme.MyanimelistTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyanimelistTheme {
                Routes.navController = rememberNavController()
                Routes.SetRoutes()
            }
        }
    }
}