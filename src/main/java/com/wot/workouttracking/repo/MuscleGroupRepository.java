package com.wot.workouttracking.repo;

import com.wot.workouttracking.entitiy.MuscleGroup;
import com.wot.workouttracking.entitiy.UserMuscleGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MuscleGroupRepository extends JpaRepository<MuscleGroup,Integer> {




}
