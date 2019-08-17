package com.sebastiansoftwareengineer.barbershopresourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountAuth {

    @GetMapping(value = "/public")
    public String testingPublicEndpoint() {
        return "This is public";
    }

    @GetMapping(value = "/private")
    public String testingPrivateEndpoint() {
        return "This is private dude";
    }
}
