package maailil.imad.controle.models;
import jakarta.persistence.*;


@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ide;
    @Column(length = 80,nullable = false)
    private String nom;
    @ManyToOne
    private ClasseImaMaa classe;

    public Etudiant(int ide, String nom) {
        this.ide = ide;
        this.nom =nom;
    }

    public Etudiant() {

    }

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ClasseImaMaa getClasse() {
        return classe;
    }

    public void setClasse(ClasseImaMaa classe) {
        this.classe = classe;
    }
}
