package com.example.noteapp.feature_note.domain.use_cases

import com.example.noteapp.feature_note.domain.models.NoteModel
import com.example.noteapp.feature_note.domain.repositories.NoteRepository
import com.example.noteapp.feature_note.domain.utils.InvalidNoteException


class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: NoteModel) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}