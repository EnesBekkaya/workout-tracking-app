package com.wot.workouttracking.service;

import com.wot.workouttracking.dto.BodyMeasurmentsDto;
import com.wot.workouttracking.dto.UserDto;

import java.util.List;

public interface BodyMeasurmentsService {
    public BodyMeasurmentsDto save(BodyMeasurmentsDto bodyMeasurmentsDto);
    //public void delete(int id);
    public List<BodyMeasurmentsDto> getAll();
}
