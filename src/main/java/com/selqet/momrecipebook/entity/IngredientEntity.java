package com.selqet.momrecipebook.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(schema = "public", name = "ingredient")
public class IngredientEntity {

    //TODO Read about columnDefinition
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ingredient_generator")
    @SequenceGenerator(name = "ingredient_generator", sequenceName = "ingredient_ingr_id_seq", allocationSize = 1)
    @Column(name = "ingr_id")
    private Long id;

    @Column(name = "ingr_name")
    private String title;

    @Column(name = "calories")
    private Short calories;

    public IngredientEntity() {
    }

    public IngredientEntity(Long id, String title, Short calories) {

        this.id = id;
        this.title = title;
        this.calories = calories;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Short getCalories() {
        return calories;
    }

    public void setCalories(Short calories) {
        this.calories = calories;
    }
}
