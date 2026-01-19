package com.example.demo.controller;
import com.example.demo.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class home {
    @GetMapping("/about")
    public ArrayList<StudentModel> getStudent() {
        StudentModel student = new StudentModel(1, "Mahak", "mahakg2005@gmail.com");

        ArrayList<StudentModel> list = new ArrayList<>();
        list.add(new StudentModel(1, "Mahak", "sajko"));
        list.add(new StudentModel(2, "Shagun", "qwsb"));
        list.add(new StudentModel(3, "Suhani", "njsb"));
        list.add(new StudentModel(4, "Shreya", "bsjk"));
        list.add(new StudentModel(5, "Riya", "swvd"));
        return list;
    }


}
