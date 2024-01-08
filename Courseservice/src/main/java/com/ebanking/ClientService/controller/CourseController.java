package com.ebanking.ClientService.controller;


import com.example.courses.Model.CourseModel;
import com.example.courses.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepo courseRepo;

    @GetMapping("/courses")
    public ResponseEntity<List<CourseModel>> getAllTutorials(@RequestParam(required = false) String title) {
        try {
            List<CourseModel> courses = new ArrayList<CourseModel>();

            courses = courseRepo.findAll();
            return new ResponseEntity<>(courses, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
