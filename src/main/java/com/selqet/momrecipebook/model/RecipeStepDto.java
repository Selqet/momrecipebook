package com.selqet.momrecipebook.model;

import lombok.Data;
import org.postgresql.util.PGInterval;

@Data
public class RecipeStepDto {
    private Long id;
    private Short index;
    private String description;
    private PGInterval time;
}
