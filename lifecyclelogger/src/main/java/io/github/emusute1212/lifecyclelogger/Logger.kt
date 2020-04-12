package io.github.emusute1212.lifecyclelogger

import androidx.lifecycle.LifecycleOwner
import io.github.emusute1212.lifecyclelogger.observer.LoggerObserver

object Logger {
    fun bind(lifecycleOwner: LifecycleOwner) {
        lifecycleOwner.lifecycle.addObserver(LoggerObserver())
    }

    fun bindWithTag(lifecycleOwner: LifecycleOwner, tag: String) {
        lifecycleOwner.lifecycle.addObserver(
            LoggerObserver(
                tag
            )
        )
    }
}