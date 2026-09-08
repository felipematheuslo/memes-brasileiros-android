package com.olivenbaum.memesbrasil.ui.ads

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView

/**
 * ID oficial de teste do Google AdMob para formato Banner:
 * https://developers.google.com/admob/android/test-ads
 */
const val ADMOB_TEST_BANNER_ID = "ca-app-pub-3940256099942544/9214589741"

@Composable
fun BannerAd(
    modifier: Modifier = Modifier,
    adUnitId: String = ADMOB_TEST_BANNER_ID
) {
    AndroidView(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        factory = { context ->
            AdView(context).apply {
                setAdSize(AdSize.BANNER)
                this.adUnitId = adUnitId
                loadAd(AdRequest.Builder().build())
            }
        }
    )
}
