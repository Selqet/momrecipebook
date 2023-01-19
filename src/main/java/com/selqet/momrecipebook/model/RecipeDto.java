package com.selqet.momrecipebook.model;

import lombok.Data;
import org.postgresql.util.PGInterval;

import java.util.List;

@Data
public class RecipeDto {
    private Long id;
    private String title;
    private PGInterval time;
    private List<RecipeStepDto> recipeSteps;
}
