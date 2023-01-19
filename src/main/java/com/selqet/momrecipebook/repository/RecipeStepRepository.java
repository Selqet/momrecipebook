package com.selqet.momrecipebook.repository;

import com.selqet.momrecipebook.entity.RecipeStepEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeStepRepository extends JpaRepository<RecipeStepEntity, Long> {
}
