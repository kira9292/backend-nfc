package com.example.backendnfc.Repositories;

import com.example.backendnfc.Entities.CarteCrise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteCriseRepository extends JpaRepository<CarteCrise, String> {
}
