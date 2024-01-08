package com.ebanking.ClientService.Repository;

import com.ebanking.ClientService.entity.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorseRepo extends JpaRepository<CourseModel,Long> {
}
