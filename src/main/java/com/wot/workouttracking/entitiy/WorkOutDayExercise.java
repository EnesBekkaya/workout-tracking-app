package com.wot.workouttracking.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Workout_day_exercise")
public class WorkOutDayExercise {

    @Id
    @SequenceGenerator(name = "seq_Workout_day_exerciseser",allocationSize = 1)
    @GeneratedValue(generator = "seq_Workout_day_exercise",strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "repretision")
    private int repretision;

    @Column(name = "set")
    private int set;

    @ManyToOne
    @JoinColumn(name="work_out_day_muscle_groups_id")
    private WorkOutDayMuscleGroup workOutDayMuscleGroup;

    @OneToMany(mappedBy = "workOutDayExercise",cascade = CascadeType.REMOVE)
    private List<WorkOutDayExerciseSet> workOutDayExerciseSets;
}
