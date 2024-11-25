package com.example.welearn.util

import android.content.Context
import android.media.MediaPlayer
import androidx.annotation.RawRes

fun playSound(context: Context, @RawRes soundResId: Int, currenPlayer: MediaPlayer?, onCompletion: () -> Unit) {
    currenPlayer?.release()
    val mediaPlayer = MediaPlayer.create(context, soundResId)
    mediaPlayer.setOnCompletionListener {
        it.release()
        onCompletion()
    }
    mediaPlayer.start()
}