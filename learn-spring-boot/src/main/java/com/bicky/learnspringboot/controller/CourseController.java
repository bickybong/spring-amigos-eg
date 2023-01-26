package com.bicky.learnspringboot.controller;

import com.bicky.learnspringboot.bean.Course;
import com.bicky.learnspringboot.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    private CourseRepo courseRepo;

    //    http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    //    http://localhost:8080/courses/1
//    GET - Go to a resource (/courses/1)
    @GetMapping("/courses/{id}")
    public Course getCourses(@PathVariable long id) {
        Optional<Course> course = courseRepo.findById(id);
        if (course.isEmpty()) {
            throw new RuntimeException("Course not found with id " + id);
        }
        return course.get();
    }

    //    POST - Create a new resource (/courses)
    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course) {
        courseRepo.save(course);
    }

    //    PUT - update/replace a resource (/courses/1)
    @PutMapping("/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable long id) {
        courseRepo.save(course);
    }

    //    DELETE - Delete a resource (/courses/1)
    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id) {
        courseRepo.deleteById(id);
    }

//    docker run --detach
//    --env MYSQL_ROOT_PASSWORD=dummypassword
//    --env MYSQL_USER=courses-user
//    --env MYSQL_PASSWORD=dummycourses
//    --env MYSQL_DATABASE=courses
//    --name mysql --publish 3306:3306 mysql:5.7
}
