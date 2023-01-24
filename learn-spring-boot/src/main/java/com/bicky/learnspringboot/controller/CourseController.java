package com.bicky.learnspringboot.controller;

import com.bicky.learnspringboot.bean.Course;
import com.bicky.learnspringboot.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseRepo courseRepo;

//    http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return courseRepo.findAll();
    }
//    http://localhost:8080/courses/1
    @GetMapping("/courses/1")
    public Course getCourses(){
        return new Course(1, "Learn Microservices", "BickyBong");
    }
}
