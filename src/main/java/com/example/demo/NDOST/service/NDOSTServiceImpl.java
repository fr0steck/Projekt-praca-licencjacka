package com.example.demo.NDOST.service;


import com.example.demo.NDOST.entity.Walki;
import com.example.demo.NDOST.entity.Wyniki_walk;
import com.example.demo.NDOST.entity.Zawodnik;
import com.example.demo.NDOST.repository.NDOSTRepository;
import com.example.demo.NDOST.repository.NDOSTRepository2;
import com.example.demo.NDOST.repository.NDOSTRepository3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class NDOSTServiceImpl implements NDOSTService {

    private final NDOSTRepository ndostRepository;
    private final NDOSTRepository2 ndostRepository2;
    private final NDOSTRepository3 ndostRepository3;


    @Autowired
    public NDOSTServiceImpl(NDOSTRepository ndostRepository,NDOSTRepository2 ndostRepository2, NDOSTRepository3 ndostRepository3) {
        this.ndostRepository = ndostRepository;
        this.ndostRepository2 = ndostRepository2;
        this.ndostRepository3 = ndostRepository3;
    }


    @Override
    public List<Zawodnik> getAllFighters(){
        return ndostRepository.findAll();
    }

    @Override
    public Optional<Zawodnik> getSpecificFighter(Long id) {
        return ndostRepository.findById(id);
    }

    @Override
    public void addFighter(Zawodnik zawodnik) {
        ndostRepository.save(zawodnik);
    }

    @Override
    public void deleteFighter(Long id_zawodnika) {
        ndostRepository.deleteById(id_zawodnika);
    }

    @Override
    public void addFight(Walki walka) {
        ndostRepository2.save(walka);

    }

    @Override
    public List<Walki> getAllFights() {
        return ndostRepository2.findAll();
    }

    @Override
    public void addFightDetails(Wyniki_walk wynikWalki) {
        ndostRepository3.save(wynikWalki);
    }

    @Override
    public List<Wyniki_walk> getAllFightsDetails() {
        return ndostRepository3.findAll();
    }

    @Override
    public Optional<Wyniki_walk> getSpecificFightDetails(Long id_walki) {
        return ndostRepository3.findById(id_walki);
    }


}