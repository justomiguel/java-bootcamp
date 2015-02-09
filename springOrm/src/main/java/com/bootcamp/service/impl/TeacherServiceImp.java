
package com.bootcamp.service.impl;

import com.bootcamp.domain.Teacher;
import com.bootcamp.repository.TeacherRepository;
import com.bootcamp.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("teacherService")
@Transactional
public class TeacherServiceImp implements TeacherService{
    
    @Autowired
    private TeacherRepository repo;
    
    @Autowired
    public TeacherServiceImp(TeacherRepository teacherRepository){
        this.repo = teacherRepository;
    }

    @Override
    public Teacher save(Teacher t) {
        return this.repo.save(t);
    }

    @Override
    public Iterable<Teacher> findAll() {
        return this.repo.findAll();
    }
    
}
