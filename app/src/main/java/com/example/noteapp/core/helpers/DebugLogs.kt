package com.example.noteapp.core.helpers

import android.util.Log
import com.example.noteapp.BuildConfig

object DebugLogs {

    fun e(TAG: String, msg: String) {
        if (BuildConfig.isDebugLoggingOn) {
            largeLog(TAG, msg)
        }
    }

    private fun largeLog(tag: String, content: String) {
        if (content.length > 4000) {
            Log.e(tag, content.substring(0, 4000))
            largeLog(tag, content.substring(4000))
        } else {
            Log.e(tag, content)
        }
    }
}