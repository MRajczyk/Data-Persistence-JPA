package pl.dmcs.ud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dmcs.ud.domain.Zabieg;

@Repository
public interface ZabiegRepository extends JpaRepository<Zabieg, Long> {}