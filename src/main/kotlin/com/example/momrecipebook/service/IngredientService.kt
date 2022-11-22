package com.example.momrecipebook.service


import com.example.momrecipebook.dto.IngredientDto

interface IngredientService {
    fun getAll(): List<IngredientDto>
    fun create(dto: IngredientDto): Long
    fun deleteByName(name: String)
}