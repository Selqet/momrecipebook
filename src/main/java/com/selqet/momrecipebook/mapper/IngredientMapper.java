package com.selqet.momrecipebook.mapper;

import com.selqet.momrecipebook.entity.IngredientEntity;
import com.selqet.momrecipebook.model.IngredientDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IngredientEntityMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "calories", target = "calories")
    IngredientEntity toEntity(IngredientDto ingredient);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "calories", target = "calories")
    IngredientDto toDto(IngredientEntity ingredient);
}
