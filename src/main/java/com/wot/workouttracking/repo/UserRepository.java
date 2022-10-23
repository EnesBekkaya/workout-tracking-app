package com.wot.workouttracking.repo;

import com.wot.workouttracking.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
