package com.asif.localcacheProject.localdatabase

import androidx.room.RoomDatabase

abstract class Database:RoomDatabase() {
    abstract fun posDao(): Dao
}