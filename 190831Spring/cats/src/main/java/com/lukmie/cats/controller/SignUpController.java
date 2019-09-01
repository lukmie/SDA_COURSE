package com.lukmie.cats.controller;

import com.lukmie.cats.model.SignUpRequest;
import com.lukmie.cats.service.EmailSender;
import com.lukmie.cats.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class SignUpController {
    @Autowired
    private UserService userService;

    @Autowired
    private EmailSender emailSender;

    @PostMapping
    public ResponseEntity register(@RequestBody SignUpRequest signUpRequest) {
        userService.createUser(signUpRequest);
        emailSender.sendMail("javagda23mail@gmail.com",
                "[Luk] Account created",
                "Account has been created for: " + signUpRequest.getLogin());
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
