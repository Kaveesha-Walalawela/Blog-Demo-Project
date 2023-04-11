package com.example.demo.response;

import lombok.Data;

import java.util.List;

//@Component
//@Data
//@AllArgsConstructor (5 constructors are already defined)
//@NoArgsConstructor
@Data
public class JwtResponse {

//    private String password;
    private String token;
    private String type = "Bearer";
    private String id;
    private String username;
    private String email;
    private List<String> roles;
    private String phoneNo;



    /* used for sign in */
    public JwtResponse(String token, String id, String username, String email, String phoneNo, List<String> roles) {
        this.token = token;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
        this.phoneNo = phoneNo;
    }

    /* used for sign up */
    public JwtResponse(String id, String username, String email, String phoneNo) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phoneNo = phoneNo;
    }

//    public JwtResponse(String id, String password, String username, String email, String phoneNo) {
//        this.token = token;
//        this.id = id;
//        this.username = username;
//        this.email = email;
//        this.password = password;
//        this.roles = roles;
//        this.phoneNo = phoneNo;

    }

//    public String getAccessToken() {
//        return token;
//    }
//
//    public void setAccessToken(String accessToken) {
//        this.token = accessToken;
//    }
//
//    public String getTokenType() {
//        return type;
//    }
//
//    public void setTokenType(String tokenType) {
//        this.type = tokenType;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public List<String> getRoles() {
//        return roles;
//    }


