package com.selqet.momrecipebook.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(schema = "public", name = "recipeingredient")
public class RecipeIngredientEntity {

    @EmbeddedId
    private RecipeIngredientKey id;

    @ManyToOne
    @MapsId("ingredientId")
    @JoinColumn(name = "ingr_id")
    private IngredientEntity ingredient;

    @ManyToOne
    @MapsId("recipeId")
    @JoinColumn(name = "rec_id")
    private RecipeEntity recipe;

    @Column(name = "amount")
    private Short amount;

    @Column(name = "unit")
    private String unit;
}
