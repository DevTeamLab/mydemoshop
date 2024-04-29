package com.devteamlab.mydemoshop.service;

import com.devteamlab.mydemoshop.repository.UserRepository;
import com.devteamlab.mydemoshop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("User not found with id " + id));
    }

    public User createRandomUser() {
        User user = new User();
        user.setId(new Random().nextLong());
        user.setName("Name" + new Random().nextInt());
        user.setLastName("Lastname" + new Random().nextInt());
        user.setAge(new Random().nextInt(100));
        user.setEmail("email" + new Random().nextInt() + "@mail.com");

        return userRepository.save(user);
    }
}
