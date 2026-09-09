package com.olivenbaum.memesbrasil.util

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.widget.Toast
import androidx.core.content.FileProvider
import java.io.File
import java.io.FileOutputStream

object AudioShareHelper {

    fun shareToWhatsApp(context: Context, soundResId: Int, soundName: String) {
        try {
            val soundsDir = File(context.cacheDir, "sounds")
            if (!soundsDir.exists()) {
                soundsDir.mkdirs()
            }

            // Sanitiza o nome do arquivo para evitar caracteres inválidos
            val safeFileName = soundName
                .trim()
                .replace(Regex("[^a-zA-Z0-9_-]"), "_")
                .let { if (it.isEmpty()) "meme_audio" else it } + ".mp3"

            val soundFile = File(soundsDir, safeFileName)

            // Copia o arquivo MP3 de res/raw para o cache temporário
            context.resources.openRawResource(soundResId).use { input ->
                FileOutputStream(soundFile).use { output ->
                    input.copyTo(output)
                }
            }

            val uri = FileProvider.getUriForFile(
                context,
                "${context.packageName}.fileprovider",
                soundFile
            )

            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "audio/*"
                putExtra(Intent.EXTRA_STREAM, uri)
                addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            }

            val pm = context.packageManager
            val targetPackage = when {
                isPackageInstalled(pm, "com.whatsapp") -> "com.whatsapp"
                isPackageInstalled(pm, "com.whatsapp.w4b") -> "com.whatsapp.w4b"
                else -> null
            }

            if (targetPackage != null) {
                shareIntent.setPackage(targetPackage)
                context.startActivity(shareIntent)
            } else {
                context.startActivity(
                    Intent.createChooser(shareIntent, "Compartilhar no WhatsApp / Outros")
                )
            }
        } catch (e: Exception) {
            e.printStackTrace()
            Toast.makeText(context, "Não foi possível compartilhar o áudio.", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isPackageInstalled(pm: PackageManager, packageName: String): Boolean {
        return try {
            pm.getPackageInfo(packageName, 0)
            true
        } catch (e: Exception) {
            false
        }
    }
}
