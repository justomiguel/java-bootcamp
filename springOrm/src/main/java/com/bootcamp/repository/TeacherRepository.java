
package com.bootcamp.repository;

import com.bootcamp.domain.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, Long>{
    
}
