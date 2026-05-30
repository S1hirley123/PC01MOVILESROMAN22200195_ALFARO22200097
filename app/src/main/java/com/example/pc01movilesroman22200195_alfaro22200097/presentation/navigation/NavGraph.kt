package com.example.pc01movilesroman22200195_alfaro22200097.presentation.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.pc01movilesroman22200195_alfaro22200097.presentation.home.*

@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Pantalla0.route
    ) {

        composable(Screen.Pantalla0.route) {
            Pantalla0(navController)
        }

        composable(Screen.Pantalla1.route) {
            Pantalla1()
        }

        composable(Screen.Pantalla2.route) {
            Pantalla2()
        }


    }
}