package com.tbn.memorygame.utils

import android.graphics.Bitmap

object BitmapScaler {

    //Scale & maintatin aspect ratio given desire width
    //BitmapScaler.scaleToFitWidth(bitmap, 100);
    fun scaleToFitWidth(b: Bitmap, width: Int): Bitmap{
        val factor = width / b.width.toFloat()
        return Bitmap.createScaledBitmap(b, width,(b.height * factor).toInt(), true)
    }
    //Scale & maintatin aspect ratio given desire height
    fun scaleToFitHeight(b: Bitmap, height: Int): Bitmap{
        val factor = height / b.height.toFloat()
        return Bitmap.createScaledBitmap(b, height, (b.width * factor).toInt(), true)
    }
}
