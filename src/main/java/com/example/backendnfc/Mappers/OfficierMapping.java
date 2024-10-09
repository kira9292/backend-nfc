package com.example.backendnfc.Mappers;

import com.example.backendnfc.DTOs.OfficierDto;
import com.example.backendnfc.Entities.Officier;
import org.springframework.beans.BeanUtils;

public class OfficierMapping {

    public OfficierDto fromOfficier(Officier officier) {
        OfficierDto officierDto = new OfficierDto();
        BeanUtils.copyProperties(officier, officierDto);
        return officierDto;
    }

    public Officier fromOfficierDto(OfficierDto officierDto) {
        Officier officier = new Officier();
        BeanUtils.copyProperties(officierDto, officier);
        return officier;
    }
}
