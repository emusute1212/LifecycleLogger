package com.yosuke.lifecyclelogger

import androidx.lifecycle.LifecycleOwner
import com.yosuke.lifecyclelogger.observer.LoggerObserver

object Logger {
    fun bind(lifecycleOwner: LifecycleOwner) {
        lifecycleOwner.lifecycle.addObserver(LoggerObserver())
    }

    fun bindWithTag(lifecycleOwner: LifecycleOwner, tag: String) {
        lifecycleOwner.lifecycle.addObserver(LoggerObserver(tag))
    }
}