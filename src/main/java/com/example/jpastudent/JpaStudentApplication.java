package com.example.jpastudent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaStudentApplication {

    public static final Logger logger = LoggerFactory.getLogger(JpaStudentApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(JpaStudentApplication.class, args);
        logger.info("Application started");
    }

}
