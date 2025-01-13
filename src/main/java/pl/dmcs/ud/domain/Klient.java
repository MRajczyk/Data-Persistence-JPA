package pl.dmcs.ud.domain;

import jakarta.persistence.*;

@Entity
@Table(name="klienci")
public class Klient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
