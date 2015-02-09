
package com.bootcamp.service;

import com.bootcamp.domain.Student;

public interface StudentService {
    public Student save(Student s);
    public Iterable<Student> findAll();
    public Iterable<Student> findAllStudentsByCourse(Long idcourse);
}
