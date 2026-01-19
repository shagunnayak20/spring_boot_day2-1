package com.example.demo.controller;

import com.example.demo.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("/about")
    public StudentModel getStudent(){
        StudentModel s=new StudentModel(1,"shagun","shagun.gmail.com");
        return s;
    }
}
