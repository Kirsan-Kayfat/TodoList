package com.shuchenysh.todolist;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class AddNoteViewModel extends AndroidViewModel {

    private NotesDao notesDao;

    public AddNoteViewModel(@NonNull Application application) {
        super(application);
        notesDao = Database.getInstance(application).notesDao();
    }

    public void add(Note note) {
        notesDao.add(note);
    }
}
