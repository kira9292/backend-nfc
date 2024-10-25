package com.example.backendnfc.Services;

import com.example.backendnfc.Entities.CarteCrise;
import com.example.backendnfc.Repositories.CarteCriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarteCriseService {

    @Autowired
    private CarteCriseRepository carteCriseRepository;

    public CarteCrise save(CarteCrise carteCrise) {
        return carteCriseRepository.save(carteCrise);
    }

    public CarteCrise findByImmatriculation(String immatriculation) {
        return carteCriseRepository.findById(immatriculation).orElse(null);
    }
}
