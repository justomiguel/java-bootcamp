/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.service;

import com.bootcamp.domain.Student;
import java.util.List;

/**
 *
 * @author Santiago
 */
public interface StudentService {
    public Student save(Student s);
    public List<Student> findAll();
}
