package com.example.tcc

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import java.sql.Date


data class Product(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "codigo_de_barras") val codBarras: String?,
    @ColumnInfo(name = "desc_produto") val descProduto: String?,
    @ColumnInfo(name = "data_validade") val dataValidade: Date?
)
