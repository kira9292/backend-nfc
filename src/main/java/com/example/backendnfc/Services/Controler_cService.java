package com.example.backendnfc.Services;

import com.example.backendnfc.Entities.Controler_c;
import com.example.backendnfc.Repositories.Controler_cRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Controler_cService {

    @Autowired
    private Controler_cRepository controler_cRepository;

    public Controler_c save(Controler_c controler) {
        return controler_cRepository.save(controler);
    }
}
