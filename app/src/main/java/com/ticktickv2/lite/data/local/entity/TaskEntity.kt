package com.ticktickv2.lite.data.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "tasks",
    foreignKeys = [
        ForeignKey(
            entity = CategoryEntity::class,
            parentColumns = ["id"],
            childColumns = ["categoryId"],
            onDelete = ForeignKey.SET_NULL
        )
    ],
    indices = [Index(value = ["categoryId"])]
)
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val note: String?,
    val dueDate: Long?,
    val startTime: Long?,
    val endTime: Long?,
    val priority: Priority = Priority.NONE,
    val categoryId: Int?,
    val isCompleted: Boolean = false,
    val createdAt: Long = System.currentTimeMillis()
)
