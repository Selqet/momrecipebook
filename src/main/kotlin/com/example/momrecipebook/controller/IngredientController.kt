package com.example.momrecipebook.controller

import com.example.momrecipebook.dto.IngredientDto
import com.example.momrecipebook.service.IngredientService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class IngredientController(
    private val service: IngredientService,
) {
    @GetMapping
    fun getAll(): List<IngredientDto> = service.getAll()

    @PostMapping
    fun create(@RequestBody dto: IngredientDto): Long = service.create(dto)

    @DeleteMapping("/{name}")
    fun delete(@PathVariable name: String) {
        service.deleteByName(name)
    }
}