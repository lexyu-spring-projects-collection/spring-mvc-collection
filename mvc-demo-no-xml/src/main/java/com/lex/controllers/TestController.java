package com.lex.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : LEX_YU
 * @date : 2023/4/2
 */
@Controller
public class TestController {

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        System.out.println("test endpoint");
        return "Hi, it's working";
    }

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello endpoint");
        return "hello-world";
    }
}
