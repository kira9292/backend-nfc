package com.example.backendnfc.Repositories;

import com.example.backendnfc.Entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule ,Long> {
}
