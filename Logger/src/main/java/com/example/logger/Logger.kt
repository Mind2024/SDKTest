package com.example.logger

import android.util.Log

object Logger {
    private const val TAG = "Logger"
    fun printLogs(data: String) {
        Log.e(TAG, "printLogs: $data")
    }
}