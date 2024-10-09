package com.example.backendnfc.Controllers;

import com.example.backendnfc.DTOs.OfficierDto;
import com.example.backendnfc.Services.OfficierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private OfficierService officierService;

    @PostMapping("/login")
    public String login(@RequestBody OfficierDto authRequest) {
        return officierService.authenticate(authRequest.getUsername(), authRequest.getPassword());
    }
}
