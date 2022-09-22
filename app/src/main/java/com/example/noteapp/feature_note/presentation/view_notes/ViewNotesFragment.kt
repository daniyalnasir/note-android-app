package com.example.noteapp.feature_note.presentation.view_notes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.example.noteapp.R

class ViewNotesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_view_notes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO: Moving to the next fragment, just to complete the add note functionality first.
        val action = ViewNotesFragmentDirections.actionViewNotesFragmentToAddEditNoteFragment(5)
        view.findNavController().navigate(action)
    }
}