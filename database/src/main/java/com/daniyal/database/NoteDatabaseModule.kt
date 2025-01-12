package com.daniyal.database

import org.koin.core.qualifier.named
import org.koin.dsl.module

const val NOTE_DATABASE = "NOTE_DATABASE"

val noteDatabaseModule = module {

    single<NoteDatabase>(named(NOTE_DATABASE)) {
        NoteDatabase.getDatabase(context = get())
    }
}