package com.wot.workouttracking.service;

import com.wot.workouttracking.dto.UserDto;

import java.util.List;

public interface UserService {
    public UserDto save(UserDto userDto);
    //public void delete(int id);
    public List<UserDto> getAll();

}
