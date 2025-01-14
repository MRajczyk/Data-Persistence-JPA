package pl.dmcs.ud.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="klienci")
public class Klient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imie;
    private String nazwisko;
    private String nrTelefonu;
    private String email;

    @OneToMany(mappedBy = "wlasciciel", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Samochod> listaSamochodow;

    public Klient() {}

    public Klient(Long id, String imie, String nazwisko, String nrTelefonu, String email, List<Samochod> listaSamochodow) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrTelefonu = nrTelefonu;
        this.email = email;
        this.listaSamochodow = listaSamochodow;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String name) {
        this.imie = name;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String surname) {
        this.nazwisko = surname;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Samochod> getListaSamochodow() {
        return listaSamochodow;
    }

    public void setListaSamochodow(List<Samochod> listaSamochodow) {
        this.listaSamochodow = listaSamochodow;
    }
}
