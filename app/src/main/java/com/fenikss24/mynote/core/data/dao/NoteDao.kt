package com.fenikss24.mynote.core.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.fenikss24.mynote.core.data.model.NoteEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * FROM noteEntity")
    fun getAllNotes(): Flow<List<NoteEntity>>

    @Insert
    fun insertNote(noteEntity: NoteEntity)

    @Update
    fun updateNote(noteEntity: NoteEntity)

    @Query("SELECT * FROM noteEntity WHERE id=:id")
    fun getNoteById(id: Int): Flow<NoteEntity>

    @Delete
    fun delete(noteEntity: NoteEntity)
}
