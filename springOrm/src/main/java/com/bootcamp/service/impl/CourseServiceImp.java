
package com.bootcamp.service.impl;

import com.bootcamp.domain.Course;
import com.bootcamp.repository.CourseRepository;
import com.bootcamp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("courseService")
@Transactional
public class CourseServiceImp implements CourseService {
    
    @Autowired
    private final CourseRepository repo;
  
    
    @Autowired
    public CourseServiceImp (CourseRepository courseRepository ){
        this.repo = courseRepository;
    }
    
    
    @Override
    public Course save(Course c) {
        return this.repo.save(c);
    }

    @Override
    public Iterable<Course> findAll() {
       return this.repo.findAll();
    }

    @Override
    public Iterable<Course> findCoursesByStudent(Long studentid) {
        return this.repo.findCoursesByStudent(studentid);
    }   
}
