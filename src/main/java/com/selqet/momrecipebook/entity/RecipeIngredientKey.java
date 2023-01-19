package com.selqet.momrecipebook.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class RecipeIngredientKey implements Serializable {
    @Column(name = "rec_id")
    private Long recipeId;

    @Column(name = "ingr_id")
    private Long ingredientId;
}
