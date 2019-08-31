package com.lukmie.cats.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(CatNotFoundException.class)
    public ResponseEntity handleCatNotFoundException() {
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(OwnerNotFoundException.class)
    public ResponseEntity handleOwnerNotFoundException() {
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

}
