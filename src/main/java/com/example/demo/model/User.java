package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Data
@Document(collection = "users")
@NoArgsConstructor
public class User {

    @Id
    //TODO: Get generated ID
    private String id;
    @NotBlank
    private String username;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String phoneNo;

    @DBRef
    private List<ERole> roles = new ArrayList<>();
    public User(String username, String email, String password, List<ERole> roles, String phoneNo) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.phoneNo = phoneNo;
    }
}
