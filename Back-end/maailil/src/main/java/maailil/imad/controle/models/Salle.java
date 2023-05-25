package maailil.imad.controle.models;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero;
    private String libelle;
    @ManyToMany
    private List<Cours> salle;

    public Salle(int numero, String libelle, List<Cours> salle) {
        this.numero = numero;
        this.libelle = libelle;
        this.salle = salle;
    }

    public Salle() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Cours> getSalle() {
        return salle;
    }

    public void setSalle(List<Cours> salle) {
        this.salle = salle;
    }

    @Override
    public String toString() {
        return "Salle{" +
                "numero=" + numero +
                ", libelle='" + libelle + '\'' +
                ", Salle=" + salle +
                '}';
    }
}
