package com.example.androiddevchallenge.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.screen.CatDetailScreen
import com.example.androiddevchallenge.ui.screen.CatListScreen

@Composable
fun ScreenNavigator() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "CatList") {
        composable("CatList") { CatListScreen() }
        composable(
            route = "CatDetail/{Id}",
            arguments = listOf(navArgument("Id") {
                type = NavType.IntType }
            )
        ) { backStackEntry ->
            CatDetailScreen(
                navController,
                requireNotNull(backStackEntry.arguments).getInt("Id")
            )
        }
    }
}
