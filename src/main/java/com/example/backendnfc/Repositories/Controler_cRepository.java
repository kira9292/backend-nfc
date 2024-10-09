package com.example.backendnfc.Repositories;

import com.example.backendnfc.Entities.Controler_c;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Controler_cRepository extends JpaRepository<Controler_c, Long> {
}
