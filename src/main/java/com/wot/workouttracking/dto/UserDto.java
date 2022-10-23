package com.wot.workouttracking.dto;

import com.wot.workouttracking.entitiy.UserWorkoutDay;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data
public class UserDto {
    private int id;
    private String email;
   // private String password;
    private String user_name;
    private int age;
    private List<UserWorkoutDay> userWorkoutDays;
}
