package com.raywenderlich.cheesefinder.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "cheeses", indices = [Index(value = ["name"], unique = true)])
data class Menu(@PrimaryKey(autoGenerate = true) var id: Long = 0,
                @ColumnInfo(name = "name") var name: String,
                @ColumnInfo(name = "favorite") var favorite: Int = 0,
                @ColumnInfo(name = "Describe") var describe: String,
                @ColumnInfo(name = "Price") var price: Int = 0)
