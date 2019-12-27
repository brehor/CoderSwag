package com.example.coderswag.services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("DevSlopes Graphic Beanie", "$18", "hat1"),
        Product("DevSlopes Hat Black", "$20", "hat2"),
        Product("DevSlopes Hat White", "$18", "hat3"),
        Product("DevSlopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("DevSlopes Hoodie Gray", "$28", "hoodie1"),
        Product("DevSlopes Hoodie Red", "$32", "hoodie2"),
        Product("DevSlopes Gray Hoodie", "$28", "hoodie3"),
        Product("DevSlopes Black Hoodie", "$28", "hoodie4")
    )

    val shirts = listOf(
        Product("DevSlopes Shirt Black", "$18", "shirt1"),
        Product("DevSlopes Badge Light Gray", "$22", "shirt2"),
        Product("DevSlopes Logo Shirt Red", "$20", "shirt3"),
        Product("DevSlopes Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )
}