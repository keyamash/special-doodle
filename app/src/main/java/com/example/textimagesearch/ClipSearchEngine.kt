package com.example.textimagesearch

import android.content.Context
import org.tensorflow.lite.Interpreter

class ClipSearchEngine(context: Context) {
    private val interpreter: Interpreter

    init {
        val asset = context.assets.open("clip.tflite")
        val buffer = asset.readBytes()
        interpreter = Interpreter(buffer)
    }

    fun textToEmbedding(text: String): FloatArray {
        // TODO: preprocess text and run interpreter
        return FloatArray(512)
    }

    fun imageToEmbedding(data: ByteArray): FloatArray {
        // TODO: preprocess image and run interpreter
        return FloatArray(512)
    }

    fun similarity(a: FloatArray, b: FloatArray): Float {
        var sum = 0f
        for (i in a.indices) {
            sum += a[i] * b[i]
        }
        return sum
    }
}
