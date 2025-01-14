package pl.dmcs.ud.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="naprawy")
public class Naprawa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_samochod", nullable = false)
    private Samochod samochod;

    @ManyToOne
    @JoinColumn(name = "id_stanowisko", nullable = false)
    private Stanowisko stanowisko;

    @ManyToMany
    @JoinTable(
            name = "naprawa_zabieg",
            joinColumns = @JoinColumn(name = "id_naprawa"),
            inverseJoinColumns = @JoinColumn(name = "id_zabieg")
    )
    private List<Zabieg> listaZabiegow;

    @ManyToMany
    @JoinTable(
            name = "naprawa_pracownik",
            joinColumns = @JoinColumn(name = "id_naprawa"),
            inverseJoinColumns = @JoinColumn(name = "id_pracownik")
    )
    private List<Pracownik> listaPracownikow;

    private LocalDate dataPrzyjecia;
    private LocalDate wyznaczonaDataOdbioru;
    private LocalDate faktycznaDataOdbioru;
    private LocalDate dataRozpoczeciaNaprawy;
    private LocalDate dataZakonczeniaNaprawy;

    public Naprawa() {}

    public Naprawa(Long id, Samochod samochod, Stanowisko stanowisko, LocalDate dataPrzyjecia,
                   LocalDate wyznaczonaDataOdbioru, LocalDate faktycznaDataOdbioru,
                   LocalDate dataRozpoczeciaNaprawy, LocalDate dataZakonczeniaNaprawy) {
        this.id = id;
        this.samochod = samochod;
        this.stanowisko = stanowisko;
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

    public Samochod getSamochod() {
        return samochod;
    }

    public void setSamochod(Samochod samochod) {
        this.samochod = samochod;
    }

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
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

    public List<Zabieg> getListaZabiegow() {
        return listaZabiegow;
    }

    public void setListaZabiegow(List<Zabieg> listaZabiegow) {
        this.listaZabiegow = listaZabiegow;
    }
}
