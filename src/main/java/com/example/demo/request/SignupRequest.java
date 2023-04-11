package com.example.demo.request;

import com.example.demo.model.ERole;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class SignupRequest {

    private String username;
    private String email;
    private List<ERole> roles;
    private String password;
    private String phoneNo;

    public List<ERole> getRoles() {
        return roles;
    }

    public void setRoles(List<ERole> roles) {
        this.roles = roles;
    }






















//    @NotBlank
//    @Size(min = 3, max = 20)
//    private String username;
//
//    @NotBlank
//    @Size(max = 50)
//    @Email
//    private String email;
//
//    private Set<String> roles;
//
//    @NotBlank
//    @Size(min = 6, max = 40)
//    private String password;
//
//    public String getUsername() {
//        return username;
//    }
//    public void setUsername(String username) {
//
//        this.username = username;
//    }
//
//    public String getEmail() {
//
//        return email;
//    }
//
//    public void setEmail(String email) {
//
//        this.email = email;
//    }
//
//    public String getPassword() {
//
//        return password;
//    }
//
//    public void setPassword(String password) {
//
//        this.password = password;
//    }
//
//    public Set<String> getRoles() {
//        return
//                this.roles;
//    }
//
//    public void setRole(Set<String> roles) {
//
//        this.roles = roles;
//    }
//
//    public void getPhoneNo() {
//    }
}
