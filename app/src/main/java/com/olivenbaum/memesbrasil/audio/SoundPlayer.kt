package com.olivenbaum.memesbrasil.audio

import android.content.Context
import android.media.MediaPlayer
import androidx.annotation.RawRes

class SoundPlayer {

    private var mediaPlayer: MediaPlayer? = null

    fun play(context: Context, @RawRes soundResId: Int, onCompletion: (() -> Unit)? = null) {
        release()
        try {
            mediaPlayer = MediaPlayer.create(context, soundResId)?.apply {
                setOnCompletionListener {
                    release()
                    onCompletion?.invoke()
                }
                start()
            }
        } catch (e: Exception) {
            e.printStackTrace()
            release()
            onCompletion?.invoke()
        }
    }

    fun stop() {
        release()
    }

    fun release() {
        try {
            mediaPlayer?.let {
                if (it.isPlaying) {
                    it.stop()
                }
                it.release()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            mediaPlayer = null
        }
    }
}

