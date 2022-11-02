package com.wot.workouttracking.service.impl;

import com.wot.workouttracking.dto.BodyMeasurmentsDto;
import com.wot.workouttracking.dto.UserExerciseDto;
import com.wot.workouttracking.entitiy.BodyMeasurements;
import com.wot.workouttracking.entitiy.UserExercise;
import com.wot.workouttracking.repo.BodyMeasurmentsRepository;
import com.wot.workouttracking.service.BodyMeasurmentsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BodyMeasurmentsImpl implements BodyMeasurmentsService {
    private BodyMeasurmentsRepository bodyMeasurmentsRepository;
    private ModelMapper modelMapper;

    @Autowired
    public BodyMeasurmentsImpl(BodyMeasurmentsRepository bodyMeasurmentsRepository, ModelMapper modelMapper) {
        this.bodyMeasurmentsRepository = bodyMeasurmentsRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public BodyMeasurmentsDto save(BodyMeasurmentsDto bodyMeasurmentsDto) {
        BodyMeasurements bodyMeasurements=modelMapper.map(bodyMeasurmentsDto,BodyMeasurements.class);
        return modelMapper.map(bodyMeasurmentsRepository.save(bodyMeasurements),BodyMeasurmentsDto.class);
    }

    @Override
    public List<BodyMeasurmentsDto> getAll() {
        List<BodyMeasurements> bodyMeasurments=bodyMeasurmentsRepository.findAll();
        List<BodyMeasurmentsDto>bodyMeasurmentsDtos=bodyMeasurments.stream().map(userExercise -> modelMapper.map(userExercise,BodyMeasurmentsDto.class)).collect(Collectors.toList());
        return bodyMeasurmentsDtos;
    }
}
