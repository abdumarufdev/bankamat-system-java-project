package com.example.bankamat.Repazitori;

import com.example.bankamat.Model.Lavozim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LavozimRepazitori extends JpaRepository<Lavozim,Integer> {
    Optional<Lavozim> findByNomi(String nomi);
}
