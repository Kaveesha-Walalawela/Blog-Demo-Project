package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/web")
public class WebController {

    @GetMapping("/home")
    public String getHome() {
        return "This is home page";
    }

    @GetMapping("/dashboard")
    public String getDashboard() {
        return "This is dashboard page";
    }

    @GetMapping("/manage")
    public String getManage() {
        return "This is manage page";
    }

}
