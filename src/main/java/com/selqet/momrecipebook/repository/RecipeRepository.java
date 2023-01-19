package com.selqet.momrecipebook.repository;

import com.selqet.momrecipebook.entity.RecipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<RecipeEntity, Long> {
}
