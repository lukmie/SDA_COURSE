package com.sda.catmvc.controller;

import com.sda.catmvc.model.Cat;
import com.sda.catmvc.service.CatManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping("/cats")
public class CatController {

    private CatManager catManager;

    public CatController(CatManager catManager) {
        this.catManager = catManager;
    }

    @GetMapping
    public String catView(Model model) {
        List<Cat> cats = catManager.getCats();
        model.addAttribute("cats", cats);
        return "cats";
    }

    @GetMapping("/add")
    public String addCatView() {
        return "add";
    }

    @PostMapping
    public String addCat(Cat cat) {
        catManager.saveCat(cat);
        return "redirect:cats";
    }

    @PostMapping("/delete/{id}")
    public RedirectView deleteCat(@PathVariable Long id) {
        catManager.deleteCat(id);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/cats");
//        return "redirect:/cats";
        return redirectView;
    }

    @GetMapping("/update/{id}")
    public String updateCatView(Model model, @PathVariable Long id) {
        model.addAttribute("cat", catManager.getCat(id));
        return "updatecat";
    }


    @PostMapping("/update/{aa}")
    public String saveCat(@PathVariable("aa") Long aa, Cat cat) {
        catManager.updateCat(aa, cat);
        return "redirect:/cats";
    }
}
