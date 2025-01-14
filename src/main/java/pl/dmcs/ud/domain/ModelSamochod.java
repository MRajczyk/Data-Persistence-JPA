package pl.dmcs.ud.domain;

import jakarta.persistence.*;

@Entity
@Table(name="modele_samochodow")
public class ModelSamochod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marka;
    private String model;

    public ModelSamochod() {}

    public ModelSamochod(Long id, String name, String model) {
        this.id = id;
        this.marka = name;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String name) {
        this.marka = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}