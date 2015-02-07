
package com.bootcamp.service;

import com.bootcamp.domain.Teacher;

public interface TeacherService {
    public Teacher save(Teacher t);
    public Iterable<Teacher> findAll();
}
