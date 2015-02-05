/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.service.impl;

import com.bootcamp.domain.Student;
import com.bootcamp.repository.StudentRepository;
import com.bootcamp.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StudentServiceImp implements StudentService{
    
    @Autowired
    private StudentRepository repo;
    
    @Override
    @Transactional
    public Student save(Student s) {      
       return   repo.save(s);        
    }
    
    @Override
    @Transactional
    public List<Student> findAll() {
        return repo.findAll();
    }
    
    public StudentServiceImp(StudentRepository rep){
        this.repo = rep;
    }
    public StudentServiceImp(){}
}
