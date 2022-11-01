package com.wot.workouttracking.repo;

import com.wot.workouttracking.entitiy.WorkOutDayExerciseSet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkOutDayExerciseSetRepository extends JpaRepository<WorkOutDayExerciseSet,Integer> {
}
