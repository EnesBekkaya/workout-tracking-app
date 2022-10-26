package com.wot.workouttracking.entitiy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Table(name="users")
@EqualsAndHashCode(of = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","userExercises","userWorkoutDays","userMuscleGroups","bodyMeasurements"})

public class User {
    @Id
    @SequenceGenerator(name = "seq_user",allocationSize = 1)
    @GeneratedValue(generator = "seq_user",strategy = GenerationType.IDENTITY)
    private int id;

    @JsonIgnore

    @Column(length = 200,name = "email")
    private String email;

    @JsonIgnore
    @Column(length = 100,name = "password")
    private String password;

    @JsonIgnore

    @Column(length = 100,name = "user_name")
    private String user_name;
    @JsonIgnore

    @Column(name = "age")
    private int age;

    @OneToMany(mappedBy = "user",cascade = CascadeType.REMOVE)
    private List<UserWorkoutDay> userWorkoutDays;

    @OneToMany(mappedBy = "user",cascade = CascadeType.REMOVE)
    private List<UserExercise> userExercises;

    @OneToMany(mappedBy = "user",cascade = CascadeType.REMOVE)
    private List<UserMuscleGroup> userMuscleGroups;

    @OneToOne(mappedBy = "user",cascade = CascadeType.REMOVE)
    @PrimaryKeyJoinColumn
    private BodyMeasurements bodyMeasurements;
}


