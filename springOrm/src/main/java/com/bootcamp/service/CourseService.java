
package com.bootcamp.service;

import com.bootcamp.domain.Course;

public interface CourseService {
    public Course save(Course c);
    public Iterable<Course> findAll();
    public Iterable<Course> findCoursesByStudent(Long studentid);
}
