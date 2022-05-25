package ru.ggproject.pinknote.model

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ItemDao {

    @Insert
    fun insert (item : Item)

    @Update
    fun update (item : Item)

    @Delete
    fun delete (item : Item)

    @Query("DELETE FROM item_table")
    fun deleteAllItems()

    @Query("SELECT * FROM item_table")
    fun allItems() : LiveData<List<Item>>

    @Delete
    fun removedItem (item : Item)

}