package com.olivenbaum.memesbrasil.ui.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.olivenbaum.memesbrasil.R
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

    Box(modifier = Modifier.fillMaxSize()) {
        // True Full-Screen Edge-to-Edge Background Image
        Image(
            painter = painterResource(id = R.drawable.bandeira),
            contentDescription = "Bandeira do Brasil",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // Subtle dark contrast overlay for better card readability
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.22f))
        )

        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = Color.Transparent,
            bottomBar = {
                // Banner de anúncio comentado temporariamente para capturas de tela da loja
                // BannerAd(
                //     modifier = Modifier.navigationBarsPadding()
                // )
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
                    SoundBoardScreen(
                        category = category,
                        onBackClick = { navController.popBackStack() }
                    )
                }
            }
        }
    }
}
