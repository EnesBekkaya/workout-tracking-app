package com.wot.workouttracking.controller;

import com.wot.workouttracking.dto.MuscleGroupDto;
import com.wot.workouttracking.service.MuscleGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/muscle")
@CrossOrigin
public class MuscleGroupController {
    private MuscleGroupService muscleGroupService;
    @Autowired
    public MuscleGroupController(MuscleGroupService muscleGroupService) {
        this.muscleGroupService = muscleGroupService;
    }

    @PostMapping("/save")
    public ResponseEntity<MuscleGroupDto> save(@RequestBody MuscleGroupDto muscleGroupDto){
        return ResponseEntity.ok(muscleGroupService.save(muscleGroupDto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<MuscleGroupDto>> getAll(){
        return ResponseEntity.ok(muscleGroupService.getAll());
    }
}
