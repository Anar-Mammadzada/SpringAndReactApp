package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;

    public Contact() {
    }

    public Contact(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }
}
