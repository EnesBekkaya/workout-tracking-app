package com.wot.workouttracking.dto;

import com.wot.workouttracking.entitiy.UserWorkoutDay;
import lombok.Data;



@Data
public class UserDto {
    private int id;
    private String email;
    private String password;
    private String user_name;
    private int age;

}
