package com.wot.workouttracking.repo;

import com.wot.workouttracking.entitiy.BodyMeasurements;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BodyMeasurmentsRepository extends JpaRepository<BodyMeasurements,Integer> {
}
