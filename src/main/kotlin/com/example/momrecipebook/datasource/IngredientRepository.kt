package com.example.momrecipebook.datasource

import com.example.momrecipebook.model.IngredientEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface IngredientRepository : CrudRepository<IngredientEntity, Long> {
    fun findByOrderByName(): List<IngredientEntity>
    fun deleteByNameEqualsIgnoreCase(name: String)
}