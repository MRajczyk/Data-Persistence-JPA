package pl.dmcs.ud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.dmcs.ud.domain.Naprawa;

import java.time.LocalDate;
import java.util.List;

public interface NaprawaRepository extends JpaRepository<Naprawa, Long> {

    @Query("SELECT n FROM Naprawa n JOIN n.listaPracownikow p WHERE p.id = :pracownikId")
    List<Naprawa> findAllByPracownikId(@Param("pracownikId") Long pracownikId);

    @Query("SELECT n FROM Naprawa n JOIN n.listaPracownikow p WHERE p.imie = :imie")
    List<Naprawa> findAllByPracownikImie(@Param("imie") String imie);

    @Query("SELECT n FROM Naprawa n WHERE FUNCTION('DATE', n.faktycznaDataOdbioru) = :data")
    List<Naprawa> findAllByFaktycznaDataOdbioru(@Param("data") LocalDate data);

    @Query("SELECT n FROM Naprawa n JOIN n.samochod s WHERE s.model.model = :model")
    List<Naprawa> findAllBySamochodModel(@Param("model") String model);
}
