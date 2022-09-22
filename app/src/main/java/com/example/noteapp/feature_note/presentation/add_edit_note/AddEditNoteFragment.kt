package com.example.noteapp.feature_note.presentation.add_edit_note

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.noteapp.R
import com.example.noteapp.core.helpers.DebugLogs

class AddEditNoteFragment : Fragment() {
    private val TAG = AddEditNoteFragment::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments()
    }

    private fun arguments() {
        val bundle = arguments
        if (bundle == null) {
            DebugLogs.e(TAG, "AddEditNoteFragment did not receive NoteID")
            return
        }

        val args = AddEditNoteFragmentArgs.fromBundle(bundle)
        DebugLogs.e(TAG, "NoteID: " + args.noteID.toString())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_edit_note, container, false)
    }
}