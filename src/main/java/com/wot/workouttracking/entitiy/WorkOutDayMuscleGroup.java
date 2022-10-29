package com.wot.workouttracking.entitiy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="work_out_day_muscle_groups")
public class WorkOutDayMuscleGroup {
    @Id
    @SequenceGenerator(name = "seq_work_out_day_muscle_groups",allocationSize = 1)
    @GeneratedValue(generator = "seq_work_out_day_muscle_groups",strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="user_workout_day_id")
    private UserWorkoutDay userWorkoutDay;

    @ManyToOne
    @JoinColumn(name="muscle_groups_id")
    private MuscleGroup muscleGroup;

    @JsonIgnore
    @OneToMany(mappedBy = "workOutDayMuscleGroup",cascade = CascadeType.REMOVE)
    private List<WorkOutDayExercise> workOutDayExercises;


}

