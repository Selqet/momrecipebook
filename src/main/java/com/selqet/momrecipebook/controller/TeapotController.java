package com.selqet.momrecipebook.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teapot")
public class TeapotController {

    @GetMapping
    public ResponseEntity<Object> teapot() {
        return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
    }
}
