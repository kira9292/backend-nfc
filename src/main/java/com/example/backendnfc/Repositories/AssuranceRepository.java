package com.example.backendnfc.Repositories;

import com.example.backendnfc.Entities.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AssuranceRepository extends JpaRepository<Assurance, Long> {
}
