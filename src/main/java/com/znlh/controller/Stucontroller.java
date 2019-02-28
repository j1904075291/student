package com.znlh.controller;

import com.znlh.entity.Student;
import com.znlh.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class Stucontroller {

    @Autowired
    StuService stuService;

    @GetMapping("/select")
    public Student select(int id){
        return stuService.select(id);
    }
}
