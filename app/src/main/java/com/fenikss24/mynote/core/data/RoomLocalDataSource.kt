package com.fenikss24.mynote.core.data

import com.fenikss24.mynote.core.data.dao.NoteDao
import com.fenikss24.mynote.core.data.mapper.toNote
import com.fenikss24.mynote.core.data.mapper.toNoteEntity
import com.fenikss24.mynote.core.domain.model.Note
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject


class RoomLocalDataSource @Inject constructor(
    private val noteDao: NoteDao
) : LocalDataSource {

    override fun getAllNotesFlow(): Flow<List<Note>> {
        return noteDao.getAllNotes().map { noteEntityList ->
            noteEntityList.map { noteEntity -> noteEntity.toNote() }
        }
    }

    override suspend fun addNote(note: Note) {
        noteDao.insertNote(note.toNoteEntity())
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.delete(note.toNoteEntity())
    }

    override suspend fun updateNote(note: Note) {
        noteDao.updateNote(note.toNoteEntity())
    }

    override fun gelNoteByIdFlow(id: Int): Flow<Note> {
        return noteDao.getNoteById(id).map { noteEntity ->
            noteEntity.toNote()
        }
    }
}