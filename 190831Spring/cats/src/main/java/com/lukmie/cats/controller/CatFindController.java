package com.lukmie.cats.controller;

import com.lukmie.cats.model.Cat;
import com.lukmie.cats.repository.CatRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cats/find")
public class CatFindController {
    //powinnismy wstrzykiwac serwis a nie repozytorium
    private CatRepository catRepository;

    public CatFindController(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    //    http://localhost:9999/cats/find?name=Rys
    @GetMapping("/name")
    public ResponseEntity<List<Cat>> findCatsByName(@RequestParam("name") String catName) {
        List<Cat> cats = catRepository.findAllByName(catName);
        return new ResponseEntity<>(cats, HttpStatus.OK);
    }

    //    http://localhost:9999/cats/find?name=Rys&min=0&max=15
    @GetMapping("/name/tail")
    public ResponseEntity<List<Cat>> findCats(@RequestParam("name") String catName,
                                              @RequestParam("min") Integer min,
                                              @RequestParam("max") Integer max) {
        List<Cat> cats = catRepository.findCats(catName, min, max);
        return new ResponseEntity<>(cats, HttpStatus.OK);
    }
}