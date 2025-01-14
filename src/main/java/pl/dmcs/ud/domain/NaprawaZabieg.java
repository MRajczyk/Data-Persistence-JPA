package pl.dmcs.ud.domain;

import jakarta.persistence.*;

@Entity
@Table(name="naprawa_zabieg")
public class NaprawaZabieg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idNaprawa;
    private Long idZabieg;

    public NaprawaZabieg() {}

    public NaprawaZabieg(Long id, Long idNaprawa, Long idZabieg) {
        this.id = id;
        this.idNaprawa = idNaprawa;
        this.idZabieg = idZabieg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdNaprawa() {
        return idNaprawa;
    }

    public void setIdNaprawa(Long idNaprawa) {
        this.idNaprawa = idNaprawa;
    }

    public Long getIdZabieg() {
        return idZabieg;
    }

    public void setIdZabieg(Long idZabieg) {
        this.idZabieg = idZabieg;
    }
}
