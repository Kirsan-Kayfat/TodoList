package com.shuchenysh.todolist;

import android.app.Application;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.ArrayList;

@androidx.room.Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class Database extends RoomDatabase {

    private ArrayList<Note> notes = new ArrayList<>();
    private static Database instance = null;
    private static final String DB_NAME = "notes.db";

    public static Database getInstance(Application application) {
        if (instance == null) {
            instance = Room.databaseBuilder(application, Database.class, DB_NAME).build();
        }
        return instance;
    }

    //private Database(){}

    public abstract NotesDao notesDao();
}
