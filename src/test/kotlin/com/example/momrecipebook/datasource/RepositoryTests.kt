package com.example.momrecipebook.datasource

import com.example.momrecipebook.model.IngredientEntity
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager

@DataJpaTest
class RepositoriesTests @Autowired constructor(
    val entityManager: TestEntityManager,
    val ingredientRepository: IngredientRepository) {

    @Test
    fun `should add ingredient`() {
        val ingredient = IngredientEntity(id = 1, name = "carrot", calories = 100)
        entityManager.persist(ingredient)

    }
}