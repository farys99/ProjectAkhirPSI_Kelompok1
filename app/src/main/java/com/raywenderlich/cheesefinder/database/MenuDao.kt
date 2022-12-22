package com.raywenderlich.cheesefinder.database

import androidx.room.*

@Dao
interface MenuDao {

    @Query("SELECT * FROM cheeses WHERE name LIKE :name")
    fun findCheese(name: String): List<Menu>

    @Query("SELECT favorite FROM cheeses WHERE :id LIMIT 1")
    fun isFavorite(id: Long): Int

    @Update
    fun favoriteCheese(menu: Menu): Int

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAll(menus: List<Menu>): List<Long>
}