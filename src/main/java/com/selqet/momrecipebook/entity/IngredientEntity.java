package com.selqet.momrecipebook.entity;

import lombok.Data;

import javax.persistence.*;

@Data
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
}
