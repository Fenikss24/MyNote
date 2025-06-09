package com.fenikss24.mynote.core.di

import android.content.Context
import androidx.room.Room
import com.fenikss24.mynote.core.data.db.NotesRoomDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalSourceModuleProvider {

    @Provides
    @Singleton
    fun provideNoteDao(dataBase: NotesRoomDataBase)=dataBase.noteDao()

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context:Context)=Room
        .databaseBuilder(
            context, NotesRoomDataBase::class.java, "MyNoteDatabase"
        ).build()
}