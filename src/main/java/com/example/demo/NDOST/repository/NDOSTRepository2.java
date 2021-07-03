package com.example.demo.NDOST.repository;

import com.example.demo.NDOST.entity.Walki;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NDOSTRepository2
extends JpaRepository<Walki,Long> {
}
