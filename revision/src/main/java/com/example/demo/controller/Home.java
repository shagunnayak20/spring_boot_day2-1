package com.example.demo.controller;

import com.example.demo.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Home {
    @GetMapping("/about")
    public ArrayList<StudentModel> getStudent(){
        StudentModel s=new StudentModel();
        ArrayList<StudentModel> a=new ArrayList<>();
        a.add(new StudentModel(1,"Shagun","shagun.gmail.com"));
        a.add(new StudentModel(2,"Mahak","Mahak.gmail.com"));
        a.add(new StudentModel(3,"Shreya","shreya.gmail.com"));
        a.add(new StudentModel(4,"gunajn","gunjan.gmail.com"));
        a.add(new StudentModel(5,"suhani","shuhani.gmail.com"));
        return a;
    }
}
