package com.example.androiddevchallenge.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.screen.CatDetailScreen
import com.example.androiddevchallenge.ui.screen.CatListScreen

enum class Destinations {
    CatList {
        override fun toString(): String {
            return "CatList"
        }
        override fun getRoute(): String {
            return "CatList"
        }
    },
    CatDetail {
        override fun toString(): String {
            return "CatDetail"
        }
        override fun getRoute(): String {
            return "CatDetail/{Id}"
        }
    };

    abstract fun getRoute(): String
}

@Composable
fun ScreenNavigator() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Destinations.CatList.getRoute()) {
        composable(
            route = Destinations.CatList.getRoute()) { CatListScreen(navController) }
        composable(
            route = Destinations.CatDetail.getRoute(),
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
