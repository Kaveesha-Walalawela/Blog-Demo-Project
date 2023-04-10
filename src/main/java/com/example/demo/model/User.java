package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
@Data
@Document(collection = "users")
@NoArgsConstructor
public class User {

    @Id
    //TODO: Get generated ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @NotBlank
    @Column
    private String username;
    @NotBlank
    @Email
    @Column
    private String email;
    @NotBlank
    @Column
    private String password;
    @NotBlank
    @Column
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


//----------------------------------------------

//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Column
//    private String userName;
//    @Column
//    private String password;
//    @Column
//    private String email;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//}
