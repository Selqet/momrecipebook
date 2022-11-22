package com.example.momrecipebook

import com.example.momrecipebook.datasource.IngredientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MomrecipebookApplication

fun main(args: Array<String>) {
    runApplication<MomrecipebookApplication>(*args)
}
