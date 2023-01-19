package com.selqet.momrecipebook.mapper;

import com.selqet.momrecipebook.entity.IngredientEntity;
import com.selqet.momrecipebook.model.IngredientDto;
import org.mapstruct.*;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface IngredientMapper {
    IngredientEntity toEntity(IngredientDto ingredient);

    IngredientEntity toEntity(IngredientDto ingredientDto, @MappingTarget IngredientEntity ingredientEntity);

    IngredientDto toDto(IngredientEntity ingredient);
}
