package Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Officier {

    @Id
    private String id;
    private String nom;
    private String prenom;


    @OneToMany(mappedBy = "vehicule" , cascade = CascadeType.ALL)
    private List<Controler_c> controler_cs;

}
