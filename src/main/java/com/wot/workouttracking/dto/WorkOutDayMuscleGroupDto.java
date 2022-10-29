package com.wot.workouttracking.dto;

import com.wot.workouttracking.entitiy.MuscleGroup;
import com.wot.workouttracking.entitiy.UserWorkoutDay;
import com.wot.workouttracking.entitiy.WorkOutDayExercise;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
public class WorkOutDayMuscleGroupDto {

    private int id;

    //private Date workout_date;

    private UserWorkoutDay userWorkoutDay;

    private MuscleGroup muscleGroup;

    //private List<WorkOutDayExercise> workOutDayExercises;
}
