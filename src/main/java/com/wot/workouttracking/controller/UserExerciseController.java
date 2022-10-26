package com.wot.workouttracking.controller;

import com.wot.workouttracking.dto.UserExerciseDto;
import com.wot.workouttracking.service.UserExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exercise")
public class UserExerciseController {
    private UserExerciseService userExerciseService;

    @Autowired
    public UserExerciseController(UserExerciseService userExerciseService) {
        this.userExerciseService = userExerciseService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<UserExerciseDto>> getByMuscleGroupIdAndFavorite(@RequestParam(value = "id",required = true) int muscleGroupId,@RequestParam int userId,@RequestParam Boolean favorite ){
        return ResponseEntity.ok(userExerciseService.findUserExerciseByMuscleGroupIdAndUserIdAndFavorite(muscleGroupId,userId,favorite));
    }
}

