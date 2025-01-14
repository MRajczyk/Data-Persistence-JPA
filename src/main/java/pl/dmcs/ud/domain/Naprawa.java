package pl.dmcs.ud.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
    @JsonManagedReference
    private Stanowisko stanowisko;

    @ManyToMany
    @JoinTable(
            name = "naprawy_zabiegi",
            joinColumns = @JoinColumn(name = "id_naprawa"),
            inverseJoinColumns = @JoinColumn(name = "id_zabieg")
    )
    @JsonManagedReference
    private List<Zabieg> listaZabiegow;

    @ManyToMany
    @JoinTable(
            name = "naprawy_pracownicy",
            joinColumns = @JoinColumn(name = "id_naprawa"),
            inverseJoinColumns = @JoinColumn(name = "id_pracownik")
    )
    @JsonBackReference
    private List<Pracownik> listaPracownikow;

    private LocalDateTime dataPrzyjecia;
    private LocalDateTime wyznaczonaDataOdbioru;
    private LocalDateTime faktycznaDataOdbioru;
    private LocalDateTime dataRozpoczeciaNaprawy;
    private LocalDateTime dataZakonczeniaNaprawy;

    public Naprawa() {}

    public Naprawa(Long id, Samochod samochod, Stanowisko stanowisko, LocalDateTime dataPrzyjecia,
                   LocalDateTime wyznaczonaDataOdbioru, LocalDateTime faktycznaDataOdbioru,
                   LocalDateTime dataRozpoczeciaNaprawy, LocalDateTime dataZakonczeniaNaprawy) {
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

    public LocalDateTime getDataPrzyjecia() {
        return dataPrzyjecia;
    }

    public void setDataPrzyjecia(LocalDateTime data_przyjecia) {
        this.dataPrzyjecia = data_przyjecia;
    }

    public LocalDateTime getWyznaczonaDataOdbioru() {
        return wyznaczonaDataOdbioru;
    }

    public void setWyznaczonaDataOdbioru(LocalDateTime data_odbioru) {
        this.wyznaczonaDataOdbioru = data_odbioru;
    }

    public LocalDateTime getFaktycznaDataOdbioru() {
        return faktycznaDataOdbioru;
    }

    public void setFaktycznaDataOdbioru(LocalDateTime faktycznaDataOdbioru) {
        this.faktycznaDataOdbioru = faktycznaDataOdbioru;
    }

    public LocalDateTime getDataRozpoczeciaNaprawy() {
        return dataRozpoczeciaNaprawy;
    }

    public void setDataRozpoczeciaNaprawy(LocalDateTime dataRozpoczeciaNaprawy) {
        this.dataRozpoczeciaNaprawy = dataRozpoczeciaNaprawy;
    }

    public LocalDateTime getDataZakonczeniaNaprawy() {
        return dataZakonczeniaNaprawy;
    }

    public void setDataZakonczeniaNaprawy(LocalDateTime dataZakonczeniaNaprawy) {
        this.dataZakonczeniaNaprawy = dataZakonczeniaNaprawy;
    }

    public List<Zabieg> getListaZabiegow() {
        return listaZabiegow;
    }

    public void setListaZabiegow(List<Zabieg> listaZabiegow) {
        this.listaZabiegow = listaZabiegow;
    }
}
