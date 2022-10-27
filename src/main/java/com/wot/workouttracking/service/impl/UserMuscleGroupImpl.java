package com.wot.workouttracking.service.impl;

import com.wot.workouttracking.controller.UserMuscleGroupController;
import com.wot.workouttracking.dto.UserDto;
import com.wot.workouttracking.dto.UserMuscleGroupDto;
import com.wot.workouttracking.entitiy.User;
import com.wot.workouttracking.entitiy.UserMuscleGroup;
import com.wot.workouttracking.repo.UserMuscleGroupRepository;
import com.wot.workouttracking.service.UserMuscleGroupService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserMuscleGroupImpl implements UserMuscleGroupService {

    private UserMuscleGroupRepository userMuscleGroupRepository;
    private ModelMapper modelMapper;

    @Autowired
    public UserMuscleGroupImpl(UserMuscleGroupRepository userMuscleGroupRepository,ModelMapper modelMapper) {
        this.userMuscleGroupRepository = userMuscleGroupRepository;
        this.modelMapper=modelMapper;
    }


    @Override
    public List<UserMuscleGroupDto> getAll() {

       List<UserMuscleGroup> userMuscleGroups=userMuscleGroupRepository.findAll();
        List<UserMuscleGroupDto>userMuscleGroupDtos=userMuscleGroups.stream().map(userMuscleGroup -> modelMapper.map(userMuscleGroup,UserMuscleGroupDto.class)).collect(Collectors.toList());
        return userMuscleGroupDtos;
    }

    @Override
    public UserMuscleGroupDto save(UserMuscleGroupDto userMuscleGroupDto) {
        UserMuscleGroup userMuscleGroup=modelMapper.map(userMuscleGroupDto,UserMuscleGroup.class);
        return modelMapper.map(userMuscleGroupRepository.save(userMuscleGroup),UserMuscleGroupDto.class);
    }

    @Override
      public UserMuscleGroupDto findUserMuscleGroupByUserIdAndMuscleGroupId(int userId,int muscleGroupId,UserMuscleGroupDto userMuscleGroupDto){
       UserMuscleGroup userMuscleGroup=userMuscleGroupRepository.findUserMuscleGroupByUserIdAndMuscleGroupId(userId,muscleGroupId);
        if(userMuscleGroup!=null){

            userMuscleGroup.setActive(true);
            userMuscleGroupRepository.save(userMuscleGroup);
        }
        else{
            save(userMuscleGroupDto);
        }

        return userMuscleGroupDto;
    }
}
