package com.android.testdai.model.database

import androidx.room.TypeConverter

class DateConverter {

    @TypeConverter
    fun toBoolean(value: Int?): Boolean? {
        return value == 1
    }

}