package com.example.backendnfc.Repositories;

import com.example.backendnfc.Entities.Officier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficierRepository extends JpaRepository<Officier,Long> {

    Officier findByUsername(String username);
}
