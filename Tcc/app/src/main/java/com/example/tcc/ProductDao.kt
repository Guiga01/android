package com.example.tcc

import androidx.room.Dao
import androidx.room.Query

@Dao
interface ProductDao {
    @Query("SELECT * FROM user")
    fun getAll(): List<Product>


}