package com.example.backendnfc.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Conducteur {

    @Id
    private String id;
    private String nom;
    private String telephone;

    @ManyToOne
    private Vehicule vehicule;

    @OneToMany(mappedBy = "conducteur", cascade = CascadeType.ALL)
    private List<Controler_c> Controler_c;
}
