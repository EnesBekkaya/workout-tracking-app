package com.wot.workouttracking.service.impl;

import com.wot.workouttracking.dto.UserWorkoutDayDto;
import com.wot.workouttracking.dto.WorkOutDayMuscleGroupDto;
import com.wot.workouttracking.entitiy.UserWorkoutDay;
import com.wot.workouttracking.entitiy.WorkOutDayMuscleGroup;
import com.wot.workouttracking.repo.WorkOutDayMuscleGroupRepository;
import com.wot.workouttracking.service.WorkOutDayMuscleGroupService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkOutDayMuscleGroupImpl implements WorkOutDayMuscleGroupService {

    private WorkOutDayMuscleGroupRepository workOutDayMuscleGroupRepository;
    private ModelMapper modelMapper;

    @Autowired
    public WorkOutDayMuscleGroupImpl(WorkOutDayMuscleGroupRepository workOutDayMuscleGroupRepository,ModelMapper modelMapper) {
        this.workOutDayMuscleGroupRepository = workOutDayMuscleGroupRepository;
        this.modelMapper=modelMapper;
    }

    @Override
    public List<WorkOutDayMuscleGroupDto> getAll() {
        List<WorkOutDayMuscleGroup> workOutDayMuscleGroups=workOutDayMuscleGroupRepository.findAll();
        List<WorkOutDayMuscleGroupDto> workOutDayMuscleGroupDtos=workOutDayMuscleGroups.stream().map(userDto ->modelMapper.map(userDto,WorkOutDayMuscleGroupDto.class)).collect(Collectors.toList());
        return workOutDayMuscleGroupDtos;
    }

    @Override
    public WorkOutDayMuscleGroupDto save(WorkOutDayMuscleGroupDto workOutDayMuscleGroupDto) {
        WorkOutDayMuscleGroup workOutDayMuscleGroup=modelMapper.map(workOutDayMuscleGroupDto,WorkOutDayMuscleGroup.class);
        return modelMapper.map(workOutDayMuscleGroupRepository.save(workOutDayMuscleGroup), WorkOutDayMuscleGroupDto.class);

    }
}
