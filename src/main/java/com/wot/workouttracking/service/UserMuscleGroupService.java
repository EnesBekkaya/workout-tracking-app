package com.wot.workouttracking.service;

import com.wot.workouttracking.dto.MuscleGroupDto;
import com.wot.workouttracking.dto.UserMuscleGroupDto;
import com.wot.workouttracking.entitiy.UserMuscleGroup;

import java.util.List;

public interface UserMuscleGroupService {

     List<UserMuscleGroupDto> getAll();
     UserMuscleGroupDto save(UserMuscleGroupDto userMuscleGroupDto);

     UserMuscleGroupDto findUserMuscleGroupByUserIdAndMuscleGroupId(int userId,int muscleGroupId,UserMuscleGroupDto userMuscleGroupDto);





}
