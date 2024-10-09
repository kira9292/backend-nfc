package com.example.backendnfc.Services;

import com.example.backendnfc.Entities.Officier;
import com.example.backendnfc.Repositories.OfficierRepository;
import com.example.backendnfc.Security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class OfficierService {

    private final OfficierRepository officierRepository;
    private final JwtUtil jwtUtil;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public OfficierService(OfficierRepository officierRepository, JwtUtil jwtUtil, BCryptPasswordEncoder passwordEncoder) {
        this.officierRepository = officierRepository;
        this.jwtUtil = jwtUtil;
        this.passwordEncoder = passwordEncoder;
    }

    public String authenticate(String username, String password) {
        Officier officier = officierRepository.findByUsername(username);
        if (officier != null && passwordEncoder.matches(password, officier.getPassword())) {
            return jwtUtil.createToken(officier.getUsername());
        } else {
            throw new RuntimeException("Invalid username or password");
        }
    }



}
