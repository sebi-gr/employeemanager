package com.example.employeemanager.service;

import com.example.employeemanager.model.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    //repo etc..
    private static final String EXISTING_USERNAME = "user";
    private PasswordEncoder encoder;

    public Optional<User> findByUsername(String username) {
        //MOVE THIS TO A DATABASE

        if (!EXISTING_USERNAME.equalsIgnoreCase(username)) return Optional.empty();

        User user = new User();
        user.setId(1L);
        user.setUsername(EXISTING_USERNAME);
        user.setPassword("$2a$12$XiTRbWDtIrWnyuVJtEHxYOXh6wRkEVdFeYT/UFgeiudS4fDijd4m2"); //pass
        user.setRole("ADMIN");

        return Optional.of(user);
    }
}
