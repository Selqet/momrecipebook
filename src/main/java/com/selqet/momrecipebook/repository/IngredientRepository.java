package com.selqet.momrecipebook.repository;

import com.selqet.momrecipebook.entity.IngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IngredientRepository extends JpaRepository<IngredientEntity, Long> {

}
