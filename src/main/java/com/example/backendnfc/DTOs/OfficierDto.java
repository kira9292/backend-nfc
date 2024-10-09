package com.example.backendnfc.DTOs;



import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OfficierDto {

    private String username;
    private String password;
}
