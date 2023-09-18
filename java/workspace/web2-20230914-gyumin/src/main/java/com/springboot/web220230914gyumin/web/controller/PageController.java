package com.springboot.web220230914gyumin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @GetMapping("/index")
    public String index() {
        return "hello";
    }
    @GetMapping("/login/username")
    public String username() {
        return "username";
    }

//    @ResponseBody
//    @GetMapping("api/v1/username")
//    public String getUsername() {
//        return "gildong";
//    }

}
