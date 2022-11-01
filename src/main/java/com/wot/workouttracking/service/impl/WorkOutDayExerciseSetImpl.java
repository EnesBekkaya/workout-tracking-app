package com.wot.workouttracking.service.impl;

import com.wot.workouttracking.dto.WorkOutDayExerciseSetDto;
import com.wot.workouttracking.entitiy.WorkOutDayExerciseSet;
import com.wot.workouttracking.repo.WorkOutDayExerciseSetRepository;
import com.wot.workouttracking.service.WorkOutDayExerciseSetService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class WorkOutDayExerciseSetImpl implements WorkOutDayExerciseSetService {

    
    private WorkOutDayExerciseSetRepository workOutDayExerciseSetRepository;
    private ModelMapper modelMapper;

    @Autowired
    public WorkOutDayExerciseSetImpl( WorkOutDayExerciseSetRepository workOutDayExerciseSetRepository, ModelMapper modelMapper) {
        this.workOutDayExerciseSetRepository = workOutDayExerciseSetRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<WorkOutDayExerciseSetDto> getAll() {
        List<WorkOutDayExerciseSet> workOutDayExerciseSets=workOutDayExerciseSetRepository.findAll();
        List<WorkOutDayExerciseSetDto> workOutDayExerciseSetDtos=workOutDayExerciseSets.stream().map(userDto ->modelMapper.map(userDto,WorkOutDayExerciseSetDto.class)).collect(Collectors.toList());
        return workOutDayExerciseSetDtos;
    }

    @Override
    public WorkOutDayExerciseSetDto save(WorkOutDayExerciseSetDto workOutDayExerciseSetDto) {
        WorkOutDayExerciseSet workOutDayExerciseSet=modelMapper.map(workOutDayExerciseSetDto,WorkOutDayExerciseSet.class);
        return modelMapper.map(workOutDayExerciseSetRepository.save(workOutDayExerciseSet), WorkOutDayExerciseSetDto.class);
    }
}
