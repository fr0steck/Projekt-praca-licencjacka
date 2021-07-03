package com.example.demo.NDOST.entity;

import com.example.demo.NDOST.common.StanceType;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table
public class Zawodnik {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "hibernate_sequence")
    @SequenceGenerator(
    name = "hibernate_sequence",
    allocationSize = 1
    )
    private Long id_zawodnika;
    private String imie;
    private String nazwisko;
    private Integer wiek;
    private Integer wzrost_cm;
    private Integer waga_kg;
    @Enumerated(EnumType.STRING)
    private StanceType stance_type;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_dodania = new Date();

    public Long getId_zawodnika() {
        return id_zawodnika;
    }

    public void setId_zawodnika(Long id_zawodnika) {
        this.id_zawodnika = id_zawodnika;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }

    public Integer getWzrost_cm() {
        return wzrost_cm;
    }

    public void setWzrost_cm(Integer wzrost_cm) {
        this.wzrost_cm = wzrost_cm;
    }

    public Integer getWaga_kg() {
        return waga_kg;
    }

    public void setWaga_kg(Integer waga_kg) {
        this.waga_kg = waga_kg;
    }

    public StanceType getStance_type() {
        return stance_type;
    }

    public void setStance_type(StanceType stance_type) {
        this.stance_type = stance_type;
    }

    public Zawodnik() {
    }

    public Zawodnik(Long id_zawodnika, String imie, String nazwisko, Integer wiek, Integer wzrost_cm, Integer waga_kg, StanceType stance_type, Date data_dodania) {
        this.id_zawodnika = id_zawodnika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost_cm = wzrost_cm;
        this.waga_kg = waga_kg;
        this.stance_type = stance_type;
        this.data_dodania = data_dodania;
    }

    @Override
    public String toString() {
        return "Zawodnik{" +
                "id_zawodnika=" + id_zawodnika +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", wzrost_cm=" + wzrost_cm +
                ", waga_kg=" + waga_kg +
                ", stance_type=" + stance_type +
                ", data_dodania=" + data_dodania +
                '}';
    }
}

