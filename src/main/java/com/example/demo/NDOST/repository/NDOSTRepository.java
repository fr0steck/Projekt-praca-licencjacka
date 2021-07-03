package com.example.demo.NDOST.repository;


import com.example.demo.NDOST.entity.Zawodnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NDOSTRepository
extends JpaRepository<Zawodnik,Long> {


    @Query(value = "select count(kto_wygral) from wyniki_walk join zawodnik on zawodnik.id_zawodnika = wyniki_walk.kto_wygral where zawodnik.imie = ?1 and zawodnik.nazwisko = ?2",
            nativeQuery = true)
    Long findHowManyWins(String imie, String nazwisko);

    @Query(value = "select count(id_walki) from wyniki_walk join zawodnik on zawodnik.id_zawodnika = wyniki_walk.kto_wygral where zawodnik.imie = ?1 and zawodnik.nazwisko = ?2 and wyniki_walk.czy_ko = 'TRUE'",
        nativeQuery = true)
    Long findHowManyKO(String imie, String nazwisko);

    @Query(value = "select sum(ilosc_jabs_zawodnika1) from wyniki_walk join walki on walki.id_walki = wyniki_walk.id_walki join zawodnik on walki.id_zawodnika1 = zawodnik.id_zawodnika or walki.id_zawodnika2 = zawodnik.id_zawodnika where zawodnik.imie = ?1 and zawodnik.nazwisko = ?2",
            nativeQuery = true)
    Long findHowManyJabsOverall(String imie, String nazwisko);

    @Query(value = "select sum(ilosc_power_strikes_na_runde_zawodnika1) from wyniki_walk join walki on walki.id_walki = wyniki_walk.id_walki join zawodnik on walki.id_zawodnika1 = zawodnik.id_zawodnika or walki.id_zawodnika2 = zawodnik.id_zawodnika where zawodnik.imie = ?1 and zawodnik.nazwisko = ?2",
            nativeQuery = true)
    Long findHowManyPowerStrikesOverall(String imie, String nazwisko);

    @Query(value = "select sum(ilosc_uderzen_na_runde_zawodnika1) from wyniki_walk join walki on walki.id_walki = wyniki_walk.id_walki join zawodnik on walki.id_zawodnika1 = zawodnik.id_zawodnika or walki.id_zawodnika2 = zawodnik.id_zawodnika where zawodnik.imie = ?1 and zawodnik.nazwisko = ?2",
            nativeQuery = true)
    Long findHowManyStrikesOverall(String imie, String nazwisko);
}
