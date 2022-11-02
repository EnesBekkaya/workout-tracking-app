package com.wot.workouttracking.controller;

import com.wot.workouttracking.dto.BodyMeasurmentsDto;
import com.wot.workouttracking.dto.MuscleGroupDto;
import com.wot.workouttracking.service.BodyMeasurmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/body")
public class BodyMeasurmentController {

    private BodyMeasurmentsService bodyMeasurmentsService;

    @Autowired
    public BodyMeasurmentController(BodyMeasurmentsService bodyMeasurmentsService) {
        this.bodyMeasurmentsService = bodyMeasurmentsService;
    }

    @PostMapping("/save")
    public ResponseEntity<BodyMeasurmentsDto> save(@RequestBody BodyMeasurmentsDto bodyMeasurmentsDto){
        return ResponseEntity.ok(bodyMeasurmentsService.save(bodyMeasurmentsDto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<BodyMeasurmentsDto>> getAll(){
        return ResponseEntity.ok(bodyMeasurmentsService.getAll());
    }
}
