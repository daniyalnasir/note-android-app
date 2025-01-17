package com.daniyal.dependencyinjection

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import org.koin.core.qualifier.named
import org.koin.dsl.module

const val DISPATCHER_IO = "DISPATCHER_IO"
const val DISPATCHER_DEFAULT = "DISPATCHER_DEFAULT"
const val DISPATCHER_MAIN = "DISPATCHER_MAIN"
const val DISPATCHER_UNDEFINED = "DISPATCHER_UNDEFINED"

val appModule = module {
    factory<CoroutineDispatcher>(named(DISPATCHER_IO)) { Dispatchers.IO }
    factory<CoroutineDispatcher>(named(DISPATCHER_DEFAULT)) { Dispatchers.Default }
    factory<CoroutineDispatcher>(named(DISPATCHER_MAIN)) { Dispatchers.Main }
    factory<CoroutineDispatcher>(named(DISPATCHER_UNDEFINED)) { Dispatchers.Unconfined }
}