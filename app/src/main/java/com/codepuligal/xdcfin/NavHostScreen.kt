package com.codepuligal.xdcfin

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.codepuligal.xdcfin.AddExpense
import com.codepuligal.xdcfin.HomeScreen

@Composable
fun NavHostScreen() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "/home") {
        composable(route = "/home") {
            HomeScreen(navController)
        }

        composable(route = "/add") {
            AddExpense(navController)
        }
    }

}