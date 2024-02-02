package com.example.jwtauthentication.dto;

import com.example.jwtauthentication.model.Role;
import lombok.Builder;

import java.util.Set;


@Builder
public record CreateUserRequest(
        String name,
        String username,
        String password,
        Long salary,
        String town,
        String city,
        Set<Role> authorities
){
}
