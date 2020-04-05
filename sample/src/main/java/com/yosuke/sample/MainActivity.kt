package com.yosuke.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yosuke.lifecyclelogger.Logger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger.bindWithTag(this, MainActivity::class.java.simpleName)
    }
}
