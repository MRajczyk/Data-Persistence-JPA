package pl.dmcs.ud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dmcs.ud.domain.Samochod;

@Repository
public interface SamochodRepository extends JpaRepository<Samochod, Long> {}