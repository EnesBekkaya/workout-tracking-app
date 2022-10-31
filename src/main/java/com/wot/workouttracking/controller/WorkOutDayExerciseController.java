package com.wot.workouttracking.controller;

import com.wot.workouttracking.dto.WorkOutDayExerciseDto;
import com.wot.workouttracking.dto.WorkOutDayMuscleGroupDto;
import com.wot.workouttracking.entitiy.WorkOutDayExercise;
import com.wot.workouttracking.service.WorkOutDayExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wodExercise")
public class WorkOutDayExerciseController {
    private WorkOutDayExerciseService workOutDayExerciseService;

    @Autowired
    public WorkOutDayExerciseController(WorkOutDayExerciseService workOutDayExerciseService) {
        this.workOutDayExerciseService = workOutDayExerciseService;
    }

    @PostMapping("/save")
    public ResponseEntity<WorkOutDayExerciseDto> save(@RequestBody WorkOutDayExerciseDto workOutDayExerciseDto){
        return ResponseEntity.ok(workOutDayExerciseService.save(workOutDayExerciseDto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<WorkOutDayExerciseDto>> getAll(){
        return ResponseEntity.ok(workOutDayExerciseService.getAll());
    }
}

