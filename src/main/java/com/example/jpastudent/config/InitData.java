package com.example.jpastudent.config;

import com.example.jpastudent.model.Student;
import com.example.jpastudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {


        Student s1= new Student();
        s1.setName("John");
        s1.setBornDate(LocalDate.of(1990, 1, 1));
        s1.setBornTime(LocalTime.of(10, 10, 10));
        studentRepository.save(s1);

        Student yussy= new Student();
        yussy.setName("Yussy");
        yussy.setBornDate(LocalDate.of(1736, 8, 23));
        yussy.setBornTime(LocalTime.of(10, 10, 10));
        studentRepository.save(yussy);
    }
}