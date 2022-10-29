package com.wot.workouttracking.service;

import com.wot.workouttracking.dto.WorkOutDayMuscleGroupDto;

import java.util.List;

public interface WorkOutDayMuscleGroupService {

    List<WorkOutDayMuscleGroupDto> getAll();
    WorkOutDayMuscleGroupDto save(WorkOutDayMuscleGroupDto workOutDayMuscleGroupDto);
}
