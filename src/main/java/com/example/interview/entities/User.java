package com.example.interview.entities;


import javax.persistence.Entity;

@Entity
public class User {
    String username;
    String role;
    Company company;
}
