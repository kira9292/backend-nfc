package com.example.backendnfc.Services;


import com.example.backendnfc.Entities.Conducteur;
import com.example.backendnfc.Repositories.ConducteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConducteurService {
    @Autowired
    private ConducteurRepository conducteurRepository;

    public Conducteur save(Conducteur conducteur) {
        return conducteurRepository.save(conducteur);
    }
}
