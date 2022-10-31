package com.wot.workouttracking.service;

import com.wot.workouttracking.dto.WorkOutDayExerciseDto;
import com.wot.workouttracking.dto.WorkOutDayMuscleGroupDto;

import java.util.List;

public interface WorkOutDayExerciseService {

    List<WorkOutDayExerciseDto> getAll();
    WorkOutDayExerciseDto save(WorkOutDayExerciseDto workOutDayExerciseDto);
}
