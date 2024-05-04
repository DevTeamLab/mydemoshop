package com.devteamlab.mydemoshop.domain.service;

import com.devteamlab.mydemoshop.domain.model.User;
import com.devteamlab.mydemoshop.repository.UserRepository;
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
