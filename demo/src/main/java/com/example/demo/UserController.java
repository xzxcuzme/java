package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController

public class UserController {

    //private static final int id = 1;
    //private static final String FIO = "B";
    //private static final String phone = "99999";
    @RequestMapping("/get_user")
    //@GetMapping
    public User getUser() {
        return new User(11, "B", "999999");
    }
}

