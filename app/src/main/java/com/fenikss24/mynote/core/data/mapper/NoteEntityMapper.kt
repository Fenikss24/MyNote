package com.fenikss24.mynote.core.data.mapper

import com.fenikss24.mynote.core.data.model.NoteEntity
import com.fenikss24.mynote.core.domain.model.Note

fun NoteEntity.toNote()= Note(id, title, description)
fun Note.toNoteEntity()= NoteEntity(id, title, description)