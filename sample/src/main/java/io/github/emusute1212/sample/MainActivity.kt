package io.github.emusute1212.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.github.emusute1212.lifecyclelogger.Logger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger.bindWithTag(this, MainActivity::class.java.simpleName)
    }
}
