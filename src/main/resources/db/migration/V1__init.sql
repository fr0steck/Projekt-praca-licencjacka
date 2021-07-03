CREATE SEQUENCE IF NOT EXISTS hibernate_sequence START 1 INCREMENT 1;
CREATE SEQUENCE IF NOT EXISTS hibernate_sequence1 START 1 INCREMENT 1;
CREATE SEQUENCE IF NOT EXISTS hibernate_sequence2 START 1 INCREMENT 1;



CREATE TABLE IF NOT EXISTS zawodnik (
    id_zawodnika BIGINT PRIMARY KEY,
    imie VARCHAR(255),
    nazwisko VARCHAR(255),
    wiek INT,
    wzrost_cm INT,
    waga_kg INT,
    stance_type VARCHAR(255),
    data_dodania TIMESTAMP
);

CREATE TABLE IF NOT EXISTS walki (
    id_walki BIGINT PRIMARY KEY,
    id_zawodnika1 BIGINT,
    id_zawodnika2 BIGINT,
    CONSTRAINT fk_zawodnik1
        FOREIGN KEY(id_zawodnika1)
            REFERENCES zawodnik(id_zawodnika),
    CONSTRAINT fk_zawodnik2
        FOREIGN KEY(id_zawodnika2)
            REFERENCES zawodnik(id_zawodnika)
);

CREATE TABLE IF NOT EXISTS wyniki_walk (
    id_walki BIGINT PRIMARY KEY,
    kto_wygral BIGINT,
    czy_ko BOOLEAN,
    ilosc_jabs_zawodnika1 INT,
    ilosc_uderzen_na_runde_zawodnika1 INT,
    ilosc_power_strikes_na_runde_zawodnika1 INT,
    ilosc_jabs_zawodnika2 INT,
    ilosc_uderzen_na_runde_zawodnika2 INT,
    ilosc_power_strikes_na_runde_zawodnika2 INT,
    CONSTRAINT fk_id_walki
        FOREIGN KEY(id_walki)
            REFERENCES walki(id_walki),
    CONSTRAINT fk_kto_wygral
        FOREIGN KEY(kto_wygral)
            REFERENCES zawodnik(id_zawodnika)
);