package com.sda.catmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {

//    @GetMapping
//    public String hello(Model model) {
//        model.addAttribute("name", "Lukasz");
//        return "hello";
//    }

//    http://localhost:8080/hello/luke
//    @GetMapping("/{ourName}")
//    public String hello(Model model, @PathVariable("ourName") String ourName) {
//        model.addAttribute("name", ourName);
//        return "hello";
//    }

//    http://localhost:8080/hello?ourName=luk
    @GetMapping
    public String helloRequestParam(Model model, @RequestParam(value = "ourName", required = false) String ourName) {
        if (ourName != null && !ourName.isEmpty()) {
            model.addAttribute("name", ourName);
        } else {
            model.addAttribute("name", "Annonymous");
        }
        return "hello";
    }

}
