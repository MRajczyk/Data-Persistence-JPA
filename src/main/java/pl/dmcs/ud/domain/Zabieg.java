package pl.dmcs.ud.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="zabiegi")
public class Zabieg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nazwa;

    @Column(nullable = false)
    private Float koszt;

    private String opis;

    public Zabieg() {}

    public Zabieg(Long id, String nazwa, Float koszt, String opis) {
        this.id = id;
        this.nazwa = nazwa;
        this.koszt = koszt;
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
}
