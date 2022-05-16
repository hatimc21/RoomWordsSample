package com.example.roomwordssample.dao;

import androidx.lifecycle.LiveData;
import androidx.room.*;

import com.example.roomwordssample.entities.Word;

import java.util.List;

@Dao
public interface WordDao {
    @Insert
    void insert(Word word);

    @Query("DELETE FROM word_table")
    void deleteAll();

    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();


}
