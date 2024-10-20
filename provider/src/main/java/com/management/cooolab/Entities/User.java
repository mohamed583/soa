package com.management.cooolab.Entities;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@XmlRootElement(name = "User")
@XmlAccessorType(XmlAccessType.FIELD)
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
