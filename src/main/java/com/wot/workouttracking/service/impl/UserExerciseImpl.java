package com.wot.workouttracking.service.impl;

import com.wot.workouttracking.dto.UserExerciseDto;
import com.wot.workouttracking.entitiy.UserExercise;
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

   /* @Override
    public List<UserExerciseDto> getByMuscleGroupIdAndFavoriteAndUserID(int muscleGroupId, Boolean favorite,int userId){
        List<UserExercise> userExercises=userExerciseRepository.getByMuscleGroupIdAndFavoriteAndUserID(muscleGroupId,favorite,userId);
        List<UserExerciseDto>userExerciseDtos=userExercises.stream().map(userExercise -> modelMapper.map(userExercise,UserExerciseDto.class)).collect(Collectors.toList());
        return userExerciseDtos;
    }*/

    @Override
    public UserExerciseDto save(UserExerciseDto userExerciseDto) {
        return null;
    }

    @Override
    public List<UserExerciseDto> findUserExerciseByMuscleGroupIdAndUserIdAndFavorite(int muscleGroupId, int userId, Boolean favorite){
        List<UserExercise> userExercises=userExerciseRepository. findUserExerciseByMuscleGroupIdAndUserIdAndFavorite(muscleGroupId,userId,favorite);
        List<UserExerciseDto>userExerciseDtos=userExercises.stream().map(userExercise -> modelMapper.map(userExercise,UserExerciseDto.class)).collect(Collectors.toList());
        return userExerciseDtos;
    }
}
