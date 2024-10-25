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
public class Infraction {

    @Id
    private String id;
    private String type;
    private LocalDate date;
    private Double montant;

    @ManyToOne
    private Conducteur conducteur;
}
