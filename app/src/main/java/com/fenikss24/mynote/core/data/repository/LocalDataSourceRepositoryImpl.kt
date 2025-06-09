package com.fenikss24.mynote.core.data.repository

import com.fenikss24.mynote.core.data.LocalDataSource
import com.fenikss24.mynote.core.domain.model.Note
import com.fenikss24.mynote.core.domain.repository.LocalDataSourceRepository
import javax.inject.Inject

class LocalDataSourceRepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
): LocalDataSourceRepository {

    override fun getAllNotesFlow() = localDataSource.getAllNotesFlow()

    override fun getNoteByIdFlow(id: Int) = localDataSource.gelNoteByIdFlow(id)

    override suspend fun updateNote(note: Note) = localDataSource.updateNote(note)

    override suspend fun addNote(note: Note) = localDataSource.addNote(note)

    override suspend fun deleteNote(note: Note) = localDataSource.deleteNote(note)

}