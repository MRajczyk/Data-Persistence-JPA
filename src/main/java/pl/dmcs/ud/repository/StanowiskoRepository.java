package pl.dmcs.ud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dmcs.ud.domain.Stanowisko;

@Repository
public interface StanowiskoRepository extends JpaRepository<Stanowisko, Long> {}