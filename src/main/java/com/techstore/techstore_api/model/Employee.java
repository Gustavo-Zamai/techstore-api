package com.techstore.techstore_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import com.techstore.techstore_api.model.Person;

@Setter
@Getter
@Entity
@Table(name = "employee")
public class Employee extends Person {
    
    private String password;

    private String role;

    private String access_level;

}
