package com.example.helloword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
@RequestMapping("/test")
public class TestController {

//    @RequestMapping("/index")
//    @ResponseBody
//    public String index() {
//        return "helloword666";
//    }

    //@RequestMapping("/index")
    public ModelAndView index(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;

    }

    @RequestMapping("/index")
    public String index2(){
        return "index";
    }

}
