package Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
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
