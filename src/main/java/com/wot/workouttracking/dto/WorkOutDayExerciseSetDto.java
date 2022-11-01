package com.wot.workouttracking.dto;

import com.wot.workouttracking.entitiy.WorkOutDayExercise;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class WorkOutDayExerciseSetDto {

    private int id;

    private double  weight;

    private WorkOutDayExercise workOutDayExercise;
}
