package com.example.noteapp.feature_note.domain.use_cases

import com.example.noteapp.feature_note.domain.models.NoteModel
import com.example.noteapp.feature_note.domain.repositories.NoteRepository
import kotlinx.coroutines.flow.Flow

class GetNotes(
    private val repository: NoteRepository
) {

    operator fun invoke(): Flow<List<NoteModel>> {
        return repository.getNotes()
    }
}