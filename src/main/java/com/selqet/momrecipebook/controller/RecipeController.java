package com.selqet.momrecipebook.controller;

import com.selqet.momrecipebook.model.RecipeDto;
import com.selqet.momrecipebook.service.impl.RecipeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//TODO Add final?

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    private RecipeServiceImpl recipeService;

    public RecipeController(RecipeServiceImpl recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<RecipeDto>> getAllRecipes() {
        List<RecipeDto> recipes =  recipeService.getAllRecipes();
        return new ResponseEntity<>(recipes, HttpStatus.OK);
    }
}
