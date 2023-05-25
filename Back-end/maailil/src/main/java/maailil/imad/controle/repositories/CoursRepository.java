package maailil.imad.controle.repositories;

import maailil.imad.controle.models.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepository extends JpaRepository<Cours,Integer> {

}
