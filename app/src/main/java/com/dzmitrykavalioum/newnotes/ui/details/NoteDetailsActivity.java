package com.dzmitrykavalioum.newnotes.ui.details;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;


import com.dzmitrykavalioum.newnotes.R;
import com.dzmitrykavalioum.newnotes.data.NoteDao;
import com.dzmitrykavalioum.newnotes.model.Note;

public class NoteDetailsActivity extends AppCompatActivity {

    private Note note;
    private EditText etNote;
    //private Toolbar toolbar;

    public static void start(Activity caller, Note note) {
        Intent intent = new Intent(caller, NoteDetailsActivity.class);
        if (note != null) {
            intent.putExtra(Note.class.getName(), note);
        }
        caller.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_details);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        setTitle(getString(R.string.note_details));
        etNote = findViewById(R.id.et_details);

        if (getIntent().hasExtra(Note.class.getName())) {
            note = getIntent().getParcelableExtra(Note.class.getName());
            etNote.setText(note.text);
        }
        else {
            note = new Note();
        }

    }
}