package com.example.demo.NDOST.entity;

import javax.persistence.*;

@Entity
@Table
public class Walki {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "hibernate_sequence1")
    @SequenceGenerator(
    name = "hibernate_sequence1",
    allocationSize = 1
    )
    private Long id_walki;
    private Long id_zawodnika1;
    private Long id_zawodnika2;

    public Walki(){
    }

    public Walki(Long id_walki, Long id_zawodnika1, Long id_zawodnika2)
    {
        this.id_walki = id_walki;
        this.id_zawodnika1 = id_zawodnika1;
        this.id_zawodnika2 = id_zawodnika2;
    }

    public Long getId_walki() {
        return id_walki;
    }

    public void setId_walki(Long id_walki) {
        this.id_walki = id_walki;
    }

    public Long getId_zawodnika1() {
        return id_zawodnika1;
    }

    public void setId_zawodnika1(Long id_zawodnika1) {
        this.id_zawodnika1 = id_zawodnika1;
    }

    public Long getId_zawodnika2() {
        return id_zawodnika2;
    }

    public void setId_zawodnika2(Long id_zawodnika2) {
        this.id_zawodnika2 = id_zawodnika2;
    }

    @Override
    public String toString() {
        return "Walka{" +
                "id_walki=" + id_walki +
                ", id_zawodnika1=" + id_zawodnika1 +
                ", id_zawodnika2=" + id_zawodnika2 +
                '}';
    }
}
