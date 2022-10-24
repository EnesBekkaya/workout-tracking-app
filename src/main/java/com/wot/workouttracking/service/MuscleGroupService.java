package com.wot.workouttracking.service;

import com.wot.workouttracking.dto.MuscleGroupDto;

import java.util.List;

public interface MuscleGroupService {
     List<MuscleGroupDto> getAll();
     MuscleGroupDto save(MuscleGroupDto muscleGroupDto);


}
