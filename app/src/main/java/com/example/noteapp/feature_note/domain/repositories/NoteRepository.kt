package com.example.noteapp.feature_note.domain.repositories

import com.example.noteapp.feature_note.domain.models.NoteModel
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes(): Flow<List<NoteModel>>

    suspend fun getNoteById(id: Int): NoteModel?

    suspend fun insertNote(note: NoteModel)

    suspend fun deleteNote(note: NoteModel)
}