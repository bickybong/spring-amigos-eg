package com.bicky.learnspringboot.repo;

import com.bicky.learnspringboot.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Long> {
}
