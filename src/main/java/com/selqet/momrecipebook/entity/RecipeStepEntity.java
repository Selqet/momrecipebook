package com.selqet.momrecipebook.entity;

import lombok.Data;

import org.postgresql.util.PGInterval;
import javax.persistence.*;


@Data
@Entity
@Table(schema = "public", name = "recstep")
public class RecipeStepEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipestep_generator")
    @SequenceGenerator(name = "recipestep_generator", sequenceName = "recstep_recstep_id_seq", allocationSize = 1)
    @Column(name = "recstep_id")
    private Long id;

    @Column(name = "step_index")
    private Short index;

    @Column(name = "step_descr")
    private String description;

    @Column(name = "step_time")
    private PGInterval time;

    @ManyToOne
    @JoinColumn(name = "rec_id", nullable = false)
    private RecipeEntity recipe;
}
