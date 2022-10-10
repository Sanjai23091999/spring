package com.example.demoBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ApplicationController {

   @ResponseBody
   @GetMapping("/hello")
    public String show(){
        return "hello";
    }

    @GetMapping("/welcome")
    public ModelAndView welcome(){

       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("welcome");
        System.out.println("ss");

        return modelAndView;
    }
}
