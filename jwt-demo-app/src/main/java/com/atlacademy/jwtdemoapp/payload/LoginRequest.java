package com.atlacademy.jwtdemoapp.payload;

import lombok.Data;

@Data
public class LoginRequest {

    private String usernameOrEmail;


    private String password;
}