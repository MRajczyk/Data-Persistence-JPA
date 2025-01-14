package pl.dmcs.ud.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="samochody")
public class Samochod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_model", nullable = false)
    private ModelSamochod model;

    private Integer rokProdukcji;
    @Column(name = "numer_rejestracyjny", nullable = false)
    private String numerRejestracyjny;

    @ManyToOne
    @JoinColumn(name = "id_klient", nullable = false)
    private Klient wlasciciel;

    public Samochod() {}

    public Samochod(Long id, Klient wlasciciel, ModelSamochod model, Integer rokProdukcji, String numerRejestracyjny) {
        this.id = id;
        this.model = model;
        this.wlasciciel = wlasciciel;
        this.rokProdukcji = rokProdukcji;
        this.numerRejestracyjny = numerRejestracyjny;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Klient getWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(Klient wlasciciel) {
        this.wlasciciel = wlasciciel;
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

    public ModelSamochod getModel() {
        return model;
    }

    public void setModel(ModelSamochod model) {
        this.model = model;
    }
}
