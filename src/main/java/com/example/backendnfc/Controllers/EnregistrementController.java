// EnregistrementController.java
package com.example.backendnfc.Controllers;

import com.example.backendnfc.DTOs.EnregistrementRequestDto;
import com.example.backendnfc.Entities.*;
import com.example.backendnfc.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class EnregistrementController {

    @Autowired
    private VehiculeService vehiculeService;
    @Autowired
    private CarteCriseService carteCriseService;
    @Autowired
    private AssuranceService assuranceService;
    @Autowired
    private ConducteurService conducteurService;
    @Autowired
    private InfractionService infractionService;
    @Autowired
    private Controler_cService controlerCService;
    @Autowired
    private OfficierService officierService;

    @PostMapping("/enregistrement")
    public String enregistrer(@RequestBody EnregistrementRequestDto request) {
        // Récupérer l'authentification de l'utilisateur (officier)
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();  // Le nom d'utilisateur de l'officier est récupéré à partir du token

        // Charger l'officier à partir de son nom d'utilisateur
        Officier officier = officierService.findByUsername(username);

        // Enregistrer l'assurance
        Assurance assurance = assuranceService.save(request.getAssurance());

        // Enregistrer le véhicule
        Vehicule vehicule = request.getVehicule();
        vehicule.setAssurance(assurance);
        vehicule = vehiculeService.save(vehicule);

        // Enregistrer la carte de crise
        CarteCrise carteCrise = request.getCarteCrise();
        carteCrise.setVehicule(vehicule);
        carteCriseService.save(carteCrise);

        // Enregistrer le conducteur
        Conducteur conducteur = request.getConducteur();
        conducteur.setVehicule(vehicule);
        conducteurService.save(conducteur);

        // Enregistrer les infractions
        if (request.getInfractions() != null) {
            for (Infraction infraction : request.getInfractions()) {
                infraction.setConducteur(conducteur);
                infractionService.save(infraction);
            }
        }

        // Enregistrer le contrôle
        Controler_c controler = request.getControler();
        controler.setConducteur(conducteur);
        controler.setOfficier(officier);  // Associer l'officier récupéré au contrôle
        controlerCService.save(controler);

        return "Enregistrement réussi !";
    }
}
