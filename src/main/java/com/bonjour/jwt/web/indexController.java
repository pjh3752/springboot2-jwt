package com.bonjour.jwt.web;

import com.bonjour.jwt.service.TokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @Autowired
    TokenProvider tokenProvider;

    @GetMapping("/")
    public String index() {
        return "test";
    }
}
