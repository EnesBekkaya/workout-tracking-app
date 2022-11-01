package com.wot.workouttracking.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="work_out_day_exercise_sets")
public class WorkOutDayExerciseSet {
    @Id
    @SequenceGenerator(name = "seq_work_out_day_exercise_sets",allocationSize = 1)
    @GeneratedValue(generator = "seq_work_out_day_exercise_sets",strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "weight")
    private double  weight;

    @ManyToOne
    @JoinColumn(name="work_out_day_exercise_id")
    private WorkOutDayExercise workOutDayExercise;
}
