package com.selqet.momrecipebook.service.impl;

import com.selqet.momrecipebook.entity.RecipeEntity;
import com.selqet.momrecipebook.entity.RecipeStepEntity;
import com.selqet.momrecipebook.mapper.RecipeMapper;
import com.selqet.momrecipebook.mapper.RecipeStepMapper;
import com.selqet.momrecipebook.model.RecipeDto;
import com.selqet.momrecipebook.model.RecipeStepDto;
import com.selqet.momrecipebook.repository.RecipeRepository;
import com.selqet.momrecipebook.repository.RecipeStepRepository;
import com.selqet.momrecipebook.service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//TODO Divide services?
//TODO REFACTOR ASAP
@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;
    private final RecipeMapper recipeMapper;
    private final RecipeStepRepository recipeStepRepository;
    private final RecipeStepMapper recipeStepMapper;

    public RecipeServiceImpl(RecipeRepository recipeRepository, RecipeMapper recipeMapper, RecipeStepRepository recipeStepRepository, RecipeStepMapper recipeStepMapper) {
        this.recipeRepository = recipeRepository;
        this.recipeMapper = recipeMapper;
        this.recipeStepRepository = recipeStepRepository;
        this.recipeStepMapper = recipeStepMapper;
    }

    public List<RecipeDto> getAllRecipes() {
        List<RecipeEntity> recipeEntities = recipeRepository.findAll();
        List<RecipeDto> recipeDtos = new ArrayList<>();

        for (RecipeEntity recipe : recipeEntities) {
            List<RecipeStepDto> recipeStepDtos = new ArrayList<>();

            List<RecipeStepEntity> recipeSteps = recipe.getRecipeSteps();
            for (RecipeStepEntity recipeStep : recipeSteps) {
                recipeStepDtos.add(toDtoStepAutoMapping(recipeStep));
            }
            recipeDtos.add(toDtoStepAutoMapping(recipe, recipeStepDtos));
        }
        return recipeDtos;
    }

    private RecipeDto toDtoStepAutoMapping(RecipeEntity recipe, List<RecipeStepDto> recipeSteps) {
        return recipeMapper.toDto(recipe, recipeSteps);
    }

    private RecipeStepDto toDtoStepAutoMapping(RecipeStepEntity recipeStep) {
        return recipeStepMapper.toDto(recipeStep);
    }
}
