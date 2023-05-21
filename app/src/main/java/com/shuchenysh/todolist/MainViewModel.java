package com.shuchenysh.todolist;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class MainViewModel extends AndroidViewModel {

    private NotesDao notesDao;

    public MainViewModel(@NonNull Application application) {
        super(application);
        notesDao = Database.getInstance(application).notesDao();
    }

    public LiveData<List<Note>> getNotes() {
        return notesDao.getNotes();
    };

    public void add(Note note) {
        notesDao.add(note);
    }

    public void remove(int id){
        notesDao.remove(id);
    }
}
