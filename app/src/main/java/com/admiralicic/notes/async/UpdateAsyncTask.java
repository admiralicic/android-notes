package com.admiralicic.notes.async;

import android.os.AsyncTask;

import com.admiralicic.notes.models.Note;
import com.admiralicic.notes.persistence.NoteDao;

public class UpdateAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDao mNoteDao;

    public UpdateAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.update(notes);
        return null;
    }
}
