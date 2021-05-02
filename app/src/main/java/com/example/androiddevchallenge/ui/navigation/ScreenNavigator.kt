/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.screen.CatDetailScreen
import com.example.androiddevchallenge.ui.screen.CatListScreen
import com.example.androiddevchallenge.viewmodel.CatListViewModel

object Destinations {
    const val CatListScreen = "CatListScreen"
    const val CatDetailScreen = "CatDetailScreen"
    object CatDetailArgs {
        const val Id = "{Id}"
    }
}

class Actions(navController: NavController) {
    val openCatDetail: (Int) -> Unit = { id ->
        val route = listOf(
            Destinations.CatDetailScreen,
            id.toString()
        ).joinToString(separator = "/")
        navController.navigate(
            route = route
        )
    }
    val navigateBack: () -> Unit = {
        navController.popBackStack()
    }
}

@Composable
fun ScreenNavigator() {
    val navController = rememberNavController()
    val actions = Actions(
        navController = navController
    )
    NavHost(
        navController = navController,
        startDestination = Destinations.CatListScreen
    ) {
        // 猫ちゃん一覧画面
        composable(
            route = Destinations.CatListScreen
        ) {
            CatListScreen(
                catListViewModel = CatListViewModel(),
                openCatDetail = actions.openCatDetail
            )
        }
        // 猫ちゃん詳細画面
        composable(
            route = listOf(
                Destinations.CatDetailScreen,
                Destinations.CatDetailArgs.Id
            ).joinToString(separator = "/"),
            arguments = listOf(
                navArgument("Id") {
                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->
            val id = requireNotNull(backStackEntry.arguments).getInt("Id")
            CatDetailScreen(
                id = id,
                navigateBack = actions.navigateBack
            )
        }
    }
}
