package com.example.backendnfc.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Assurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateExpiration;

    @OneToOne(mappedBy = "assurance")
    private Vehicule vehicule;
}
