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
public class Vehicule {

    @Id
    private String id;
    private String proprietaire;

    @OneToOne(mappedBy = "vehicule")
    private CarteCrise carteCrise;

    @OneToMany(mappedBy = "vehicule")
    private List<Conducteur> conducteurs;

    @OneToOne
    private Assurance assurance;

    @OneToOne
    private VisiteTechnique visiteTechnique;



}
