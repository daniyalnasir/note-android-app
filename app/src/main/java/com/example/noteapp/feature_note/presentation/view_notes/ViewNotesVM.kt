package com.example.noteapp.feature_note.presentation.view_notes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.noteapp.feature_note.domain.models.NoteModel

class ViewNotesVM : ViewModel() {
    private val TAG = ViewNotesVM::class.java.simpleName

    val notesList: MutableLiveData<List<NoteModel>> by lazy {
        MutableLiveData<List<NoteModel>>()
    }
}