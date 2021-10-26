package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/home")
public class HelloController {


    @GetMapping("/hello")
    @ResponseBody
    public String helloH() {
        return ("hello world");
    }

    @GetMapping("/capitalize/{text}")
    public String capitalize(@PathVariable String text){
        return "capitalize";
    }

    @GetMapping("/")
    public String splashPage() {
        return "splashPage";
    }

}
