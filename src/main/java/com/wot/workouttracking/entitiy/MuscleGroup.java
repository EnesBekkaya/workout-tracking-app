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
@Table(name="muscle_groups")
public class MuscleGroup {
    @Id
    @SequenceGenerator(name = "seq_muscle_groups",allocationSize = 1)
    @GeneratedValue(generator = "seq_muscle_groups",strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(length = 200,name ="title")
    private String title;

    @OneToMany(mappedBy = "muscleGroup")
    private List<UserExercise> userExercises;

    @OneToMany(mappedBy = "muscleGroup")
    private List<UserMuscleGroups> userMuscleGroups;

    @OneToMany(mappedBy = "muscleGroup")
    private List<WorkOutDayMuscleGroups> workOutDayMuscleGroups;



}
