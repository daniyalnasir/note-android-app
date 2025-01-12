package com.daniyal.noteapp

import android.app.Application
import com.daniyal.database.noteDatabaseModule
import com.daniyal.dependencyinjection.initKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin(
            context = this,
            additionalModules = listOf(
                noteDatabaseModule
            )
        )
    }
}
