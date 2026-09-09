package com.olivenbaum.memesbrasil.ui.screens

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.olivenbaum.memesbrasil.audio.SoundPlayer
import com.olivenbaum.memesbrasil.data.Category
import com.olivenbaum.memesbrasil.util.AudioShareHelper

@Composable
fun SoundBoardScreen(
    category: Category,
    onBackClick: (() -> Unit)? = null
) {
    val context = LocalContext.current
    val soundPlayer = remember { SoundPlayer() }
    var currentlyPlayingResId by remember { mutableStateOf<Int?>(null) }

    DisposableEffect(Unit) {
        onDispose {
            soundPlayer.release()
            currentlyPlayingResId = null
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
    ) {
        // Top Navigation & Header Row
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 10.dp)
        ) {
            // Back Button (Left)
            if (onBackClick != null) {
                Surface(
                    onClick = onBackClick,
                    shape = CircleShape,
                    color = Color(0xD90F172A),
                    border = BorderStroke(1.dp, Color(0x33FFFFFF)),
                    shadowElevation = 6.dp,
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .size(42.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Text(
                            text = "←",
                            color = Color.White,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            // Category Header Card (Centered)
            Surface(
                shape = RoundedCornerShape(22.dp),
                color = Color(0xD90F172A),
                border = BorderStroke(1.dp, Color(0x33FFFFFF)),
                shadowElevation = 6.dp,
                modifier = Modifier.align(Alignment.Center)
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = category.imageResId),
                        contentDescription = category.name,
                        modifier = Modifier
                            .size(38.dp)
                            .padding(end = 10.dp),
                        contentScale = ContentScale.Fit
                    )
                    Text(
                        text = category.name,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
        }

        // Sounds List with modern Glassmorphic Cards, Active Playing State and WhatsApp Share Button
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 20.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(category.sounds) { sound ->
                val isPlaying = currentlyPlayingResId == sound.soundResId

                Card(
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = if (isPlaying) Color(0xE614243B) else Color(0xD9131D2E)
                    ),
                    border = if (isPlaying) {
                        BorderStroke(1.5.dp, Color(0xFF4ADE80))
                    } else {
                        BorderStroke(1.dp, Color(0x2EFFFFFF))
                    },
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = if (isPlaying) 6.dp else 3.dp,
                        pressedElevation = 6.dp
                    ),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 12.dp, end = 10.dp, top = 10.dp, bottom = 10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Play/Stop & Title area (Clickable)
                        Row(
                            modifier = Modifier
                                .weight(1f)
                                .clickable {
                                    if (isPlaying) {
                                        soundPlayer.stop()
                                        currentlyPlayingResId = null
                                    } else {
                                        currentlyPlayingResId = sound.soundResId
                                        soundPlayer.play(context, sound.soundResId) {
                                            if (currentlyPlayingResId == sound.soundResId) {
                                                currentlyPlayingResId = null
                                            }
                                        }
                                    }
                                },
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // Dynamic Action Badge (Play / Stop)
                            Box(
                                modifier = Modifier
                                    .size(40.dp)
                                    .background(
                                        if (isPlaying) Color(0x33EF4444) else Color(0x3322C55E),
                                        CircleShape
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                if (isPlaying) {
                                    // Stop symbol
                                    Text(
                                        text = "⏹",
                                        color = Color(0xFFEF4444),
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                } else {
                                    // Play symbol
                                    Text(
                                        text = "▶",
                                        color = Color(0xFF4ADE80),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(start = 2.dp)
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.width(12.dp))

                            // Sound Title & Playing status
                            Column(
                                modifier = Modifier.weight(1f),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = sound.name,
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    fontWeight = if (isPlaying) FontWeight.Bold else FontWeight.SemiBold,
                                    maxLines = 2,
                                    overflow = TextOverflow.Ellipsis
                                )

                                if (isPlaying) {
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                                    ) {
                                        EqualizerBars(
                                            modifier = Modifier
                                                .height(12.dp)
                                                .width(16.dp),
                                            color = Color(0xFF4ADE80)
                                        )
                                        Text(
                                            text = "TOCANDO",
                                            color = Color(0xFF4ADE80),
                                            fontSize = 11.sp,
                                            fontWeight = FontWeight.Bold,
                                            letterSpacing = 0.5.sp
                                        )
                                    }
                                }
                            }
                        }

                        Spacer(modifier = Modifier.width(8.dp))

                        // Dedicated WhatsApp Share Button
                        Surface(
                            onClick = {
                                AudioShareHelper.shareToWhatsApp(
                                    context = context,
                                    soundResId = sound.soundResId,
                                    soundName = sound.name
                                )
                            },
                            shape = CircleShape,
                            color = Color(0xFF25D366), // Official WhatsApp Green
                            shadowElevation = 4.dp,
                            modifier = Modifier.size(42.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                ShareIcon(
                                    modifier = Modifier.size(18.dp),
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun EqualizerBars(
    modifier: Modifier = Modifier,
    color: Color = Color(0xFF4ADE80)
) {
    val infiniteTransition = rememberInfiniteTransition(label = "equalizer")
    val anim1 by infiniteTransition.animateFloat(
        initialValue = 0.3f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(400, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "bar1"
    )
    val anim2 by infiniteTransition.animateFloat(
        initialValue = 0.85f,
        targetValue = 0.2f,
        animationSpec = infiniteRepeatable(
            animation = tween(350, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "bar2"
    )
    val anim3 by infiniteTransition.animateFloat(
        initialValue = 0.45f,
        targetValue = 0.95f,
        animationSpec = infiniteRepeatable(
            animation = tween(450, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "bar3"
    )

    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(2.dp),
        verticalAlignment = Alignment.Bottom
    ) {
        Box(
            modifier = Modifier
                .width(3.dp)
                .fillMaxHeight(anim1)
                .background(color, RoundedCornerShape(1.dp))
        )
        Box(
            modifier = Modifier
                .width(3.dp)
                .fillMaxHeight(anim2)
                .background(color, RoundedCornerShape(1.dp))
        )
        Box(
            modifier = Modifier
                .width(3.dp)
                .fillMaxHeight(anim3)
                .background(color, RoundedCornerShape(1.dp))
        )
    }
}

@Composable
fun ShareIcon(
    modifier: Modifier = Modifier,
    color: Color = Color.White
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val r = w * 0.16f // circle radius

        val p1 = Offset(w * 0.25f, h * 0.5f) // left node
        val p2 = Offset(w * 0.78f, h * 0.24f) // top-right node
        val p3 = Offset(w * 0.78f, h * 0.76f) // bottom-right node

        val strokeWidth = w * 0.12f
        drawLine(color = color, start = p1, end = p2, strokeWidth = strokeWidth)
        drawLine(color = color, start = p1, end = p3, strokeWidth = strokeWidth)

        drawCircle(color = color, radius = r, center = p1)
        drawCircle(color = color, radius = r, center = p2)
        drawCircle(color = color, radius = r, center = p3)
    }
}

