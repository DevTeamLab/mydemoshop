package com.devteamlab.mydemoshop.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Users")
public class User {

    @Id
    private String id;
    private String name;
    private String lastName;
    private Integer age;
    private String email;

}
