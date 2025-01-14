package pl.dmcs.ud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.dmcs.ud.domain.Naprawa;
import pl.dmcs.ud.service.NaprawaService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/naprawy")
        public class NaprawaController {
        private final NaprawaService naprawaService;

        public NaprawaController(NaprawaService naprawaService) {
    this.naprawaService = naprawaService;
}

@GetMapping("/pracownik/id/{id}")
        public ResponseEntity<List<Naprawa>> getNaprawyByPracownikId(@PathVariable Long id) {
    return ResponseEntity.ok(naprawaService.getNaprawyByPracownikId(id));
}

@GetMapping("/pracownik/imie/{imie}")
        public ResponseEntity<List<Naprawa>> getNaprawyByPracownikImie(@PathVariable String imie) {
    return ResponseEntity.ok(naprawaService.getNaprawyByPracownikImie(imie));
}

@GetMapping("/odbior/data/{data}")
        public ResponseEntity<List<Naprawa>> getNaprawyByFaktycznaDataOdbioru(@PathVariable String data) {
    LocalDate localDate = LocalDate.parse(data);
    return ResponseEntity.ok(naprawaService.getNaprawyByFaktycznaDataOdbioru(localDate));
}

@GetMapping("/samochod/model/{model}")
        public ResponseEntity<List<Naprawa>> getNaprawyBySamochodModel(@PathVariable String model) {
    return ResponseEntity.ok(naprawaService.getNaprawyBySamochodModel(model));
}
}
