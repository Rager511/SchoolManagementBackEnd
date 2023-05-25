package maailil.imad.controle.models;

import jakarta.persistence.*;

@Entity
public class ClasseImaMaa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCl;
    private String niveau;


    public ClasseImaMaa(int idCl, String niveau) {
        this.idCl = idCl;
        this.niveau=niveau;
    }

    public ClasseImaMaa() {

    }

    public int getIdCl() {
        return idCl;
    }

    public void setIdCl(int idCl) {
        this.idCl = idCl;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "ClasseImaMaa{" +
                "idCl=" + idCl +
                ", niveau='" + niveau + '\'' +
                '}';
    }
}


