package com.wot.workouttracking.service;

import com.wot.workouttracking.dto.WorkOutDayExerciseDto;
import com.wot.workouttracking.dto.WorkOutDayExerciseSetDto;

import java.util.List;

public interface WorkOutDayExerciseSetService {
    List<WorkOutDayExerciseSetDto> getAll();
    WorkOutDayExerciseSetDto save(WorkOutDayExerciseSetDto workOutDayExerciseSetDto);
}
