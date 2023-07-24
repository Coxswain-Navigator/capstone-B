package com.valencia.edfform.Repository;

import com.valencia.edfform.Models.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepo extends JpaRepository<Application, Long> {
    Application findByStudentVid(String studentVid);
}
