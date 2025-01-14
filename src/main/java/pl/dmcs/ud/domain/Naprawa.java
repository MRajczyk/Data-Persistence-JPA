package pl.dmcs.ud.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="naprawy")
public class Naprawa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idSamochod;
    private Long idStanowisko;
    private LocalDate dataPrzyjecia;
    private LocalDate wyznaczonaDataOdbioru;
    private LocalDate faktycznaDataOdbioru;
    private LocalDate dataRozpoczeciaNaprawy;
    private LocalDate dataZakonczeniaNaprawy;

    public Naprawa() {}

    public Naprawa(Long id, Long idSamochod, Long idStanowisko, LocalDate dataPrzyjecia,
                   LocalDate wyznaczonaDataOdbioru, LocalDate faktycznaDataOdbioru,
                   LocalDate dataRozpoczeciaNaprawy, LocalDate dataZakonczeniaNaprawy) {
        this.id = id;
        this.idSamochod = idSamochod;
        this.idStanowisko = idStanowisko;
        this.dataPrzyjecia = dataPrzyjecia;
        this.wyznaczonaDataOdbioru = wyznaczonaDataOdbioru;
        this.faktycznaDataOdbioru = faktycznaDataOdbioru;
        this.dataRozpoczeciaNaprawy = dataRozpoczeciaNaprawy;
        this.dataZakonczeniaNaprawy = dataZakonczeniaNaprawy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdSamochod() {
        return idSamochod;
    }

    public void setIdSamochod(Long id_klient) {
        this.idSamochod = id_klient;
    }

    public Long getIdStanowisko() {
        return idStanowisko;
    }

    public void setIdStanowisko(Long id_model) {
        this.idStanowisko = id_model;
    }

    public LocalDate getDataPrzyjecia() {
        return dataPrzyjecia;
    }

    public void setDataPrzyjecia(LocalDate data_przyjecia) {
        this.dataPrzyjecia = data_przyjecia;
    }

    public LocalDate getWyznaczonaDataOdbioru() {
        return wyznaczonaDataOdbioru;
    }

    public void setWyznaczonaDataOdbioru(LocalDate data_odbioru) {
        this.wyznaczonaDataOdbioru = data_odbioru;
    }

    public LocalDate getFaktycznaDataOdbioru() {
        return faktycznaDataOdbioru;
    }

    public void setFaktycznaDataOdbioru(LocalDate faktycznaDataOdbioru) {
        this.faktycznaDataOdbioru = faktycznaDataOdbioru;
    }

    public LocalDate getDataRozpoczeciaNaprawy() {
        return dataRozpoczeciaNaprawy;
    }

    public void setDataRozpoczeciaNaprawy(LocalDate dataRozpoczeciaNaprawy) {
        this.dataRozpoczeciaNaprawy = dataRozpoczeciaNaprawy;
    }

    public LocalDate getDataZakonczeniaNaprawy() {
        return dataZakonczeniaNaprawy;
    }

    public void setDataZakonczeniaNaprawy(LocalDate dataZakonczeniaNaprawy) {
        this.dataZakonczeniaNaprawy = dataZakonczeniaNaprawy;
    }
}
