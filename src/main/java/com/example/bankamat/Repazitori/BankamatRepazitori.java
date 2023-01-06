package com.example.bankamat.Repazitori;

import com.example.bankamat.Model.Bankamat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface BankamatRepazitori extends JpaRepository<Bankamat,Integer> {
}
