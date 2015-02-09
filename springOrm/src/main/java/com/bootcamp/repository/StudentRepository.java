
package com.bootcamp.repository;

import com.bootcamp.domain.Student;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long>{
    
    @Query("Select s from Student s, Notes n where n.idCourse = ?1 and n.idStudent = s.idStudent")
    List<Student> findAllStudentsByCourse(Long courseid);
}
