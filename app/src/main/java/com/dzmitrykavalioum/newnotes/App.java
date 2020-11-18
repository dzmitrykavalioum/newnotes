package com.dzmitrykavalioum.newnotes;

import android.app.Application;

import androidx.room.Room;

import com.dzmitrykavalioum.newnotes.data.AppDatabase;
import com.dzmitrykavalioum.newnotes.data.NoteDao;

public class App extends Application {

    private AppDatabase database;
    private NoteDao noteDao;

    private static App instance;
    public static App getInstance(){
        return instance;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        database = Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"app-db-notes").allowMainThreadQueries().build();
        noteDao = database.noteDao();
    }

    public AppDatabase getDatabase() {
        return database;
    }

    public NoteDao getNoteDao() {
        return noteDao;
    }
}
