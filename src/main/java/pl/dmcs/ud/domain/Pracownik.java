package pl.dmcs.ud.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="pracownicy")
public class Pracownik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rola;
    private String imie;
    private String nazwisko;
    private String nrTelefonu;
    private String email;

    @ManyToMany(mappedBy = "listaPracownikow")
    private List<Naprawa> listaNapraw;

    public Pracownik() {}

    public Pracownik(Long id, String rola, String imie, String nazwisko, String nrTelefonu, String email) {
        this.id = id;
        this.rola = rola;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrTelefonu = nrTelefonu;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRola() {
        return rola;
    }

    public void setRola(String rola) {
        this.rola = rola;
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

    public List<Naprawa> getListaNapraw() {
        return listaNapraw;
    }

    public void setListaNapraw(List<Naprawa> listaNapraw) {
        this.listaNapraw = listaNapraw;
    }
}
