package com.example.jpastudent.controller;

import com.example.jpastudent.model.Student;
import com.example.jpastudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
public class StudentRestController {

@Autowired
    StudentRepository studentRepository;

@GetMapping("/students")
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    @GetMapping("/addstudent")
    public List<Student> addStudent(){
        Student s1= new Student();
        s1.setName("John");
        s1.setBornDate(LocalDate.now());
        s1.setBornTime(LocalTime.now());
        studentRepository.save(s1);


        return studentRepository.findAll();
    }

    @GetMapping("/students/{name}")
    public List<Student> getAllStudentByName(@PathVariable String name){
        return studentRepository.findAllByName(name);
    }

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char)i;
        return "unicode=" + i + " char=" + c;
    }

    @GetMapping("/char/{c}")
    public String charToUnicode(@PathVariable char c) {
        int i = c;
        return "char=" + c + " unicode=" + i;
    }
}
