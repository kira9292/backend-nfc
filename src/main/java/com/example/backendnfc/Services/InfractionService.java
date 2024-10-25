package com.example.backendnfc.Services;


import com.example.backendnfc.Entities.Infraction;
import com.example.backendnfc.Repositories.InfractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfractionService {

    @Autowired
    private InfractionRepository infractionRepository;

    public Infraction save(Infraction infraction) {
        return infractionRepository.save(infraction);
    }
}
