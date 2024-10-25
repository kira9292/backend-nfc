package com.example.backendnfc.Mappers;

import com.example.backendnfc.DTOs.AuthRequest;
import com.example.backendnfc.DTOs.OfficierDto;
import com.example.backendnfc.Entities.Officier;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class OfficierMapping {

    public OfficierDto fromOfficier(Officier officier) {
        OfficierDto authRequest = new OfficierDto();
        BeanUtils.copyProperties(officier, authRequest);
        return authRequest;
    }

    public Officier fromOfficierDto(AuthRequest authRequest) {
        Officier officier = new Officier();
        BeanUtils.copyProperties(authRequest, officier);
        return officier;
    }
}
