package com.wot.workouttracking.entitiy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="muscle_groups")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","userExercises","userMuscleGroups","workOutDayMuscleGroups"})

@EqualsAndHashCode(of = "id")
public class MuscleGroup {
    @Id
    @SequenceGenerator(name = "seq_muscle_groups",allocationSize = 1)
    @GeneratedValue(generator = "seq_muscle_groups",strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 200,name ="title")
    private String title;

    @OneToMany(mappedBy = "muscleGroup")
    private List<UserExercise> userExercises;

    @OneToMany(mappedBy = "muscleGroup")
    private List<UserMuscleGroup> userMuscleGroups;

    @OneToMany(mappedBy = "muscleGroup")
    private List<WorkOutDayMuscleGroups> workOutDayMuscleGroups;
}
