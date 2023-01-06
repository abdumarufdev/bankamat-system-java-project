package com.example.bankamat.Repazitori;


import com.example.bankamat.Model.Turlar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurlarRepazitori extends JpaRepository<Turlar,Integer> {
}
