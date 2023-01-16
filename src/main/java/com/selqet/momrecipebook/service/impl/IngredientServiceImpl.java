package com.selqet.momrecipebook.service.impl;

import com.selqet.momrecipebook.entity.IngredientEntity;
import com.selqet.momrecipebook.mapper.IngredientEntityMapper;
import com.selqet.momrecipebook.model.IngredientDto;
import com.selqet.momrecipebook.repository.IngredientRepository;
import com.selqet.momrecipebook.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {
    private final IngredientRepository ingredientRepository;
    private final IngredientEntityMapper ingredientEntityMapper;

    @Autowired
    public IngredientServiceImpl(IngredientRepository ingredientRepository, IngredientEntityMapper ingredientEntityMapper) {
        this.ingredientRepository = ingredientRepository;
        this.ingredientEntityMapper = ingredientEntityMapper;
    }

    public List<IngredientDto> getAllIngredients() {
        List<IngredientEntity> ingredientEntities = ingredientRepository.findAll();
        List<IngredientDto> ingredientDtos = Collections.emptyList();

        for (IngredientEntity ingredient : ingredientEntities) {
            ingredientDtos.add(toDtoAutoMapping(ingredient));
        }

        return ingredientDtos;
    }

    private IngredientDto toDtoAutoMapping(IngredientEntity ingredient) {
        return ingredientEntityMapper.toDto(ingredient);
    }
}
