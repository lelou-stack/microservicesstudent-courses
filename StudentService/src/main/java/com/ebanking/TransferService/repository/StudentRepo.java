package com.ebanking.TransferService.repository;

import com.ebanking.TransferService.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student,Long> {

}
