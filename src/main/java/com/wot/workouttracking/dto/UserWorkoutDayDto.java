package com.wot.workouttracking.dto;

import com.wot.workouttracking.entitiy.User;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

public class UserWorkoutDayDto {
    private int id;
    private Date workout_date;
    private User user;
}
