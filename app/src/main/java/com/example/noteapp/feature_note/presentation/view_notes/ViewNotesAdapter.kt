package com.example.noteapp.feature_note.presentation.view_notes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.noteapp.databinding.ItemNoteBinding
import com.example.noteapp.feature_note.domain.models.NoteModel

class ViewNotesAdapter(private val viewModel: ViewNotesVM) :
    RecyclerView.Adapter<ViewNotesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding =
            ItemNoteBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bind(
            viewModel.notesList.value?.get(
                position
            )
        )

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return viewModel.notesList.value?.size ?: 0
    }

    //the class is holding the list view
    inner class ViewHolder(private val binding: ItemNoteBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: NoteModel?) {
            binding.item = item
            binding.viewModel = viewModel
            binding.executePendingBindings()
        }
    }
}