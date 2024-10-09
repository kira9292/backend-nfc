package com.example.backendnfc.Repositories;

import com.example.backendnfc.Entities.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfractionRepository extends JpaRepository<Infraction, String> {
}
