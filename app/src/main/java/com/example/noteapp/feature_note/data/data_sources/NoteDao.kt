package com.example.noteapp.feature_note.data.data_sources

import androidx.room.*
import com.example.noteapp.feature_note.domain.models.NoteModel
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<NoteModel>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById(id: Int): NoteModel?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: NoteModel)

    @Delete
    suspend fun deleteNote(note: NoteModel)
}