package com.example.backendnfc.Entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarteCrise {

    @Id
    private String immatriculation;
    private String marque;
    private String modele;
    private String proprietaire;
    private String vitre;
    private LocalDate dateDelivrance;

    @OneToOne
    private Vehicule vehicule;
}
