package pl.dmcs.ud.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonManagedReference
    private ModelSamochod model;

    @ManyToOne
    @JoinColumn(name = "id_klient", nullable = false)
    @JsonManagedReference
    private Klient wlasciciel;

    private Integer rokProdukcji;

    @Column(name = "numer_rejestracyjny", nullable = false)
    private String numerRejestracyjny;

    @OneToMany(mappedBy = "samochod", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Naprawa> naprawy;

    public Samochod() {}

    public Samochod(Long id, Klient wlasciciel, ModelSamochod model, Integer rokProdukcji, String numerRejestracyjny, List<Naprawa> naprawy) {
        this.id = id;
        this.model = model;
        this.wlasciciel = wlasciciel;
        this.rokProdukcji = rokProdukcji;
        this.numerRejestracyjny = numerRejestracyjny;
        this.naprawy = naprawy;
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

    public List<Naprawa> getNaprawy() {
        return naprawy;
    }

    public void setNaprawy(List<Naprawa> naprawy) {
        this.naprawy = naprawy;
    }
}
