package com.example.backendnfc.Services;

import com.example.backendnfc.Entities.VisiteTechnique;
import com.example.backendnfc.Repositories.VisiteTechniqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisiteTechniqueService {

    @Autowired
    private VisiteTechniqueRepository visiteTechniqueRepository;

    public VisiteTechnique save(VisiteTechnique visiteTechnique) {
        return visiteTechniqueRepository.save(visiteTechnique);
    }
}
