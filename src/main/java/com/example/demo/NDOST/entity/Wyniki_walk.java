package com.example.demo.NDOST.entity;

import javax.persistence.*;

@Entity
@Table
public class Wyniki_walk {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "hibernate_sequence2")
    @SequenceGenerator(
            name = "hibernate_sequence2",
            allocationSize = 1
    )
    private Long id_walki;
    private Long kto_wygral;
    private Boolean czy_ko;
    private Integer ilosc_jabs_zawodnika1;
    private Integer ilosc_uderzen_na_runde_zawodnika1;
    private Integer ilosc_power_strikes_na_runde_zawodnika1;
    private Integer ilosc_jabs_zawodnika2;
    private Integer ilosc_uderzen_na_runde_zawodnika2;
    private Integer ilosc_power_strikes_na_runde_zawodnika2;

    public Wyniki_walk() {
    }

    public Wyniki_walk(Long id_walki, Long kto_wygral, Boolean czy_ko, Integer ilosc_jabs_zawodnika1, Integer ilosc_uderzen_na_runde_zawodnika1, Integer ilosc_power_strikes_na_runde_zawodnika1, Integer ilosc_jabs_zawodnika2, Integer ilosc_uderzen_na_runde_zawodnika2, Integer ilosc_power_strikes_na_runde_zawodnika2) {
        this.id_walki = id_walki;
        this.kto_wygral = kto_wygral;
        this.czy_ko = czy_ko;
        this.ilosc_jabs_zawodnika1 = ilosc_jabs_zawodnika1;
        this.ilosc_uderzen_na_runde_zawodnika1 = ilosc_uderzen_na_runde_zawodnika1;
        this.ilosc_power_strikes_na_runde_zawodnika1 = ilosc_power_strikes_na_runde_zawodnika1;
        this.ilosc_jabs_zawodnika2 = ilosc_jabs_zawodnika2;
        this.ilosc_uderzen_na_runde_zawodnika2 = ilosc_uderzen_na_runde_zawodnika2;
        this.ilosc_power_strikes_na_runde_zawodnika2 = ilosc_power_strikes_na_runde_zawodnika2;
    }

    public Long getId_walki() {
        return id_walki;
    }

    public void setId_walki(Long id_walki) {
        this.id_walki = id_walki;
    }

    public Long getKto_wygral() {
        return kto_wygral;
    }

    public void setKto_wygral(Long kto_wygral) {
        this.kto_wygral = kto_wygral;
    }

    public Boolean getCzy_ko() {
        return czy_ko;
    }

    public void setCzy_ko(Boolean czy_ko) {
        this.czy_ko = czy_ko;
    }

    public Integer getIlosc_jabs_zawodnika1() {
        return ilosc_jabs_zawodnika1;
    }

    public void setIlosc_jabs_zawodnika1(Integer ilosc_jabs_zawodnika1) {
        this.ilosc_jabs_zawodnika1 = ilosc_jabs_zawodnika1;
    }

    public Integer getIlosc_uderzen_na_runde_zawodnika1() {
        return ilosc_uderzen_na_runde_zawodnika1;
    }

    public void setIlosc_uderzen_na_runde_zawodnika1(Integer ilosc_uderzen_na_runde_zawodnika1) {
        this.ilosc_uderzen_na_runde_zawodnika1 = ilosc_uderzen_na_runde_zawodnika1;
    }

    public Integer getIlosc_power_strikes_na_runde_zawodnika1() {
        return ilosc_power_strikes_na_runde_zawodnika1;
    }

    public void setIlosc_power_strikes_na_runde_zawodnika1(Integer ilosc_power_strikes_na_runde_zawodnika1) {
        this.ilosc_power_strikes_na_runde_zawodnika1 = ilosc_power_strikes_na_runde_zawodnika1;
    }

    public Integer getIlosc_jabs_zawodnika2() {
        return ilosc_jabs_zawodnika2;
    }

    public void setIlosc_jabs_zawodnika2(Integer ilosc_jabs_zawodnika2) {
        this.ilosc_jabs_zawodnika2 = ilosc_jabs_zawodnika2;
    }

    public Integer getIlosc_uderzen_na_runde_zawodnika2() {
        return ilosc_uderzen_na_runde_zawodnika2;
    }

    public void setIlosc_uderzen_na_runde_zawodnika2(Integer ilosc_uderzen_na_runde_zawodnika2) {
        this.ilosc_uderzen_na_runde_zawodnika2 = ilosc_uderzen_na_runde_zawodnika2;
    }

    public Integer getIlosc_power_strikes_na_runde_zawodnika2() {
        return ilosc_power_strikes_na_runde_zawodnika2;
    }

    public void setIlosc_power_strikes_na_runde_zawodnika2(Integer ilosc_power_strikes_na_runde_zawodnika2) {
        this.ilosc_power_strikes_na_runde_zawodnika2 = ilosc_power_strikes_na_runde_zawodnika2;
    }

    @Override
    public String toString() {
        return "Wyniki_walk{" +
                "id_walki=" + id_walki +
                ", kto_wygral=" + kto_wygral +
                ", czy_ko=" + czy_ko +
                ", ilosc_jabs_zawodnika1=" + ilosc_jabs_zawodnika1 +
                ", ilosc_uderzen_na_runde_zawodnika1=" + ilosc_uderzen_na_runde_zawodnika1 +
                ", ilosc_power_strikes_na_runde_zawodnika1=" + ilosc_power_strikes_na_runde_zawodnika1 +
                ", ilosc_jabs_zawodnika2=" + ilosc_jabs_zawodnika2 +
                ", ilosc_uderzen_na_runde_zawodnika2=" + ilosc_uderzen_na_runde_zawodnika2 +
                ", ilosc_power_strikes_na_runde_zawodnika2=" + ilosc_power_strikes_na_runde_zawodnika2 +
                '}';
    }
}
