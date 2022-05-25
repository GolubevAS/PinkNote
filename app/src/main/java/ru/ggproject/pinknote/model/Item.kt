package ru.ggproject.pinknote.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "item_table")
class Item (
    val description : String
) : Serializable {

    @PrimaryKey(autoGenerate = true)
    var id = 0

}