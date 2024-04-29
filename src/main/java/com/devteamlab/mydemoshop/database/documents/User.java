package com.devteamlab.mydemoshop.database.documents;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User {

    @Id
    private Long id;
    private String name;
    private String lastName;
    private Integer age;
    private String email;

}