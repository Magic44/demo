package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @auther XXX
 * @data 2023/3/18
 * @apiNote
 */

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/")
    public String hello(){
        return "Hello World";
    }

    @ResponseBody
    @RequestMapping("/2")
    public String hello2(){
        return "Hello World2";
    }

}
