package com.wot.workouttracking.repo;

import com.wot.workouttracking.entitiy.UserMuscleGroup;
import com.wot.workouttracking.entitiy.WorkOutDayMuscleGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkOutDayMuscleGroupRepository extends JpaRepository<WorkOutDayMuscleGroup,Integer> {
}
