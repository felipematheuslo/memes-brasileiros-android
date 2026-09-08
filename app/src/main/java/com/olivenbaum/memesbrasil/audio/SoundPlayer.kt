package com.olivenbaum.memesbrasil.audio

import android.content.Context
import android.media.MediaPlayer
import androidx.annotation.RawRes

class SoundPlayer {

    private var mediaPlayer: MediaPlayer? = null

    fun play(context: Context, @RawRes soundResId: Int) {
        release()
        mediaPlayer = MediaPlayer.create(context, soundResId)
        mediaPlayer?.start()
    }

    fun release() {
        mediaPlayer?.let {
            if (it.isPlaying) {
                it.stop()
            }
            it.release()
        }
        mediaPlayer = null
    }
}
