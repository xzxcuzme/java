package com.example.demo;

import org.springframework.web.bind.annotation.*;

class UserController {
    @RequestMapping("/get_user")
    public User getUser(){
        return new User(1, "B", "88888");
    }
}

