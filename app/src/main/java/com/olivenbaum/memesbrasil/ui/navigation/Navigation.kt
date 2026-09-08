package com.olivenbaum.memesbrasil.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.olivenbaum.memesbrasil.data.SoundRepository
import com.olivenbaum.memesbrasil.ui.screens.CategoriesScreen
import com.olivenbaum.memesbrasil.ui.screens.HomeScreen
import com.olivenbaum.memesbrasil.ui.screens.SoundBoardScreen

object Routes {
    const val HOME = "home"
    const val CATEGORIES = "categories"
    const val SOUND_BOARD = "soundboard/{categoryIndex}"
    const val RECENTES = "recentes"

    fun soundBoard(categoryIndex: Int) = "soundboard/$categoryIndex"
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.HOME
    ) {
        composable(Routes.HOME) {
            HomeScreen(
                onCategoriesClick = {
                    navController.navigate(Routes.CATEGORIES)
                },
                onRecentesClick = {
                    navController.navigate(Routes.RECENTES)
                }
            )
        }

        composable(Routes.CATEGORIES) {
            CategoriesScreen(
                onCategoryClick = { index ->
                    navController.navigate(Routes.soundBoard(index))
                }
            )
        }

        composable(
            route = Routes.SOUND_BOARD,
            arguments = listOf(
                navArgument("categoryIndex") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            val categoryIndex = backStackEntry.arguments?.getInt("categoryIndex") ?: 0
            val category = SoundRepository.categories[categoryIndex]
            SoundBoardScreen(category = category)
        }

        composable(Routes.RECENTES) {
            SoundBoardScreen(category = SoundRepository.recentes)
        }
    }
}
