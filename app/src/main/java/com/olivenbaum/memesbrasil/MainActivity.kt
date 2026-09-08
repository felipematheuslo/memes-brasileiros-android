package com.olivenbaum.memesbrasil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.google.android.gms.ads.MobileAds
import com.olivenbaum.memesbrasil.ui.navigation.AppNavigation
import com.olivenbaum.memesbrasil.ui.theme.MemesBrasileirosSomTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Inicializar o Google Mobile Ads SDK em thread de background
        CoroutineScope(Dispatchers.IO).launch {
            MobileAds.initialize(this@MainActivity) {}
        }

        setContent {
            MemesBrasileirosSomTheme {
                AppNavigation()
            }
        }
    }
}