package com.selqet.momrecipebook.mapper;

import com.selqet.momrecipebook.entity.RecipeStepEntity;
import com.selqet.momrecipebook.model.RecipeStepDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RecipeStepMapper {
    RecipeStepEntity toEntity(RecipeStepDto recipeStep);

    RecipeStepDto toDto(RecipeStepEntity recipeStep);
}
