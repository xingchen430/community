package com.xingcheng.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class indexController {

    @GetMapping("/")
    public String index(@RequestParam(name = "name" ,defaultValue = "string")String name){
        return name;
    }
}
