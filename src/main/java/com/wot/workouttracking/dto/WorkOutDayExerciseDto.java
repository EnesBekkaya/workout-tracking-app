package com.wot.workouttracking.dto;

import com.wot.workouttracking.entitiy.WorkOutDayExerciseSet;
import com.wot.workouttracking.entitiy.WorkOutDayMuscleGroup;
import lombok.Data;

import java.util.List;

@Data
public class WorkOutDayExerciseDto {
    private int id;

    private int repretision;

    private int set;

    private WorkOutDayMuscleGroup workOutDayMuscleGroup;

    //private List<WorkOutDayExerciseSet> workOutDayExerciseSets;
}
