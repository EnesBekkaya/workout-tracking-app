package com.wot.workouttracking.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wot.workouttracking.entitiy.MuscleGroup;
import com.wot.workouttracking.entitiy.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserMuscleGroupDto {

    private int id;
   private Boolean active;
    private MuscleGroup muscleGroup;
    private User user;

}
