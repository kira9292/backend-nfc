package com.example.backendnfc.Services;

import com.example.backendnfc.Entities.Assurance;
import com.example.backendnfc.Repositories.AssuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssuranceService {

    @Autowired
    private AssuranceRepository assuranceRepository;

    public Assurance save(Assurance assurance) {
        return assuranceRepository.save(assurance);
    }
}
