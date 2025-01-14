package pl.dmcs.ud.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Zabieg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nazwa;
    private Float koszt;
    private String opis;
    private LocalDateTime czasRozpoczecia;
    private LocalDateTime czasZakonczenia;

    public Zabieg() {}

    public Zabieg(Long id, String nazwa, Float koszt, String opis, LocalDateTime czasRozpoczecia, LocalDateTime czasZakonczenia) {
        this.id = id;
        this.nazwa = nazwa;
        this.koszt = koszt;
        this.opis = opis;
        this.czasRozpoczecia = czasRozpoczecia;
        this.czasZakonczenia = czasZakonczenia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Float getKoszt() {
        return koszt;
    }

    public void setKoszt(Float koszt) {
        this.koszt = koszt;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public LocalDateTime getCzasRozpoczecia() {
        return czasRozpoczecia;
    }

    public void setCzasRozpoczecia(LocalDateTime czasRozpoczecia) {
        this.czasRozpoczecia = czasRozpoczecia;
    }

    public LocalDateTime getCzasZakonczenia() {
        return czasZakonczenia;
    }

    public void setCzasZakonczenia(LocalDateTime czasZakonczenia) {
        this.czasZakonczenia = czasZakonczenia;
    }
}
