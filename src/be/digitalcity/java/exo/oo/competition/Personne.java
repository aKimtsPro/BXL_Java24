package be.digitalcity.java.exo.oo.competition;

import java.time.LocalDate;

public abstract class Personne {

    private String prenom;
    private String nom;
    private LocalDate dateNaiss;

    Personne(String prenom, String nom, LocalDate dateNaiss) {
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaiss = dateNaiss;
    }

    void saluer(Personne aSaluer ){

        System.out.printf(
                "Bonjour %s, je m'appelle %s\n",
                aSaluer.getFullName(),
                this.getFullName()
        );

    }

    String getFullName(){
        if( this.nom == null )
            return this.prenom;

        return this.prenom + " " + this.nom;
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

    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
}
