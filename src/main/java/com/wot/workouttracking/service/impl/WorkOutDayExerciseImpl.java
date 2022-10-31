package com.wot.workouttracking.service.impl;

import com.wot.workouttracking.dto.WorkOutDayExerciseDto;
import com.wot.workouttracking.dto.WorkOutDayMuscleGroupDto;
import com.wot.workouttracking.entitiy.WorkOutDayExercise;
import com.wot.workouttracking.entitiy.WorkOutDayMuscleGroup;
import com.wot.workouttracking.repo.WorkOutDayExerciseRepository;
import com.wot.workouttracking.service.WorkOutDayExerciseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service

public class WorkOutDayExerciseImpl implements WorkOutDayExerciseService {
    private WorkOutDayExerciseRepository workOutDayExerciseRepository;

    private ModelMapper modelMapper;

    @Autowired
    public WorkOutDayExerciseImpl(WorkOutDayExerciseRepository workOutDayExerciseRepository, ModelMapper modelMapper) {
        this.workOutDayExerciseRepository = workOutDayExerciseRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<WorkOutDayExerciseDto> getAll() {
        List<WorkOutDayExercise> workOutDayExercises=workOutDayExerciseRepository.findAll();
        List<WorkOutDayExerciseDto> workOutDayMuscleGroupDtos=workOutDayExercises.stream().map(userDto ->modelMapper.map(userDto,WorkOutDayExerciseDto.class)).collect(Collectors.toList());
        return workOutDayMuscleGroupDtos;
    }

    @Override
    public WorkOutDayExerciseDto save(WorkOutDayExerciseDto workOutDayExerciseDto) {
        WorkOutDayExercise workOutDayExercise=modelMapper.map(workOutDayExerciseDto,WorkOutDayExercise.class);
        return modelMapper.map(workOutDayExerciseRepository.save(workOutDayExercise), WorkOutDayExerciseDto.class);
    }
}
