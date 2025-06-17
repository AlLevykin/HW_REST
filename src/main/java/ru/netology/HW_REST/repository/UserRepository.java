package ru.netology.HW_REST.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {

        if (!"ValidPassword_123".equals(password)) {
            throw new InvalidCredentials("Invalid credentials");
        }

        switch (user) {
            case "admin" -> {
                return List.of(new Authorities[]{Authorities.READ, Authorities.WRITE, Authorities.DELETE});
            }
            case "user" -> {
                return List.of(new Authorities[]{Authorities.READ, Authorities.WRITE});
            }
            case "guest" -> {
                return List.of(new Authorities[]{Authorities.READ});
            }
        }

        return new ArrayList<>();
    }
}
