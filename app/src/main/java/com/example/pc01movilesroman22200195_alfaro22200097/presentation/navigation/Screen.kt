package com.example.pc01movilesroman22200195_alfaro22200097.presentation.navigation

sealed class Screen(val route: String) {

    object Pantalla0 : Screen("pantalla0")
    object Pantalla1 : Screen("pantalla1")
    object Pantalla2 : Screen("pantalla2")
    object Pantalla3 : Screen("pantalla3")
    object Pantalla4 : Screen("pantalla4")
}
