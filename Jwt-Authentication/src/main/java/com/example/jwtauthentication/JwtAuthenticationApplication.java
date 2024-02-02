package com.example.jwtauthentication;

import com.example.jwtauthentication.model.Role;
import com.example.jwtauthentication.dto.CreateUserRequest;
import com.example.jwtauthentication.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class JwtAuthenticationApplication implements CommandLineRunner {

    private final UserService userService;

    public JwtAuthenticationApplication(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(JwtAuthenticationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        createDummyData();
    }

    private void createDummyData() {
        CreateUserRequest request = CreateUserRequest.builder()
                .name("Burak Önce")
                .username("burakonce")
                .password("123456")
                .authorities(Set.of(Role.ROLE_ADMIN))
                .build();
        userService.createUser(request);
    }
}
