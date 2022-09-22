package com.example.noteapp.feature_note.data.repositories_impl

import com.example.noteapp.feature_note.data.data_sources.NoteDao
import com.example.noteapp.feature_note.domain.models.NoteModel
import com.example.noteapp.feature_note.domain.repositories.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {

    override fun getNotes(): Flow<List<NoteModel>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): NoteModel? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: NoteModel) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: NoteModel) {
        dao.deleteNote(note)
    }
}