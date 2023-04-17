package com.example.demo.model;

import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "roles")
public class Role {
    private String id;
    private ERole name;
    public Role() {
    }
    public Role(ERole name) {
        this.name = name;
    }
}




