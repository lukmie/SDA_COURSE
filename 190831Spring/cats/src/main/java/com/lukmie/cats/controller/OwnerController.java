package com.lukmie.cats.controller;

import com.lukmie.cats.model.CreateOwnerRequest;
import com.lukmie.cats.model.Owner;
import com.lukmie.cats.service.OwnerManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    private OwnerManager ownerManager;

    public OwnerController(OwnerManager ownerManager) {
        this.ownerManager = ownerManager;
    }

    @GetMapping
    public ResponseEntity<List<Owner>> getOwners() {
        return new ResponseEntity<>(ownerManager.getOwners(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createOwner(@RequestBody CreateOwnerRequest ownerRequest) {
        ownerManager.saveOwner(ownerRequest);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteOwner(@PathVariable("id") Long id) {
        ownerManager.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
