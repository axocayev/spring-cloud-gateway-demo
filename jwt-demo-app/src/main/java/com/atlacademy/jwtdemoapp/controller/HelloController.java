package com.atlacademy.jwtdemoapp.controller;

import com.atlacademy.jwtdemoapp.security.CurrentUser;
import com.atlacademy.jwtdemoapp.security.UserPrincipal;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class HelloController {
    @GetMapping("/hello")
    @PreAuthorize("hasRole('ADMIN')")
    public List<String> hello(){
       return List.of("Anar","Nihad","Yunus","Ferid");
    }

    @GetMapping("/world")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public List<String> world(@CurrentUser UserPrincipal userPrincipal){
        return List.of("Azerbaijan","Turkey","Russian","Chine",userPrincipal.getUsername());
    }
}
