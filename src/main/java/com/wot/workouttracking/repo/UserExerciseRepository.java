package com.wot.workouttracking.repo;

import com.wot.workouttracking.entitiy.UserExercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserExerciseRepository extends JpaRepository<UserExercise,Integer> {

    List<UserExercise> findUserExerciseByMuscleGroupIdAndUserIdAndFavorite(int muscleGroupId,int userId,Boolean favorite );

    List<UserExercise> findUserExerciseByMuscleGroupIdAndUserId(int muscleGroupId,int userId );



}
