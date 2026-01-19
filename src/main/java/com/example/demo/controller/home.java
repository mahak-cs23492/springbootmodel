package com.example.demo.controller;
import com.example.demo.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
    @GetMapping("/about")
    public StudentModel getStudent(){
        StudentModel student=new StudentModel(1,"Mahak","mahakg2005@gmail.com");
        return student;

    }

}
