package pl.dmcs.ud.domain;

import jakarta.persistence.*;

//todo: pomyslec o jakims przypisaniu wyposazenia(?)
@Entity
@Table(name="stanowiska")
public class Stanowisko {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nazwa;
    private String opis;

    public Stanowisko() {}

    public Stanowisko(Long id, String nazwa, String opis) {
        this.id = id;
        this.nazwa = nazwa;
        this.opis = opis;
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

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
