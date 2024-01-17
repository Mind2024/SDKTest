package com.example.sdkdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.logger.Logger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger.printLogs("HELLO-------------->")
    }
}