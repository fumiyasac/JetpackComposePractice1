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
            route = Destinations.CatList.getRoute()
        ) { CatListScreen(navController) }
        composable(
            route = Destinations.CatDetail.getRoute(),
            arguments = listOf(
                navArgument("Id") {
                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->
            CatDetailScreen(
                navController,
                requireNotNull(backStackEntry.arguments).getInt("Id")
            )
        }
    }
}
