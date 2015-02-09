
package com.bootcamp.service.impl;

import com.bootcamp.domain.Student;
import com.bootcamp.repository.StudentRepository;
import com.bootcamp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component("studentService")
@Transactional
public class StudentServiceImp implements StudentService{
    
    @Autowired
    private final StudentRepository repo;
    
    @Autowired
    public StudentServiceImp (StudentRepository studentrepository){
        this.repo = studentrepository;
    }
    
    @Override
    public Student save(Student s) {  
         return repo.save(s);                  
    }
    
    @Override
    public Iterable<Student> findAll() {
        return repo.findAll();
    }

    @Override
    public Iterable<Student> findAllStudentsByCourse(Long idcourse) {
        return this.repo.findAllStudentsByCourse(idcourse);
    }

}
