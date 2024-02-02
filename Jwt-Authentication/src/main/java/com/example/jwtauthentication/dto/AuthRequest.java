package com.example.jwtauthentication.dto;

public record AuthRequest (
        String username,
        String password
){
}
