package com.example.androiddevchallenge.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.screen.DetailScreen
import com.example.androiddevchallenge.ui.screen.ListScreen

@Composable
fun ScreenNavigator() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "list") {
        composable("list") { ListScreen() }
        composable(
            route = "detail/{Id}",
            arguments = listOf(navArgument("Id") {
                type = NavType.IntType }
            )
        ) { backStackEntry ->
            DetailScreen(
                navController,
                requireNotNull(backStackEntry.arguments).getInt("Id")
            )
        }
    }
}
