package com.bootcamp;

import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeetingsSpringBootApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(MeetingsSpringBootApplication.class, args);
        
    }
}
