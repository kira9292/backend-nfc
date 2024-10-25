package com.example.backendnfc.DTOs;
import com.example.backendnfc.Entities.Vehicule;
import com.example.backendnfc.Entities.CarteCrise;
import com.example.backendnfc.Entities.Assurance;
import com.example.backendnfc.Entities.Conducteur;
import com.example.backendnfc.Entities.Infraction;
import com.example.backendnfc.Entities.Controler_c;
import lombok.Data;

import java.util.List;


@Data
public class EnregistrementRequestDto {
    private Vehicule vehicule;
    private CarteCrise carteCrise;
    private Assurance assurance;
    private Conducteur conducteur;
    private List<Infraction> infractions; // Une liste d'infractions
    private Controler_c controler; // Détails du contrôle
}