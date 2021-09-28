package com.asif.localcacheProject.di.base.module

import android.content.Context
import androidx.room.Room
import com.asif.localcacheProject.localdatabase.Dao
import com.asif.localcacheProject.localdatabase.Database
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideMyDatabase(context: Context): Database {
        return Room.databaseBuilder(context, Database::class.java, "my-db")
            .allowMainThreadQueries().build()
    }

    @Singleton
    @Provides
    fun provideUserDao(myDatabase: Database): Dao {
        return myDatabase.posDao()
    }
}