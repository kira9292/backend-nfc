package com.example.backendnfc.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {
    private OfficierDto officier;
    private String token;
}
