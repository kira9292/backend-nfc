package Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Infraction {

    @Id
    private String id;
    private String type;
    private Date date;
    private Double montant;

    @ManyToOne
    private Conducteur conducteur;
}
