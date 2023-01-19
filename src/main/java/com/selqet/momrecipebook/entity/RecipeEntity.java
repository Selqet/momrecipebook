package com.selqet.momrecipebook.entity;

import lombok.Data;
import org.postgresql.util.PGInterval;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(schema = "public", name = "recipe")
public class RecipeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipe_generator")
    @SequenceGenerator(name = "recipe_generator", sequenceName = "recipe_rec_id_seq", allocationSize = 1)
    @Column(name = "rec_id")
    private Long id;

    //TODO Ask how to restrain to 255 symbols
    @Column(name = "title")
    private String title;

    @Column(name = "time")
    private PGInterval time;

    @OneToMany(mappedBy = "recipe")
    private List<RecipeStepEntity> recipeSteps;
}
