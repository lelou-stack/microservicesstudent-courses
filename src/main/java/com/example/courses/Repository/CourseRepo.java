package com.example.courses.Repository;

import com.example.courses.Model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<CourseModel,Long> {
}
