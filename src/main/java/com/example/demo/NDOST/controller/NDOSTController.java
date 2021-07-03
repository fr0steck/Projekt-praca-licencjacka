package com.example.demo.NDOST.controller;


import com.example.demo.NDOST.entity.Walki;
import com.example.demo.NDOST.entity.Wyniki_walk;
import com.example.demo.NDOST.entity.Zawodnik;
import com.example.demo.NDOST.repository.NDOSTRepository;
import com.example.demo.NDOST.repository.NDOSTRepository2;
import com.example.demo.NDOST.repository.NDOSTRepository3;
import com.example.demo.NDOST.service.NDOSTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "api")
public class NDOSTController {

    private final NDOSTService ndostService;
    private final NDOSTRepository ndostRepository;
    private final NDOSTRepository2 ndostRepository2;
    private final NDOSTRepository3 ndostRepository3;

    @Autowired
    public NDOSTController(NDOSTService ndostService, NDOSTRepository ndostRepository, NDOSTRepository2 ndostRepository2, NDOSTRepository3 ndostRepository3) {
        this.ndostService = ndostService;
        this.ndostRepository = ndostRepository;
        this.ndostRepository2 = ndostRepository2;
        this.ndostRepository3 = ndostRepository3;
    }


    @GetMapping(path = "/allFighters")
    public List<Zawodnik> getAllFighters(){
        return ndostService.getAllFighters();
    }

    @GetMapping(path = "/specificFighter")
    public Optional<Zawodnik> getSpecificFighter(Long id){
        return ndostService.getSpecificFighter(id);
    }

    @PostMapping(path = "/addFighter")
    public void addFighter(Zawodnik zawodnik){
        ndostService.addFighter(zawodnik);
    }

    @DeleteMapping(path = "/deleteFighter")
    public void deleteFighter(Long id_zawodnika){
        ndostService.deleteFighter(id_zawodnika);
    }

    @PostMapping(path = "/addFight")
    public void addFight(Walki walka){
        ndostService.addFight(walka);
    }

    @GetMapping(path = "/allFights")
    public List<Walki> getAllFights(){
        return ndostService.getAllFights();
    }

    @PostMapping(path = "/addFightDetails")
    public void addFightDetails(Wyniki_walk wynikWalki){
        ndostService.addFightDetails(wynikWalki);
    }

    @GetMapping(path = "/allFightsDetails")
    public List<Wyniki_walk> getAllFightsDetails(){
        return ndostService.getAllFightsDetails();
    }

    @GetMapping(path = "/getSpecificFightDetails")
    public Optional<Wyniki_walk> getSpecificFightDetails(Long id_walki){
        return ndostService.getSpecificFightDetails(id_walki);
    }
/////////// Sekcja z Queries z początkiem metod "find" zamiast "get" //////////////
    @GetMapping(path = "/findHowManyWins")
    public Long findHowManyWins(String imie, String nazwisko) {
        return ndostRepository.findHowManyWins(imie, nazwisko);
    }

    @GetMapping(path = "/findHowManyKO")
    public Long findHowManyKO(String imie, String nazwisko) {
        return ndostRepository.findHowManyKO(imie, nazwisko);
    }

    @GetMapping(path = "/findHowManyJabsOverall")
    public Long findHowManyJabsOverall(String imie, String nazwisko){
        return ndostRepository.findHowManyJabsOverall(imie, nazwisko);
    }

    @GetMapping(path = "/findHowManyPowerStrikesOverall")
    public Long findHowManyPowerStrikesOverall(String imie, String nazwisko){
        return ndostRepository.findHowManyPowerStrikesOverall(imie, nazwisko);
    }

    @GetMapping(path = "/findHowManyStrikesOverall")
    public Long findHowManyStrikesOverall(String imie, String nazwisko){
        return ndostRepository.findHowManyStrikesOverall(imie, nazwisko);
    }



}
