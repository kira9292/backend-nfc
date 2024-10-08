package Entities;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class CarteCrise {

    @Id
    private String immatriculation;
    private String marque;
    private String modele;
    private String proprietaire;
    private String vitre;
    private Date dateDelivrance;

    @OneToOne
    private Vehicule vehicule;
}
