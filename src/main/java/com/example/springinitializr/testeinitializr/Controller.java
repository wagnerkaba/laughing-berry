package com.example.springinitializr.testeinitializr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String mensagem() {
        return "Hello, this is Projeto Spring Boot Web.";
    }
}
