package com.example.backendnfc.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Entity
@Data
@NoArgsConstructor
public class Officier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String username;
    @NotBlank
    private String password;


    @OneToMany(mappedBy = "vehicule" , cascade = CascadeType.ALL)
    private List<Controler_c> controler_cs;


}
