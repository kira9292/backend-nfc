package com.example.backendnfc.Services;

import com.example.backendnfc.Entities.Vehicule;
import com.example.backendnfc.Repositories.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VehiculeService {

    @Autowired
    private VehiculeRepository vehiculeRepository;

    public Vehicule save(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }



}
