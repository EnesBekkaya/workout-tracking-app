package com.wot.workouttracking.service;

import com.wot.workouttracking.dto.UserExerciseDto;
import com.wot.workouttracking.dto.UserMuscleGroupDto;
import com.wot.workouttracking.entitiy.UserExercise;
import com.wot.workouttracking.entitiy.UserMuscleGroup;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserExerciseService {


    List<UserExerciseDto> findUserExerciseByMuscleGroupIdAndUserIdAndFavorite(int muscleGroupId,int userId,Boolean favorite );
    List<UserExerciseDto> getAll(int muscleGroupId,int userId);

    UserExerciseDto add(UserExerciseDto userExerciseDto);
}
