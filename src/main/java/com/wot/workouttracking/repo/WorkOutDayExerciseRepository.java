package com.wot.workouttracking.repo;

import com.wot.workouttracking.entitiy.WorkOutDayExercise;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkOutDayExerciseRepository extends JpaRepository<WorkOutDayExercise, Integer> {
}
