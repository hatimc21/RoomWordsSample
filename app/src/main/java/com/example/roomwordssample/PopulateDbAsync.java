package com.example.roomwordssample;

import android.os.AsyncTask;

import com.example.roomwordssample.dao.WordDao;
import com.example.roomwordssample.entities.Word;

class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

    private final WordDao mDao;
    String[] words = {"dolphin", "crocodile", "cobra"};

    PopulateDbAsync(WordRoomDatabase db) {
        mDao = db.wordDao();
    }

    @Override
    protected Void doInBackground(final Void... params) {
        // Start the app with a clean database every time.
        // Not needed if you only populate the database
        // when it is first created
        mDao.deleteAll();

        for (int i = 0; i <= words.length - 1; i++) {
            Word word = new Word(words[i]);
            mDao.insert(word);
        }
        return null;
    }
}
