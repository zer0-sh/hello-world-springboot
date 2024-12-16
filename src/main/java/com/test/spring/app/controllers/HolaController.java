package com.test.spring.app.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@RestController

public class HolaController {
    @GetMapping("/")
    String hola() {
        return "Hola Mundo jeje";
    }
    @GetMapping("/despedida")
    String chao() {
        return "Chao Mundo jeje";
    }
    @RequestMapping("*")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFound() {
        return "Error 404: Recurso no encontrado";
    }
    
    
}
