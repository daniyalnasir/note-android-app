package com.daniyal.dependencyinjection

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.koinApplication
import org.koin.dsl.module

fun initKoin(
    context: Context,
    additionalModules: List<Module> = emptyList(),
): KoinApplication {
    val koinApplication = koinApplication {
        androidContext(androidContext = context)
        androidLogger()
        modules(
            listOf(
                module { includes(additionalModules) },
                appModule,
            )
        )
        createEagerInstances()
    }
    return startKoin(koinApplication)
}