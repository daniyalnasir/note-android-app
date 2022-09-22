package com.example.noteapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.noteapp.feature_note.data.data_sources.NoteDao
import com.example.noteapp.feature_note.domain.models.NoteModel

@Database(
    entities = [NoteModel::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}