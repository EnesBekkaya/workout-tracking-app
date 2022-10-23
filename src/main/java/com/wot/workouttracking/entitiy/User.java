package com.wot.workouttracking.entitiy;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="users")
public class User {
    @Id
    @SequenceGenerator(name = "seq_user",allocationSize = 1)
    @GeneratedValue(generator = "seq_user",strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(length = 200,name = "email")
    private String email;

    @Column(length = 100,name = "password")
    private String password;

    @Column(length = 100,name = "user_name")
    private String user_name;

    @Column(name = "age")
    private int age;

    @OneToMany(mappedBy = "user")
    private List<UserWorkoutDay> userWorkoutDays;

    @OneToMany(mappedBy = "user")
    private List<UserExercise> userExercises;
}
