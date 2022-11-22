package com.example.momrecipebook.model

import java.io.Serializable
import javax.persistence.*

@Embeddable
data class RecipeIngredientKey(
    @Column(name = "rec_id")
    var recipeId: Long,

    @Column(name = "ingr_id")
    var ingredientId: Long,
) : Serializable

@Entity
@Table(name = "recipeingredient")
data class RecipeIngredientEntity(
    @EmbeddedId
    var id: RecipeIngredientKey,

    @ManyToOne
    @MapsId("recipeId")
    @JoinColumn(name = "rec_id")
    var recipe: RecipeEntity,

    @ManyToOne
    @MapsId("ingredientId")
    @JoinColumn(name = "ingr_id")
    var ingredient: IngredientEntity,

    @Column(name = "amount")
    var amount: Short?,

    @Column(name = "unit")
    var unit: String?,
)