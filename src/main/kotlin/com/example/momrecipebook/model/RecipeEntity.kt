package com.example.momrecipebook.model

import java.time.LocalTime
import javax.persistence.*

@Entity
@Table(name = "recipe")
data class RecipeEntity(
    @Id
    @SequenceGenerator(name="recipe_rec_id_seq",
        sequenceName="recipe_rec_id_seq",
        allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
        generator="recipe_rec_id_seq")
    @Column(name = "rec_id", updatable = false)
    var id: Long,

    @Column(name = "title")
    var name: String,

    @Column(name = "time")
    var time: LocalTime?,

    @OneToMany(mappedBy = "recipe")
    var steps: MutableList<StepEntity> = mutableListOf(),
)