package pl.dmcs.ud.service;

import org.springframework.stereotype.Service;
import pl.dmcs.ud.domain.Naprawa;
import pl.dmcs.ud.repository.NaprawaRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class NaprawaService {
    private final NaprawaRepository naprawaRepository;

    public NaprawaService(NaprawaRepository naprawaRepository) {
        this.naprawaRepository = naprawaRepository;
    }

    public List<Naprawa> getNaprawyByPracownikId(Long pracownikId) {
        return naprawaRepository.findAllByPracownikId(pracownikId);
    }

    public List<Naprawa> getNaprawyByPracownikImie(String imie) {
        return naprawaRepository.findAllByPracownikImie(imie);
    }

    public List<Naprawa> getNaprawyByFaktycznaDataOdbioru(LocalDate data) {
        return naprawaRepository.findAllByFaktycznaDataOdbioru(data);
    }

    public List<Naprawa> getNaprawyBySamochodModel(String model) {
        return naprawaRepository.findAllBySamochodModel(model);
    }
}
