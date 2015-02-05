package com.bootcamp;

import com.bootcamp.domain.Student;
import com.bootcamp.repository.StudentRepository;
import com.bootcamp.service.impl.StudentServiceImp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Application {

    public static void main(String[] args) throws ParseException {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
        StudentRepository repository = context.getBean(StudentRepository.class);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateInString = "1990-05-13";
        Date d = sdf.parse(dateInString);
        Student stu = new Student("miguel", "acosta", 2331451, d);       
        StudentServiceImp studentService = new StudentServiceImp(repository);     

       System.out.println(studentService.save(stu));
 
        Iterable<Student> students = studentService.findAll();
        for (Student student : students) {
            System.out.println(student);
        }

    }
    
    
}
