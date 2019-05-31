package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HTML {
    @RequestMapping("/index.html")
    public String info() {
        return "index.html";
    }
}
