package com.wot.workouttracking.controller;

import com.wot.workouttracking.dto.WorkOutDayExerciseDto;
import com.wot.workouttracking.dto.WorkOutDayExerciseSetDto;
import com.wot.workouttracking.service.WorkOutDayExerciseSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wodExerciseSet")
public class WorkOutDayExerciseSetController {
    private WorkOutDayExerciseSetService workOutDayExerciseSetService;

    @Autowired
    public WorkOutDayExerciseSetController(WorkOutDayExerciseSetService workOutDayExerciseSetService) {
        this.workOutDayExerciseSetService = workOutDayExerciseSetService;
    }

    @PostMapping("/save")
    public ResponseEntity<WorkOutDayExerciseSetDto> save(@RequestBody WorkOutDayExerciseSetDto workOutDayExerciseSetDto){
        return ResponseEntity.ok(workOutDayExerciseSetService.save(workOutDayExerciseSetDto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<WorkOutDayExerciseSetDto>> getAll(){
        return ResponseEntity.ok(workOutDayExerciseSetService.getAll());
    }
}
