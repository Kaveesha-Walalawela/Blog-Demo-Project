package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
//@Setter
public enum ERole {

    ROLE_USER,
    ROLE_ADMIN;

   public static void setRoles(List<ERole> roles) {
    }
}
