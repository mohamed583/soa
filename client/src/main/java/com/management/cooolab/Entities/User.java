package com.management.cooolab.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;

    private boolean manager = false;

    private boolean hr = false;

    private String password;

    @ManyToOne
    private Departement departement;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DemandeConge> demandesConges = new HashSet<>();
}
