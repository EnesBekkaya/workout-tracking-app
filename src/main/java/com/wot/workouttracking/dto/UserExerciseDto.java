package com.wot.workouttracking.dto;

import com.wot.workouttracking.entitiy.MuscleGroup;
import com.wot.workouttracking.entitiy.User;
import lombok.Data;

@Data
public class UserExerciseDto {
    private int id;

    private String title;

    private Boolean favorite;

   // private User user;

    private MuscleGroup muscleGroup;
}
