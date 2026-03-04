package com.ticktickv2.lite.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ticktickv2.lite.data.local.dao.CategoryDao
import com.ticktickv2.lite.data.local.dao.TaskDao
import com.ticktickv2.lite.data.local.entity.CategoryEntity
import com.ticktickv2.lite.data.local.entity.TaskEntity

@Database(
    entities = [TaskEntity::class, CategoryEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class TickTickDatabase : RoomDatabase() {
    abstract val taskDao: TaskDao
    abstract val categoryDao: CategoryDao
}
