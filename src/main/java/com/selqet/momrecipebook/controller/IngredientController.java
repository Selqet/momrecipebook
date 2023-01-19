package com.selqet.momrecipebook.controller;

import com.selqet.momrecipebook.entity.IngredientEntity;
import com.selqet.momrecipebook.model.IngredientDto;
import com.selqet.momrecipebook.repository.IngredientRepository;
import com.selqet.momrecipebook.service.impl.IngredientServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//TODO Check every method for exceptions

@RestController
@RequestMapping("/ingredients")
public class IngredientController {
    private IngredientServiceImpl ingredientService;

    public IngredientController(IngredientServiceImpl ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<IngredientDto>> getAllIngredients() {
        List<IngredientDto> allIngredients = ingredientService.getAllIngredients();
        return new ResponseEntity<>(allIngredients, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Object> addIngredient(@RequestBody IngredientDto ingredient) {
        ingredientService.addIngredient(ingredient);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteIngredient(@PathVariable Long id) {
        ingredientService.deleteIngredient(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    //TODO !!!Already exists exception
    @PutMapping("/update/{id}")
    public ResponseEntity<Object> updateIngredient(@PathVariable Long id, @RequestBody IngredientDto ingredient) {
        ingredientService.updateIngredient(id, ingredient);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
