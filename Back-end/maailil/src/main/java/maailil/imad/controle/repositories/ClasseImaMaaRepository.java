package maailil.imad.controle.repositories;

import maailil.imad.controle.models.ClasseImaMaa;
import maailil.imad.controle.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClasseImaMaaRepository extends JpaRepository<ClasseImaMaa, Integer> {

    @Query("SELECT e FROM Etudiant e JOIN e.classe c WHERE c.idCl = :idClassImaMaa")
    List<Etudiant> getEtudiantsByClassId(@Param("idClassImaMaa") int idClassImaMaa);

    @Query("SELECT c FROM ClasseImaMaa c WHERE c.niveau = :niveau")
    List<ClasseImaMaa> getClasseImaMaaByNiveau(@Param("niveau") String niveau);

}