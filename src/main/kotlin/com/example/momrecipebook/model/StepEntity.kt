package com.example.momrecipebook.model

import java.time.LocalTime
import javax.persistence.*

@Entity
@Table(name = "recstep")
data class StepEntity(
    @Id
    @SequenceGenerator(name="recstep_step_id_seq",
        sequenceName="recstep_step_id_seq",
        allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
        generator="recstep_step_id_seq")
    @Column(name = "step_id", updatable = false)
    var id: Long,

    @Column(name = "step_index")
    var index: Short,

    @Column(name = "step_descr")
    var description: String,

    @Column(name = "step_time")
    var time: LocalTime?,

    @ManyToOne
    @JoinColumn(name = "rec_id")
    var recipe: RecipeEntity,
)
