package com.example.backendnfc.Controllers;

import com.example.backendnfc.DTOs.AuthRequest;
import com.example.backendnfc.DTOs.AuthResponse;
import com.example.backendnfc.DTOs.OfficierDto;
import com.example.backendnfc.Entities.Officier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;


import com.example.backendnfc.Services.JWTService;
import com.example.backendnfc.Services.OfficierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;
@RestController
//@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private OfficierService officierService;
    @Autowired
    private JWTService jwtService;
    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public Object getToken(Authentication authentication) {
        // Générer le token JWT
        String token = jwtService.generateToken(authentication);

        // Récupérer les informations de l'utilisateur
        String username = authentication.getName();
        OfficierDto userInfo = officierService.getUserInfo(username);

        // Créer une réponse contenant le token et les informations de l'utilisateur
        return new Object() {
            public String jwtToken = token;
            public OfficierDto user = userInfo;
        };
    }





}
