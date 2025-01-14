package pl.dmcs.ud.domain;

import jakarta.persistence.*;

@Entity
@Table(name="modele_samochodow")
public class ModelSamochod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "model_samochod_id")
    private Long id;
    private String name;
    private String model;

    public ModelSamochod() {}

    public ModelSamochod(Long id, String name, String model) {
        this.id = id;
        this.name = name;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}