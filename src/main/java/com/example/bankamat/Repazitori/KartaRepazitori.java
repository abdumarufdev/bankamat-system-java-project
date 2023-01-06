package com.example.bankamat.Repazitori;

import com.example.bankamat.Model.Karta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KartaRepazitori extends JpaRepository<Karta,Integer> {
    boolean existsByRaqam(String raqam);
}
