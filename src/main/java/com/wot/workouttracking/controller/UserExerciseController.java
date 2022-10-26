package com.wot.workouttracking.controller;

import com.wot.workouttracking.dto.UserDto;
import com.wot.workouttracking.dto.UserExerciseDto;
import com.wot.workouttracking.service.UserExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercise")
public class UserExerciseController {
    private UserExerciseService userExerciseService;

    @Autowired
    public UserExerciseController(UserExerciseService userExerciseService) {
        this.userExerciseService = userExerciseService;
    }

    @GetMapping("/getFavorite")
    public ResponseEntity<List<UserExerciseDto>> getByMuscleGroupIdAndFavorite(@RequestParam(value = "id",required = true) int muscleGroupId,@RequestParam int userId){
        return ResponseEntity.ok(userExerciseService.findUserExerciseByMuscleGroupIdAndUserIdAndFavorite(muscleGroupId,userId,true));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<UserExerciseDto>> getAll(@RequestParam(value = "id",required = true) int muscleGroupId,@RequestParam int userId ){
        return ResponseEntity.ok(userExerciseService.getAll(muscleGroupId,userId));
    }

    @PostMapping("/add")
    public ResponseEntity<UserExerciseDto> save(@RequestBody UserExerciseDto userExerciseDto){

        return ResponseEntity.ok(userExerciseService.add(userExerciseDto));
    }

}

