package com.wot.workouttracking.service.impl;

import com.wot.workouttracking.dto.MuscleGroupDto;
import com.wot.workouttracking.entitiy.MuscleGroup;
import com.wot.workouttracking.repo.MuscleGroupRepository;
import com.wot.workouttracking.service.MuscleGroupService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MuscleGroupImpl implements MuscleGroupService {

    private final MuscleGroupRepository muscleGroupRepository;
    private final ModelMapper modelMapper;


    @Autowired
    public MuscleGroupImpl(MuscleGroupRepository muscleGroupRepository, ModelMapper modelMapper) {
        this.muscleGroupRepository = muscleGroupRepository;
        this.modelMapper=modelMapper;
    }


    @Override
    public List<MuscleGroupDto> getAll() {
        List<MuscleGroup> muscleGroups= muscleGroupRepository.findAll();
        List<MuscleGroupDto>muscleGroupDtos=muscleGroups.stream().map(muscleGroup -> modelMapper.map(muscleGroup,MuscleGroupDto.class)).collect(Collectors.toList());
        return muscleGroupDtos;
    }

    @Override
    public MuscleGroupDto save(MuscleGroupDto muscleGroupDto) {

        MuscleGroup muscleGroup=modelMapper.map(muscleGroupDto,MuscleGroup.class);
        return modelMapper.map(muscleGroupRepository.save(muscleGroup), MuscleGroupDto.class);
    }
}
