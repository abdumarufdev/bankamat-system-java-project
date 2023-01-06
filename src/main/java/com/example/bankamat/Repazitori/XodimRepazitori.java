package com.example.bankamat.Repazitori;

import com.example.bankamat.Model.Lavozim;
import com.example.bankamat.Model.Xodim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface XodimRepazitori extends JpaRepository<Xodim,Integer> {
    boolean existsByUsername(String username);
}
