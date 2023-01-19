package com.selqet.momrecipebook.mapper;

import com.selqet.momrecipebook.entity.RecipeEntity;
import com.selqet.momrecipebook.model.RecipeDto;
import com.selqet.momrecipebook.model.RecipeStepDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RecipeMapper {
    RecipeEntity toEntity(RecipeDto recipe);

    @Mapping(source = "recipe.id", target = "id")
    @Mapping(source = "recipe.title", target = "title")
    @Mapping(source = "recipe.time", target = "time")
    @Mapping(source = "stepsList", target = "recipeSteps")
    RecipeDto toDto(RecipeEntity recipe, List<RecipeStepDto> stepsList);
}
