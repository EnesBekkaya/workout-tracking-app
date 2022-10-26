package com.wot.workouttracking.service.impl;

import com.wot.workouttracking.dto.UserExerciseDto;
import com.wot.workouttracking.dto.UserMuscleGroupDto;
import com.wot.workouttracking.entitiy.UserExercise;
import com.wot.workouttracking.entitiy.UserMuscleGroup;
import com.wot.workouttracking.repo.UserExerciseRepository;
import com.wot.workouttracking.service.UserExerciseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserExerciseImpl implements UserExerciseService {

    private UserExerciseRepository userExerciseRepository;
    private ModelMapper modelMapper;

    @Autowired
    public UserExerciseImpl(UserExerciseRepository userExerciseRepository, ModelMapper modelMapper) {
        this.userExerciseRepository = userExerciseRepository;
        this.modelMapper = modelMapper;
    }




    @Override
    public List<UserExerciseDto> findUserExerciseByMuscleGroupIdAndUserIdAndFavorite(int muscleGroupId, int userId, Boolean favorite){
        List<UserExercise> userExercises=userExerciseRepository. findUserExerciseByMuscleGroupIdAndUserIdAndFavorite(muscleGroupId,userId,favorite);
        List<UserExerciseDto>userExerciseDtos=userExercises.stream().map(userExercise -> modelMapper.map(userExercise,UserExerciseDto.class)).collect(Collectors.toList());
        return userExerciseDtos;
    }

    @Override
    public List<UserExerciseDto> getAll(int muscleGroupId,int userId){
        List<UserExercise> userExercises=userExerciseRepository. findUserExerciseByMuscleGroupIdAndUserId(muscleGroupId,userId);
        List<UserExerciseDto>userExerciseDtos=userExercises.stream().map(userExercise -> modelMapper.map(userExercise,UserExerciseDto.class)).collect(Collectors.toList());
        return userExerciseDtos;
    }
    @Override
   public UserExerciseDto add(UserExerciseDto userExerciseDto){
        UserExercise userExercise=modelMapper.map(userExerciseDto,UserExercise.class);
        return modelMapper.map(userExerciseRepository.save(userExercise),UserExerciseDto.class);
    }


}
