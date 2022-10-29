package com.wot.workouttracking.controller;

import com.wot.workouttracking.dto.UserWorkoutDayDto;
import com.wot.workouttracking.dto.WorkOutDayMuscleGroupDto;
import com.wot.workouttracking.service.WorkOutDayMuscleGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wodMuscle")
public class WorkOutDayMuscleGroup {

    private final WorkOutDayMuscleGroupService workOutDayMuscleGroupService;

    @Autowired
    public WorkOutDayMuscleGroup(WorkOutDayMuscleGroupService workOutDayMuscleGroupService) {
        this.workOutDayMuscleGroupService = workOutDayMuscleGroupService;
    }

    @PostMapping("/save")
    public ResponseEntity<WorkOutDayMuscleGroupDto> save(@RequestBody WorkOutDayMuscleGroupDto workOutDayMuscleGroupDto){
        return ResponseEntity.ok(workOutDayMuscleGroupService.save(workOutDayMuscleGroupDto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<WorkOutDayMuscleGroupDto>> getAll(){
        return ResponseEntity.ok(workOutDayMuscleGroupService.getAll());
    }
}
