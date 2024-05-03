package com.devteamlab.mydemoshop.repository;

import com.devteamlab.mydemoshop.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
