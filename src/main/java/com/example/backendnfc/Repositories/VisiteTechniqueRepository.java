package com.example.backendnfc.Repositories;

import com.example.backendnfc.Entities.VisiteTechnique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VisiteTechniqueRepository extends JpaRepository<VisiteTechnique,Long> {
}
