package com.example.momrecipebook.service.implementation

import com.example.momrecipebook.datasource.IngredientRepository
import com.example.momrecipebook.dto.IngredientDto
import com.example.momrecipebook.model.IngredientEntity
import com.example.momrecipebook.service.IngredientService
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class IngredientServiceImpl(
    private val ingredientRepository: IngredientRepository
) : IngredientService {
    override fun getAll(): List<IngredientDto> =
        ingredientRepository.findByOrderByName().map { it.toDto() }

    @Transactional
    override fun create(dto: IngredientDto): Long {
        val ingredientEntity = ingredientRepository.save(dto.toEntity())
        return ingredientEntity.id
    }

    //TODO Add exception on NON_FOUND
    @Transactional
    override fun deleteByName(name: String) {
        ingredientRepository.deleteByNameEqualsIgnoreCase(name)
    }

    private fun IngredientEntity.toDto(): IngredientDto =
        IngredientDto(
            id = this.id,
            name = this.name,
            calories = this.calories
        )

    private fun IngredientDto.toEntity(): IngredientEntity =
        IngredientEntity(
            id = 0,
            name = this.name,
            calories = this?.calories,
        )
}