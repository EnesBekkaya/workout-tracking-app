package com.wot.workouttracking.entitiy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="user_exercise")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","muscleGroup","user"})

public class UserExercise {
    @Id
    @SequenceGenerator(name = "seq_user_exercise",allocationSize = 1)
    @GeneratedValue(generator = "seq_user_exercise",strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(length = 200,name = "title")
    private String title;

    @Column(name = "favorite")
    private Boolean favorite;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="muscle_groups_id")
    private MuscleGroup muscleGroup;
}
