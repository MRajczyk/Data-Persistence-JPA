package pl.dmcs.ud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dmcs.ud.domain.Pracownik;

@Repository
public interface PracownikRepository extends JpaRepository<Pracownik, Long> {}