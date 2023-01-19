package com.selqet.momrecipebook.service.impl;

import com.selqet.momrecipebook.entity.IngredientEntity;
import com.selqet.momrecipebook.mapper.IngredientMapper;
import com.selqet.momrecipebook.model.IngredientDto;
import com.selqet.momrecipebook.repository.IngredientRepository;
import com.selqet.momrecipebook.service.IngredientService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {
    private final IngredientRepository ingredientRepository;
    private final IngredientMapper ingredientMapper;

    @Autowired
    public IngredientServiceImpl(IngredientRepository ingredientRepository, IngredientMapper ingredientMapper) {
        this.ingredientRepository = ingredientRepository;
        this.ingredientMapper = ingredientMapper;
    }

    public List<IngredientDto> getAllIngredients() {
        List<IngredientEntity> ingredientEntities = ingredientRepository.findAll();
        List<IngredientDto> ingredientDtos = new ArrayList<>();

        for (IngredientEntity ingredient : ingredientEntities) {
            ingredientDtos.add(toDtoAutoMapping(ingredient));
        }

        return ingredientDtos;
    }

    public void addIngredient(IngredientDto ingredient) {
        IngredientEntity ingredientEntity = toEntityAutoMapping(ingredient);
        ingredientRepository.save(ingredientEntity);
    }

    //TODO Ask if I should use findById and how to check if present
    public void updateIngredient(Long id, IngredientDto ingredient) {
        IngredientEntity ingredientEntity = ingredientRepository.getReferenceById(id);
        ingredientEntity = toEntityAutoMapping(ingredient, ingredientEntity);
        ingredientRepository.save(ingredientEntity);
    }

    public void deleteIngredient(Long id) {
        ingredientRepository.deleteById(id);
    }

    private IngredientDto toDtoAutoMapping(IngredientEntity ingredient) {
        return ingredientMapper.toDto(ingredient);
    }

    private IngredientEntity toEntityAutoMapping(IngredientDto ingredient) {
        return ingredientMapper.toEntity(ingredient);
    }

    private IngredientEntity toEntityAutoMapping(IngredientDto ingredient, IngredientEntity ingredientEntity) {
        return ingredientMapper.toEntity(ingredient, ingredientEntity);
    }
}
