package com.sda.catmvc.controller;

import com.sda.catmvc.model.Numbers;
import com.sda.catmvc.service.CalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {

    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    //wyswietlamy widok
    @GetMapping
    public String calculatorView() {
        return "calculator";
    }

//    @PostMapping("/add")
//    public String calculator(Model model, @RequestParam Double first, @RequestParam Double second) {
//        model.addAttribute("result", calculatorService.add(first, second));
//        return "calculatorResult";
//    }

    @PostMapping("/add")
    public String calculatorAdd(Model model, Numbers numbers) {
        model.addAttribute("result", calculatorService.add(numbers.getFirst(), numbers.getSecond()));
        return "calculatorResult";
    }

    @PostMapping("/sub")
    public String calculatorSub(Model model, Numbers numbers) {
        model.addAttribute("result", calculatorService.sub(numbers.getFirst(), numbers.getSecond()));
        return "calculatorResult";
    }

    @PostMapping("/mul")
    public String calculatorMul(Model model, Numbers numbers) {
        model.addAttribute("result", calculatorService.mul(numbers.getFirst(), numbers.getSecond()));
        return "calculatorResult";
    }

    @PostMapping("/div")
    public String calculatorDiv(Model model, Numbers numbers) {
//        try{
//            model.addAttribute("result", calculatorService.div(numbers.getFirst(), numbers.getSecond()));
//        } catch (ArithmeticException e) {
//            model.addAttribute("result", "Number shouldn't be zero!");
//        }
        if (numbers.getSecond() == 0) {
            model.addAttribute("msg", "Number shouldn't be zero!");
            return "calculatorResult";
        }
        model.addAttribute("result", calculatorService.div(numbers.getFirst(), numbers.getSecond()));
        return "calculatorResult";
    }


}
