package com.raywenderlich.cheesefinder.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [(Menu::class)], version = 1)
abstract class MenuDatabase : RoomDatabase() {

    abstract fun cheeseDao(): MenuDao

    companion object {

        private var INSTANCE: MenuDatabase? = null

        fun getInstance(context: Context): MenuDatabase {
            if (INSTANCE == null) {
                synchronized(this) {
                    INSTANCE = Room.databaseBuilder(context,
                            MenuDatabase::class.java, "cheese.db")
                            .build()
                }
            }
            return INSTANCE as MenuDatabase
        }

        fun destroyInstance() {
            INSTANCE = null
        }

    }
}