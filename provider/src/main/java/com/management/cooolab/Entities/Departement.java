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
@XmlRootElement(name = "Departement")
@XmlAccessorType(XmlAccessType.FIELD)
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "departement", fetch = FetchType.EAGER)
    private Set<User> users = new HashSet<>();
}
