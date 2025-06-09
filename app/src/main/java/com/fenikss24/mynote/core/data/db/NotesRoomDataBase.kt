package com.fenikss24.mynote.core.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.fenikss24.mynote.core.data.dao.NoteDao
import com.fenikss24.mynote.core.data.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
abstract class NotesRoomDataBase: RoomDatabase() {
    abstract fun noteDao(): NoteDao
}