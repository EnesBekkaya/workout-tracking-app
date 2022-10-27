package com.wot.workouttracking.controller;

import com.wot.workouttracking.dto.MuscleGroupDto;
import com.wot.workouttracking.dto.UserMuscleGroupDto;
import com.wot.workouttracking.service.UserMuscleGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userMuscle")
@CrossOrigin
public class UserMuscleGroupController {

    private UserMuscleGroupService userMuscleGroupService;

    @Autowired
    public UserMuscleGroupController(UserMuscleGroupService userMuscleGroupService) {
        this.userMuscleGroupService = userMuscleGroupService;
    }

    @PutMapping ("/save")
    public ResponseEntity<UserMuscleGroupDto> save(@RequestParam int userId,@RequestParam int muscleGroupId,@RequestBody UserMuscleGroupDto userMuscleGroupDto){
        return ResponseEntity.ok(userMuscleGroupService.findUserMuscleGroupByUserIdAndMuscleGroupId(userId,muscleGroupId,userMuscleGroupDto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<UserMuscleGroupDto>> getAll(){
        return ResponseEntity.ok(userMuscleGroupService.getAll());
    }


}
