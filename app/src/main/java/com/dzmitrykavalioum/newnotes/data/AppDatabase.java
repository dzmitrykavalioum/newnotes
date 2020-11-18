package com.dzmitrykavalioum.newnotes.data;

import android.app.Application;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.dzmitrykavalioum.newnotes.model.Note;

@Database(entities = {Note.class},version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public  abstract  NoteDao noteDao();
}
