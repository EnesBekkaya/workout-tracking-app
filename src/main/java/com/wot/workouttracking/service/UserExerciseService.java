package com.wot.workouttracking.service;

import com.wot.workouttracking.dto.UserExerciseDto;
import com.wot.workouttracking.dto.UserMuscleGroupDto;
import com.wot.workouttracking.entitiy.UserExercise;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserExerciseService {

    //List<UserExerciseDto> getByMuscleGroupIdAndFavoriteAndUserID(int muscleGroupId,Boolean favorite ,int userId);

    UserExerciseDto save(UserExerciseDto userExerciseDto);

    List<UserExerciseDto> findUserExerciseByMuscleGroupIdAndUserIdAndFavorite(int muscleGroupId,int userId,Boolean favorite );
}
