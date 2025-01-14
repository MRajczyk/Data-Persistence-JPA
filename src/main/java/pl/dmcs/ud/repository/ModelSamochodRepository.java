package pl.dmcs.ud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dmcs.ud.domain.ModelSamochod;

@Repository
public interface ModelSamochodRepository extends JpaRepository<ModelSamochod, Long> {}