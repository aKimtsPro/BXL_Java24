package be.digitalcity.java.exo.oo.banque;

import java.time.LocalDate;

public class Personne {

    private String prenom;
    private String nom;
    private final LocalDate dateNaiss;

    public Personne(String prenom, String nom, LocalDate dateNaiss) {
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaiss = dateNaiss;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }
}
