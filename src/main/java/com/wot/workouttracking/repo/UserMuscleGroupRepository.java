package com.wot.workouttracking.repo;

import com.wot.workouttracking.dto.UserMuscleGroupDto;
import com.wot.workouttracking.entitiy.MuscleGroup;
import com.wot.workouttracking.entitiy.User;
import com.wot.workouttracking.entitiy.UserMuscleGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.TypedQuery;
import java.util.List;

public interface UserMuscleGroupRepository extends JpaRepository<UserMuscleGroup,Integer> {


UserMuscleGroup findUserMuscleGroupByUserIdAndMuscleGroupId(int userId, int muscleGroupId);

}
