package com.example.momrecipebook.model

import javax.persistence.*

@Entity
@Table(name = "ingredient")
data class IngredientEntity(
    @Id
    @SequenceGenerator(name="ingredient_ingr_id_seq",
        sequenceName="ingredient_ingr_id_seq",
        allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
        generator="ingredient_ingr_id_seq")
    @Column(name = "ingr_id", updatable = false)
    var id: Long,

    @Column(name = "ingr_name")
    var name: String,

    @Column(name = "calories")
    var calories: Short?
)
