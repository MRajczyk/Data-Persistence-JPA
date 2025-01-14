package pl.dmcs.ud.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="samochody")
public class Samochod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idKlient;
    private Long idModel;
    private Integer rokProdukcji;
    private String numerRejestracyjny;

    public Samochod() {}

    public Samochod(Long id, Long idKlient, Long idModel, Integer rokProdukcji, String numerRejestracyjny) {
        this.id = id;
        this.idKlient = idKlient;
        this.idModel = idModel;
        this.rokProdukcji = rokProdukcji;
        this.numerRejestracyjny = numerRejestracyjny;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdKlient() {
        return idKlient;
    }

    public void setIdKlient(Long idKlient) {
        this.idKlient = idKlient;
    }

    public Long getIdModel() {
        return idModel;
    }

    public void setIdModel(Long idModel) {
        this.idModel = idModel;
    }

    public Integer getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(Integer rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    public void setNumerRejestracyjny(String numerRejestracyjny) {
        this.numerRejestracyjny = numerRejestracyjny;
    }
}
