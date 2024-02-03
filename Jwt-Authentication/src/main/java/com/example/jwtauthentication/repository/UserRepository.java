package com.example.jwtauthentication.repository;

import com.example.jwtauthentication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String userName);

    List<User> findUsersByCity(String city);

}
