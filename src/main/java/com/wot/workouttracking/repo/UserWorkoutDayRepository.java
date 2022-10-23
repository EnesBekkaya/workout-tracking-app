package com.wot.workouttracking.repo;

import com.wot.workouttracking.entitiy.UserWorkoutDay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserWorkoutDayRepository extends JpaRepository<UserWorkoutDay,Integer> {
}
