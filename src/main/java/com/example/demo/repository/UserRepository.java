package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;


@Repository
public class UserRepository {
    public User save(User user) {
        return user;
    }
}
