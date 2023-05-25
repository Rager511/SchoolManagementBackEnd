package maailil.imad.controle.models;

import jakarta.persistence.*;


@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCo;
    private String titre;
    @ManyToOne
    private ClasseImaMaa classe;

    public Cours(int idCo, String titre) {
        this.idCo = idCo;
        this.titre=titre;
    }

    public Cours() {

    }

    public int getIdCo() {
        return idCo;
    }

    public void setIdCo(int idCo) {
        this.idCo = idCo;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public ClasseImaMaa getClasse() {
        return classe;
    }

    public void setClasse(ClasseImaMaa classe) {
        this.classe = classe;
    }


    @Override
    public String toString() {
        return "Cours{" +
                "idCo=" + idCo +
                ", titre='" + titre + '\'' +
                ", classe=" + classe +
                '}';
    }
}
