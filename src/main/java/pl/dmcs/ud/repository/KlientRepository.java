package pl.dmcs.ud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dmcs.ud.domain.Klient;

@Repository
public interface KlientRepository extends JpaRepository<Klient, Long> {}