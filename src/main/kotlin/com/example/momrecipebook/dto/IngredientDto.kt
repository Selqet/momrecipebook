package com.example.momrecipebook.dto

data class IngredientDto(
    //TODO Maybe delete, I have sequence
    val id: Long? = null,
    val name: String,
    val calories: Short?
)