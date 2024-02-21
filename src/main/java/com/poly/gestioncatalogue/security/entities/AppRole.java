package com.poly.gestioncatalogue.security.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AppRole {
    @Id
    private String id;
    private String role;
}
