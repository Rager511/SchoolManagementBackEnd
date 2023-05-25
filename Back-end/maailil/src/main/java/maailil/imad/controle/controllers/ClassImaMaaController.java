package maailil.imad.controle.controllers;


import maailil.imad.controle.models.ClasseImaMaa;
import maailil.imad.controle.repositories.ClasseImaMaaRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
@CrossOrigin("http://localhost:3000")
public class ClassImaMaaController {
    @Autowired
    private ClasseImaMaaRepository classeRepository;

    @PostMapping
    public ResponseEntity<ClasseImaMaa> add(@RequestBody ClasseImaMaa classe) {
        classeRepository.save(classe);

        return ResponseEntity.ok(classe);
    }

    @GetMapping
    public List<ClasseImaMaa> get() { return classeRepository.findAll(); }

    @GetMapping("/niveau/{niveau}")
    public List<ClasseImaMaa> getAllByNiveau(@PathVariable String niveau) { return classeRepository.getClasseImaMaaByNiveau(niveau); }

    @DeleteMapping("/{idCl}")
    public void delete(@PathVariable int idCl) { classeRepository.deleteById(idCl); }

    @PutMapping("/{idCl}")
    public ResponseEntity<ClasseImaMaa> update(@RequestBody ClasseImaMaa classe) {
        ClasseImaMaa updateClasse = classeRepository.findById(classe.getIdCl())
                .orElseThrow(() -> new ResourceNotFoundException("La classe " + classe.getIdCl() + " n'existe pas!"));

        updateClasse.setNiveau(classe.getNiveau());

        classeRepository.save(updateClasse);

        return ResponseEntity.ok(updateClasse);
    }
}