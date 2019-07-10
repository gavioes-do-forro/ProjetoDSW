package com.github.gavioesdoforro.universirides.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class RestControllerExample {

    @RequestMapping
    String login() {
        return("Login method called");
    }

    @GetMapping("/logout")
    String logout() {
        return("Logout method called");
    }
}
