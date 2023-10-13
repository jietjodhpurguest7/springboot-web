package com.trng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/employeelist")
    public String getEmployeeList(Model model) {
        System.out.println("Called Employee List");
        return "employeelist";
    }
    @GetMapping("/studentlist")
    public String getStudentList(Model model) {
        System.out.println("Called Student list");
        return "studentlist";
    }
}
