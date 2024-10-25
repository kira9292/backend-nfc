package com.example.backendnfc;

import com.example.backendnfc.Entities.*;
import com.example.backendnfc.Repositories.*;
import com.example.backendnfc.Repositories.VisiteTechniqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class BackendNfcApplication implements CommandLineRunner {

//    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//    @Autowired
//    private OfficierRepository officierRepository;
//
//    @Autowired
//    private VehiculeRepository vehiculeRepository;
//
//    @Autowired
//    private ConducteurRepository conducteurRepository;
//
//    @Autowired
//    private AssuranceRepository assuranceRepository;
//
//    @Autowired
//    private VisiteTechniqueRepository visiteTechniqueRepository;
//
//    @Autowired
//    private CarteCriseRepository carteCriseRepository;
//
//    @Autowired
//    private InfractionRepository infractionRepository;
//
//    @Autowired
//    private Controler_cRepository controler_cRepository; // Change to ControlerCRepository

    public static void main(String[] args) {
        SpringApplication.run(BackendNfcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//
//        // Insert Officiers
//        Officier john = new Officier(null, "john_doe", passwordEncoder.encode("password123"), "USER",null);
//        Officier jane = new Officier(null, "jane_smith",  passwordEncoder.encode("password123"),"ADMIN", null);
//        officierRepository.saveAll(List.of(john, jane));
//
//        // Insert Vehicles
//        Vehicule vehicule1 = new Vehicule("V123", "John Doe", null, null, null, null);
//        Vehicule vehicule2 = new Vehicule("V456", "Jane Smith", null, null, null, null);
//        vehiculeRepository.saveAll(List.of(vehicule1, vehicule2));
//
//        // Insert Conducteurs
//        Conducteur conducteur1 = new Conducteur("C123", "John Driver", "1234567890", vehicule1, null);
//        Conducteur conducteur2 = new Conducteur("C456", "Jane Driver", "0987654321", vehicule2, null);
//        conducteurRepository.saveAll(List.of(conducteur1, conducteur2));
//
//        // Insert Assurances
//        Assurance assurance1 = new Assurance(null, LocalDate.now().plusYears(1), vehicule1);
//        Assurance assurance2 = new Assurance(null, LocalDate.now().plusYears(1), vehicule2);
//        assuranceRepository.saveAll(List.of(assurance1, assurance2));
//
//        // Insert Visites Techniques
//        VisiteTechnique visiteTechnique1 = new VisiteTechnique(null, LocalDate.now().plusMonths(6), vehicule1);
//        VisiteTechnique visiteTechnique2 = new VisiteTechnique(null, LocalDate.now().plusMonths(6), vehicule2);
//        visiteTechniqueRepository.saveAll(List.of(visiteTechnique1, visiteTechnique2));
//
//        // Insert Carte Crise
//        CarteCrise carteCrise1 = new CarteCrise("CR123", "Toyota", "Corolla", "John Doe", "Tinted", LocalDate.now(), vehicule1);
//        CarteCrise carteCrise2 = new CarteCrise("CR456", "Honda", "Civic", "Jane Smith", "Clear", LocalDate.now(), vehicule2);
//        carteCriseRepository.saveAll(List.of(carteCrise1, carteCrise2));
//
//        // Insert Infractions
//        Infraction infraction1 = new Infraction("I123", "Speeding", LocalDate.now(), 100.0, conducteur1);
//        Infraction infraction2 = new Infraction("I456", "Parking Violation", LocalDate.now(), 50.0, conducteur2);
//        infractionRepository.saveAll(List.of(infraction1, infraction2));
//
//        // Insert Controls
//        Controler_c control1 = new Controler_c(null, LocalDate.now(), "Location 1", conducteur1, john);
//        Controler_c control2 = new Controler_c(null, LocalDate.now(), "Location 2", conducteur2, jane);
//        controler_cRepository.saveAll(List.of(control1, control2));
    }
}
