package com.example.backendnfc.Repositories;

import com.example.backendnfc.Entities.Conducteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConducteurRepository extends JpaRepository<Conducteur, Long> {
}
