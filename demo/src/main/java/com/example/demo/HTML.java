package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller

public class HTML {
    @GetMapping("/info.html")
    public String info() {
        return "info.html";
    }
}
