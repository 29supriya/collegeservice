package com.example.CollegeService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.example.CollegeService.Entity.College;

@RestController
public interface CollegeRepository extends JpaRepository<College,Integer>{

}
