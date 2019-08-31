package com.lukmie.cats.controller;

import com.lukmie.cats.model.Cat;
import com.lukmie.cats.model.CreateCatRequest;
import com.lukmie.cats.service.CatManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cats")
public class CatController {

    private CatManager catManager;

    public CatController(CatManager catManager) {
        this.catManager = catManager;
    }

    @GetMapping
    public ResponseEntity<List<Cat>> getCats() {
        List<Cat> cats = catManager.getCats();
        return new ResponseEntity<>(cats, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createCat(@RequestBody CreateCatRequest catRequest) {
        catManager.saveCat(catRequest);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
