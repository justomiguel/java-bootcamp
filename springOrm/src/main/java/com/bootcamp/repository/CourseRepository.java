
package com.bootcamp.repository;

import com.bootcamp.domain.Course;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,Long> {
    
    @Query("Select c from Course c, Notes n where c.idCourse = n.idCourse and n.idStudent = ?1")
    List<Course> findCoursesByStudent(Long studentid);
}
