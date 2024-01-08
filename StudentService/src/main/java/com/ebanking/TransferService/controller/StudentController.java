package com.ebanking.TransferService.controller;

import com.ebanking.TransferService.model.TransferRequest;
import com.ebanking.TransferService.model.TransferResponse;
import com.ebanking.TransferService.repository.StudentRepo;
import com.ebanking.TransferService.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {

    private final StudentRepo studentRepo;

    @Autowired
    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @PostMapping("/initiate")
    public ResponseEntity<Student> addstudent(@RequestBody StudentRequest studentRequest) throws IOException {

        return ResponseEntity.ok(studentRepo.save(studentRequest));
    }

    @GetMapping("/getStudents")
    public List<Student> getSStudents() {

        return studentRepo.findAll();
    }


}