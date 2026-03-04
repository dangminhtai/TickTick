package com.ticktickv2.lite.di

import android.content.Context
import androidx.room.Room
import com.ticktickv2.lite.data.local.TickTickDatabase
import com.ticktickv2.lite.data.local.dao.CategoryDao
import com.ticktickv2.lite.data.local.dao.TaskDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideTickTickDatabase(@ApplicationContext context: Context): TickTickDatabase {
        return Room.databaseBuilder(
            context,
            TickTickDatabase::class.java,
            "ticktick_db"
        ).build()
    }

    @Provides
    fun provideTaskDao(database: TickTickDatabase): TaskDao {
        return database.taskDao
    }

    @Provides
    fun provideCategoryDao(database: TickTickDatabase): CategoryDao {
        return database.categoryDao
    }
}
