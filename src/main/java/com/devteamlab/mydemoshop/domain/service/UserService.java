package com.devteamlab.mydemoshop.domain.service;

import com.devteamlab.mydemoshop.domain.model.User;
import com.devteamlab.mydemoshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(String id) {
        return userRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("User not found with id " + id));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public String createUser(User user) {
        var id = UUID.randomUUID().toString().split("-")[0];
        user.setId(id);
        userRepository.save(user);
        return "User with id: " + id + " is created. ";
    }

    public String deleteUser(String id) {
        userRepository.deleteById(id);
        return "User with id: " + id + " is deleted. ";
    }
}
