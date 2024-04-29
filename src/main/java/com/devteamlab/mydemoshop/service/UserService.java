package com.devteamlab.mydemoshop.service;

import com.devteamlab.mydemoshop.repository.UserRepository;
import com.devteamlab.mydemoshop.model.User;
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
