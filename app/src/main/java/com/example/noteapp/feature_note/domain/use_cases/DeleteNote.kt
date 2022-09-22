package com.example.noteapp.feature_note.domain.use_cases

import com.example.noteapp.feature_note.domain.models.NoteModel
import com.example.noteapp.feature_note.domain.repositories.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: NoteModel) {
        repository.deleteNote(note)
    }
}