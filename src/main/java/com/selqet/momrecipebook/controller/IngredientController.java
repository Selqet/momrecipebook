package com.selqet.momrecipebook.controller;

import com.selqet.momrecipebook.model.IngredientDto;
import com.selqet.momrecipebook.service.impl.IngredientServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {
    private IngredientServiceImpl ingredientService;

    public IngredientController(IngredientServiceImpl ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/all")
    public List<IngredientDto> getAllIngredients() {
        List<IngredientDto> ingredients = ingredientService.getAllIngredients();
        return  ingredients;
    }
}
