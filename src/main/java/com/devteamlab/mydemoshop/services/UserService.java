package com.devteamlab.mydemoshop.services;

import com.devteamlab.mydemoshop.database.UserRepository;
import com.devteamlab.mydemoshop.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
