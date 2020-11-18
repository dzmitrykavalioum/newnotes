package com.dzmitrykavalioum.newnotes.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.dzmitrykavalioum.newnotes.App;
import com.dzmitrykavalioum.newnotes.model.Note;

import java.util.List;

public class MainViewModel extends ViewModel {
    private LiveData<List<Note>> noteLiveData = App.getInstance().getNoteDao().getAllLiveData();

    public LiveData<List<Note>> getNoteLiveData() {
        return noteLiveData;
    }
}
