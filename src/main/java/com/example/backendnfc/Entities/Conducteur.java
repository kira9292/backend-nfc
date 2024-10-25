package com.example.backendnfc.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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
