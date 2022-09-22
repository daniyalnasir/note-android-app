package com.example.noteapp.feature_note.domain.use_cases

import com.example.noteapp.feature_note.domain.models.NoteModel
import com.example.noteapp.feature_note.domain.repositories.NoteRepository


class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): NoteModel? {
        return repository.getNoteById(id)
    }
}