package com.bootcamp;

import com.bootcamp.domain.Course;
import com.bootcamp.domain.Student;
import com.bootcamp.repository.CourseRepository;
import com.bootcamp.repository.StudentRepository;
import com.bootcamp.service.impl.CourseServiceImp;
import com.bootcamp.service.impl.StudentServiceImp;
import java.text.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Application {

    public static void main(String[] args) throws ParseException {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
        StudentRepository repository = context.getBean(StudentRepository.class);
        CourseRepository repositoryCourse = context.getBean(CourseRepository.class);
        
        CourseServiceImp courseService = new CourseServiceImp(repositoryCourse);      
        StudentServiceImp studentService = new StudentServiceImp(repository);  
        
        long x = 5L;
        Iterable<Course> courses = courseService.findCoursesByStudent(x);
        
        for (Course course: courses){
            System.out.println(course);
        }
        
        long y = 1L;
        Iterable<Student> students = studentService.findAllStudentsByCourse(y);
        
        for (Student student: students){
            System.out.println(student);
        }

    }
    
}
