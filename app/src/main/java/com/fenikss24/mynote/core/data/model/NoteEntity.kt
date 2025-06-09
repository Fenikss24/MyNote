package com.fenikss24.mynote.core.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description: String
)
