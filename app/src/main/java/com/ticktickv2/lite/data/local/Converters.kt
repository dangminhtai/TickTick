package com.ticktickv2.lite.data.local

import androidx.room.TypeConverter
import com.ticktickv2.lite.data.local.entity.Priority

class Converters {
    @TypeConverter
    fun fromPriority(priority: Priority): String {
        return priority.name
    }

    @TypeConverter
    fun toPriority(priority: String): Priority {
        return Priority.valueOf(priority)
    }
}
