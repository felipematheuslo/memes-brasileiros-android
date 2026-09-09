package com.olivenbaum.memesbrasil.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.olivenbaum.memesbrasil.data.SoundRepository
import com.olivenbaum.memesbrasil.ui.ads.BannerAd
import com.olivenbaum.memesbrasil.ui.screens.CategoriesScreen
import com.olivenbaum.memesbrasil.ui.screens.SoundBoardScreen

object Routes {
    const val CATEGORIES = "categories"
    const val SOUND_BOARD = "soundboard/{categoryIndex}"

    fun soundBoard(categoryIndex: Int) = "soundboard/$categoryIndex"
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color.Black,
        bottomBar = {
            BannerAd(
                modifier = Modifier.navigationBarsPadding()
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Routes.CATEGORIES,
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = innerPadding.calculateBottomPadding())
        ) {
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
        }
    }
}
