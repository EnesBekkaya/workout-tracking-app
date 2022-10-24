package com.wot.workouttracking.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="user_workout_days")
public class UserWorkoutDay {
    @Id
    @SequenceGenerator(name = "seq_user_workout_days",allocationSize = 1)
    @GeneratedValue(generator = "seq_user_workout_days",strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(length = 200,name = "workout_date")
    private Date workout_date;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(mappedBy = "userWorkoutDay")
    private List<WorkOutDayMuscleGroups> workOutDayMuscleGroups;
}
