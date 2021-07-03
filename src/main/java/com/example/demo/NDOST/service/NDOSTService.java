package com.example.demo.NDOST.service;


import com.example.demo.NDOST.entity.Walki;
import com.example.demo.NDOST.entity.Wyniki_walk;
import com.example.demo.NDOST.entity.Zawodnik;

import java.util.List;
import java.util.Optional;

public interface NDOSTService {
      List<Zawodnik> getAllFighters();
      Optional<Zawodnik> getSpecificFighter(Long id);
      void addFighter(Zawodnik zawodnik);
      void addFight(Walki walka);
      void deleteFighter(Long id_zawodnika);
      List<Walki> getAllFights();
      void addFightDetails(Wyniki_walk wynikWalki);
      List<Wyniki_walk> getAllFightsDetails();
      Optional<Wyniki_walk> getSpecificFightDetails(Long id_walki);
}
